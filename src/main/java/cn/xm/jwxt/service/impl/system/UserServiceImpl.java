package cn.xm.jwxt.service.impl.system;

import cn.xm.jwxt.bean.system.User;
import cn.xm.jwxt.bean.system.UserExample;
import cn.xm.jwxt.mapper.system.UserMapper;
import cn.xm.jwxt.mapper.system.custom.UserCustomMapper;
import cn.xm.jwxt.service.system.UserService;
import cn.xm.jwxt.utils.RedisUtil;
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
    private RedisUtil redisUtil;//手动加缓存的工具类

    @Override
    public boolean addUser(User user) throws SQLException {
        user=new User();
        user.setPassword("qqq");
        user.setUsercode("111");
        user.setUsername("qqq");
        user.setUserid("10");
        userMapper.insert(user);
//       模拟制作Exception
        int i=1/0;
        return true;
    }

    @Override
    public boolean deleteUserByUsercode(String usercode) throws SQLException {
        return false;
    }

    @CacheEvict(value = "user",key = "'user_'+#usercode.toString()")
    @Override
    public boolean updateUserByUserCode(String usercode,String username) throws SQLException {
        return userCustomMapper.updateUserByUsercode(usercode,username)>0;
    }

    @Override
    @Cacheable(value = "user",key = "'user_'+#userCode.toString()")//注解到添加到缓存中
    public User findUserByUsercode(String userCode) throws SQLException {
        System.out.printf("打印这个则证明进来方法了");
        return userCustomMapper.getUserByUsercode(userCode);
    }

    @Cacheable(value = "users")//注解添加到缓存中
    @Override
    public List<User> findAllUserByCondition(Map condition) throws SQLException {
        System.out.printf("打印这个则证明进来方法了");
        return userCustomMapper.getUserByCondition(condition);
    }


}
