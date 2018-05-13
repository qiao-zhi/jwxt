package cn.xm.jwxt.service.impl.system;

import cn.xm.jwxt.bean.system.User;
import cn.xm.jwxt.bean.system.UserExample;
import cn.xm.jwxt.bean.system.UserRole;
import cn.xm.jwxt.bean.system.UserRoleExample;
import cn.xm.jwxt.mapper.system.UserMapper;
import cn.xm.jwxt.mapper.system.UserRoleMapper;
import cn.xm.jwxt.mapper.system.custom.UserCustomMapper;
import cn.xm.jwxt.service.system.UserService;
import cn.xm.jwxt.utils.RedisUtil;
import cn.xm.jwxt.utils.UUIDUtil;
import cn.xm.jwxt.utils.ValidateCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description
 * @Date: 11:45 2018/3/25
 */
@Service
@SuppressWarnings("all")
@Transactional//事务注解
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Autowired
    private UserCustomMapper userCustomMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private RedisUtil redisUtil;//手动加缓存的工具类

    @Override
    public int selectUserCountByUserCode(String userCode) throws SQLException {
        return userCustomMapper.selectUserCountByUserCode(userCode);
    }

    @Override
    public boolean addUser(User user) throws SQLException {
        //如果编号为空就UUID生成一个
        if(ValidateCheck.isNull(user.getUserid())){
            user.setUserid(UUIDUtil.getUUID2());
        }
        //1.判断数据库中是否已经存在相同userCode的数据
        int i = this.selectUserCountByUserCode(user.getUsercode());
        if(i > 0){
            return false;
        }
        //2.当不存在才进行添加数据库操作
        return userMapper.insert(user)>0?true:false;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return userMapper.updateByPrimaryKeySelective(user)>0?true:false;
    }

    @Override
    public List<Map<String, Object>> getUsersByCondition(Map condition) throws SQLException {
        return userCustomMapper.getUsersByCondition(condition);
    }

    @Override
    public List<Map<String, Object>> getUserRoleByUserId(String userId) throws SQLException {
        return userCustomMapper.getUserRoleByUserId(userId);
    }

    @Override
    public boolean deleteUserBatch(String[] ids) throws SQLException {
        UserRoleExample example_1 = null;
        UserRoleExample.Criteria criteria_1 = null;
        for(String userId :ids ){
            //1.遍历集合删掉userrole表
            example_1 =  new UserRoleExample();
            criteria_1 = example_1.createCriteria();
            criteria_1.andUseridEqualTo(userId);
            userRoleMapper.deleteByExample(example_1);
            //2.遍历集合删掉user表
            userMapper.deleteByPrimaryKey(userId);
        }
        return true;
    }

    @Override
    public boolean setUserRoleBatch(String[] userIds, String[] roleIds) throws SQLException {
        UserRoleExample example_1 = null;
        UserRoleExample.Criteria criteria_1 = null;
        UserRole userRole = null;//需要添加的userrole
        for(String userId :userIds){
            //1. 根据用户ID先删除用户角色信息
            example_1 =  new UserRoleExample();
            criteria_1 = example_1.createCriteria();
            criteria_1.andUseridEqualTo(userId);
            userRoleMapper.deleteByExample(example_1);
            //2.遍历角色数组重新添加userrole
            for (String roleId : roleIds){
                userRole = new UserRole();
                userRole.setRoleid(roleId);
                userRole.setUserid(userId);
                userRoleMapper.insert(userRole);
            }

        }
        return true;
    }

}
