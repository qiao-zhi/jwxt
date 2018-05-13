package cn.xm.jwxt.service.system;

import cn.xm.jwxt.bean.system.User;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description
 * @Date: 11:44 2018/3/25
 */
public interface UserService {


    /**
     * 根据UserCode
     * 判断当前账户是否已经存在，用于验证添加不可重复的userCode
     * (如果是0则证明账户不存在，可以添加；否则不能添加)
     * @param userCode
     * @return
     * @throws SQLException
     */
    public int selectUserCountByUserCode(String userCode)throws SQLException;

    /**
     * 增加用户
     *
     * @param user
     * @return
     * @throws SQLException
     */
    public boolean addUser(User user) throws SQLException;


    /**
     * 增加用户
     *
     * @param user
     * @return
     * @throws SQLException
     */
    public boolean updateUser(User user) throws SQLException;

    /**
     * @return 用户集合
     * @throws SQLException 可能抛出的SQL异常
     * @分页查询用户信息param condition 包装查询条件
     */
    public List<Map<String, Object>> getUsersByCondition(Map condition) throws SQLException;


    /**
     * 根据用户信息查看用户角色信息
     * @param userId
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> getUserRoleByUserId(String userId)throws SQLException;

    /**
     * 批量删除用户
     * @param ids   用户id集合
     * @return
     * @throws SQLException
     */
    public boolean deleteUserBatch(String[] ids)throws SQLException;

    /**
     * 批量设置用户角色
     * @param userIds   用户ID集合(根据这个集合删除用户)
     * @param roleIds   角色ID集合(删除完成之后需要重新添加的角色ID集合)
     * @return
     * @throws SQLException
     */
    public boolean setUserRoleBatch(String []userIds,String []roleIds)throws SQLException;


}
