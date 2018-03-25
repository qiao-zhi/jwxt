package cn.xm.jwxt.service.system;

import cn.xm.jwxt.bean.system.User;

import java.sql.SQLException;

/**
 * @Author: qlq
 * @Description
 * @Date: 11:44 2018/3/25
 */
public interface UserService {
    /**
     * 通过ID查询用户
     * @param userId    用户ID
     * @return  用户
     * @throws SQLException
     */
    public User findUserById(String userId)throws SQLException;
}
