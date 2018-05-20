package cn.xm.jwxt.service.impl.system;

import cn.xm.jwxt.annotation.MyLogAnnotation;
import cn.xm.jwxt.bean.baseInfo.TStudentBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TStudentBaseInfoExample;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfoExample;
import cn.xm.jwxt.bean.system.*;
import cn.xm.jwxt.bean.trainScheme.TTeachingprogramInfoExample;
import cn.xm.jwxt.mapper.baseInfo.TStudentBaseInfoMapper;
import cn.xm.jwxt.mapper.baseInfo.TTeacherBaseInfoMapper;
import cn.xm.jwxt.mapper.system.UserMapper;
import cn.xm.jwxt.mapper.system.UserRoleMapper;
import cn.xm.jwxt.mapper.system.custom.UserCustomMapper;
import cn.xm.jwxt.service.system.UserService;
import cn.xm.jwxt.utils.RedisUtil;
import cn.xm.jwxt.utils.UUIDUtil;
import cn.xm.jwxt.utils.ValidateCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.*;

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

    @Autowired
    private TStudentBaseInfoMapper tStudentBaseInfoMapper;
    @Autowired
    private TTeacherBaseInfoMapper tTeacherBaseInfoMapper;

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
    public User getUserByUserCode(String userCode) throws SQLException {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsercodeEqualTo(userCode);
        List<User> users = userMapper.selectByExample(userExample);
        if(users == null || users.size() == 0){
            return null;
        }
        return users.get(0);
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

    @Override
    public List<Permission> selectPermissionsByUserId(String userId) throws SQLException {
        return userCustomMapper.selectPermissionsByUserId(userId);
    }

    @Override
    public List<Permission> getUserPermissionsByCondition(Map condition) throws SQLException {
        return userCustomMapper.getUserPermissionsByCondition(condition);
    }

    @Override
    public Map<String, Object> getUserLoginInfo(String usercode, String password, String usersort) throws SQLException {
        Map<String,Object> result= new HashMap<String,Object>();
        String loginInfo = null;//登录信息
        List<Permission> permissions = null;//所有权限
        Set<String> permissionCodes = null;//所有权限码
        //1.进行登录(分别根据usercode，password，usersort进行判断)
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsercodeEqualTo(usercode);
        List<User> users = userMapper.selectByExample(userExample);
        //1.1判断账户
        if(users == null || users.size()==0){
            loginInfo = "账户不存在!";
            result.put("loginInfo",loginInfo);
            return result;
        }
        User user = users.get(0);
        //1.2判断密码
        String password_sql = user.getPassword();
        if(password_sql == null || !password_sql.equals(password)){
            loginInfo = "密码错误!";
            result.put("loginInfo",loginInfo);
            return result;
        }
        //1.3 判断类型
        String usersort_sql = user.getUsersort();
        if(usersort_sql == null || !usersort_sql.equals(usersort)){
            loginInfo = "账户类型错误!";
            result.put("loginInfo",loginInfo);
            return result;
        }
        //1.4判断账户状态
        String userStatus_sql = user.getIsuse();
        if(userStatus_sql == null || userStatus_sql.equals("0")){
            loginInfo = "账户已锁定，请联系管理员开启账户!";
            result.put("loginInfo",loginInfo);
            return result;
        }
        //2.查询该用户的所有的权限List<Permission> permissions
        permissions = this.selectPermissionsByUserId(user.getUserid());
        if(permissions == null || permissions.size() == 0){
            loginInfo = "该账户还没有任何权限，请联系管理员分配权限!";
            result.put("loginInfo",loginInfo);
            return result;
        }
        //3.提取该用户的所有的权限码Set<String> permissionCodes
        permissionCodes = new HashSet<>();
        for(Permission permission:permissions){
            if(ValidateCheck.isNotNull(permission.getPermissioncode())){
                permissionCodes.add(permission.getPermissioncode());
            }
        }
        //4.提取该用户所有的菜单:
        Map condition = new HashMap();
        condition.put("userId",user.getUserid());
        condition.put("menu","1");
        List<Permission> menus = this.getUserPermissionsByCondition(condition);
        //5.将登录信息设为登录成功
        loginInfo = "登录成功";
        result.put("loginInfo",loginInfo);
        user.setPermissions(permissions);//所有权限
        user.setPermissionCodes(permissionCodes);//所有权限码
        user.setMenuPermissions(menus);//所有菜单权限
        result.put("user",user);
        return result;
    }

    @MyLogAnnotation(operateDescription = "成功登录系统")
    @Override
    public void logSuccess(){

    }

    @Override
    public String getuserIdByUser(User user) throws SQLException {
        String userType = user.getUsersort();//获取用户类型
        if(ValidateCheck.isNull(userType)){
            return "";
        }
        //1.如果是学生查询学生表返回主键
        if("学生".equals(userType)){
            TStudentBaseInfoExample example = new TStudentBaseInfoExample();
            TStudentBaseInfoExample.Criteria criteria = example.createCriteria();
            criteria.andStudentnumEqualTo(user.getUsercode());//根据学生编号查询
            List<TStudentBaseInfo> tStudentBaseInfos = tStudentBaseInfoMapper.selectByExample(example);
            return  tStudentBaseInfos.get(0).getStudentid();
        }
        //2.如果是老师查询老师表返回主键
        if("教师".equals(userType)){
            TTeacherBaseInfoExample example = new TTeacherBaseInfoExample();
            TTeacherBaseInfoExample.Criteria criteria = example.createCriteria();
            criteria.andTeacheridEqualTo(user.getUsercode());//根据学生编号查询
            List<TTeacherBaseInfo> tTeacherBaseInfos = tTeacherBaseInfoMapper.selectByExample(example);
            if(tTeacherBaseInfos == null || tTeacherBaseInfos.size() == 0){
                return "";
            }
            return  tTeacherBaseInfos.get(0).getTeacherid();
        }
        return "";
    }

    /******S   ***************/



}
