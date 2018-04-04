package cn.xm.jwxt.service.system;

import cn.xm.jwxt.bean.system.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description
 * @Date: 11:44 2018/3/25
 */
public interface UserService {
    /**增加用户
     * @param user
     * @return
     * @throws SQLException
     */
    public boolean addUser(User user)throws SQLException;
    /**
     * 删除用户(根据usercode删除用户)
     * @param usercode
     * @return
     * @throws SQLException
     */
    public boolean deleteUserByUsercode(String usercode)throws SQLException;

    /**
     *
     * @param usercode
     * @param username
     * @return
     * @throws SQLException
     */
    public boolean updateUserByUserCode(String usercode,String username)throws SQLException;
    /**
     * 通过ID查询用户
     * @param userCode    用户ID
     * @return  用户
     * @throws SQLException
     */
    public User findUserByUsercode(String userCode)throws SQLException;

    /**
     * 查询所有用户
     * @return
     * @throws SQLException
     */
    public List<User> findAllUserByCondition(Map condition)throws SQLException;

}
