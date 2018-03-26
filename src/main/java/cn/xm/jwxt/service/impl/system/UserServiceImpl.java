package cn.xm.jwxt.service.impl.system;

import cn.xm.jwxt.bean.system.User;
import cn.xm.jwxt.bean.system.UserExample;
import cn.xm.jwxt.mapper.system.UserMapper;
import cn.xm.jwxt.service.system.UserService;
import cn.xm.jwxt.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: qlq
 * @Description
 * @Date: 11:45 2018/3/25
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Autowired
    private RedisUtil redisUtil;//手动加缓存的工具类
    @Override
    public User findUserById(String userId) throws SQLException {
        redisUtil.sSet("testKey","testValue");//手动添加一个缓存到redis
        return userMapper.selectByPrimaryKey(userId);
    }

    @Cacheable(value = "user")//添加到缓存中
    @Override
    public List<User> findAllUser() throws SQLException {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        return userMapper.selectByExample(userExample);//查询所有用户
    }

}
