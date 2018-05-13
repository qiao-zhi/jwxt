package cn.xm.jwxt.mapper.system.custom;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

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
     * @return 用户集合
     * @throws SQLException 可能抛出的SQL异常
     * @分页查询用户信息param condition 包装查询条件
     */
    public List<Map<String, Object>> getUsersByCondition(Map condition) throws SQLException;

    /**
     * 根据用户信息查看用户角色信息
     *
     * @param userId
     * @return
     * @throws SQLException
     */
    @Select("SELECT * FROM role WHERE roleid IN(SELECT roleid  FROM user_role WHERE userid =#{userId})")
    public List<Map<String, Object>> getUserRoleByUserId(@Param("userId") String userId) throws SQLException;

    /**
     * 根据UserCode 判断当前账户是否已经存在，用于验证添加不可重复的userCode
     * @param userCode
     * @return
     * @throws SQLException
     */
    @Select("select count(userId) from user where userCode=#{userCode}")
    public int selectUserCountByUserCode(@Param("userCode") String userCode)throws SQLException;
}
