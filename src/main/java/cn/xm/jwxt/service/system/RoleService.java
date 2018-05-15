package cn.xm.jwxt.service.system;

import cn.xm.jwxt.bean.system.Role;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description 角色Service
 * @Date: 9:54 2018/5/12
 */
public interface RoleService {
    /**
     * 添加角色
     * @param role
     * @return
     * @throws SQLException
     */
    public boolean addRole(Role role)throws SQLException;

    /**
     * 分页组合条件查询角色信息（多一列是否已经配置角色）
     * @param condition 组合条件
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> getRolesByCondition(Map condition)throws SQLException;

    /**
     * 查询所有启用的和未删除的角色
     * @return
     * @throws SQLException
     */
    public List<Role> getAllRolesIsUse()throws SQLException;


    /**
     * 根据角色编号查询角色权限信息
     * @param roleId
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> getRolePermissionByRoleId(String roleId)throws SQLException;

    /**
     * 批量删除角色(将isUse置为0)
     * @param roleIds   角色ID集合
     * @return
     * @throws SQLException
     */
    public boolean deleteRoleBatch(List<String> roleIds)throws SQLException;

    /**
     * 修改角色
     * @param role
     * @return
     * @throws SQLException
     */
    public boolean updateRole(Role role)throws SQLException;

    /**
     * 给角色批量添加权限
     * @param roleId    角色编号
     * @param permissionIds 权限编号数组
     * @return
     * @throws SQLException
     */
    public boolean addRolePermissionByRoleId(String roleId,String[] permissionIds)throws SQLException;


}
