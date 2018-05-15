package cn.xm.jwxt.service.impl.system;

import cn.xm.jwxt.bean.system.Permission;
import cn.xm.jwxt.mapper.system.custom.PermissionCustomMapper;
import cn.xm.jwxt.service.system.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.ws.soap.Addressing;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description 权限服务Impl
 * @Date: 16:16 2018/5/11
 */
@Service
@Transactional
public class PermissionServiceImpl implements PermissionService{
    @Autowired
    private PermissionCustomMapper permissionCustomMapper;
    @Override
    public List<Map<String, Object>> getPermissionTree() throws SQLException {
        return permissionCustomMapper.getPermissionTree();
    }

    @Override
    public List<Map<String, Object>> getPermissionTree4Role() throws SQLException {
        return permissionCustomMapper.getPermissionTree4Role();
    }

    @Override
    public List<Permission> getPermissionByCondition(Map<String, Object> condition) throws SQLException {
        return permissionCustomMapper.getPermissionByCondition(condition);
    }

    @Override
    public boolean updatePermissionStatusById(String permissionId, String newStatus) throws SQLException {
        return permissionCustomMapper.updatePermissionStatusById(permissionId,newStatus)>0?true:false;
    }
}
