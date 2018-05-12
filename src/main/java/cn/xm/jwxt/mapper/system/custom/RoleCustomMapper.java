package cn.xm.jwxt.mapper.system.custom;

import cn.xm.jwxt.bean.system.Role;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description 角色手写dao
 * @Date: 11:01 2018/5/12
 */
public interface RoleCustomMapper {

    /**
     * 分页组合条件查询角色信息查询
     * @param condition 组合条件
     * @return
     * @throws SQLException
     */
    public List<Role> getRoleByCondition(Map<String,Object> condition)throws SQLException;

    /**
     * 分页组合条件查询角色信息（多一列是否已经配置角色）
     * @param condition 组合条件
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> getRolesByCondition(Map condition)throws SQLException;

    /**
     * 根据角色编号查询角色权限信息
     * @param roleId
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> getRolePermissionByRoleId(@Param("roleId") String roleId)throws SQLException;

    /**
     * 批量删除角色(将isUse置为0)
     * @param roleIds   角色ID集合
     * @return
     * @throws SQLException
     */
    public int deleteRoleBatch(List<String> roleIds)throws SQLException;


}
