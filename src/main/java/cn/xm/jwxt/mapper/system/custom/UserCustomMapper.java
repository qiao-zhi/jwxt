package cn.xm.jwxt.mapper.system.custom;

import cn.xm.jwxt.bean.system.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description
 * @Date: 12:03 2018/4/3
 */
public interface UserCustomMapper {
    /**
     *
     * @分页查询用户信息param condition 包装查询条件
     * @return  用户集合
     * @throws SQLException 可能抛出的SQL异常
     */
    public List<User> getUserByCondition(Map condition)throws SQLException;

    /**
     * 根据Usercode查询用户信息
     * @param userCode
     * @return
     * @throws SQLException
     */
    @Select("select * from user where usercode = #{usercode}")
    public User getUserByUsercode(@Param("usercode") String userCode)throws  SQLException;


    public int updateUserByUsercode(@Param("usercode") String userCode,@Param("username") String username)throws  SQLException;

}
