package cn.xm.jwxt.service.system;

import cn.xm.jwxt.bean.system.Permission;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description 权限Service
 * @Date: 16:02 2018/5/11
 */
public interface PermissionService {
    /**
     * 获取权限树
     * @return  树的集合
     * @throws SQLException
     */
    public List<Map<String,Object>> getPermissionTree()throws SQLException;

    /**
     * 获取权限树(用于给角色设置权限)
     * @return  树的集合
     * @throws SQLException
     */
    public List<Map<String,Object>> getPermissionTree4Role()throws SQLException;
    /**
     * 分页查询权限信息
     * @param condition 组合条件
     * @return  权限信息
     * @throws SQLException
     */
    public List<Permission> getPermissionByCondition(Map<String,Object> condition)throws SQLException;

    /**
     * 修改权限状态
     * @param permissionId  权限编号
     * @param newStatus 新的状态
     * @return
     * @throws SQLException
     */
    public boolean updatePermissionStatusById(String permissionId,String newStatus)throws SQLException;

}
