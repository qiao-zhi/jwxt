package cn.xm.jwxt.service.impl.system;

import cn.xm.jwxt.bean.system.User;
import cn.xm.jwxt.mapper.system.UserMapper;
import cn.xm.jwxt.service.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;

/**
 * @Author: qlq
 * @Description
 * @Date: 11:45 2018/3/25
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User findUserById(String userId) throws SQLException {
        return userMapper.selectByPrimaryKey(userId);
    }
}
