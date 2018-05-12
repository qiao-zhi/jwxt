package cn.xm.jwxt.service.impl.system;

import cn.xm.jwxt.bean.system.Role;
import cn.xm.jwxt.bean.system.Rolepermission;
import cn.xm.jwxt.bean.system.RolepermissionExample;
import cn.xm.jwxt.mapper.system.RoleMapper;
import cn.xm.jwxt.mapper.system.RolepermissionMapper;
import cn.xm.jwxt.mapper.system.custom.RoleCustomMapper;
import cn.xm.jwxt.service.system.RoleService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.UUIDUtil;
import cn.xm.jwxt.utils.ValidateCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.ws.soap.Addressing;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description
 * @Date: 9:55 2018/5/12
 */
@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RolepermissionMapper rolepermissionMapper;
    @Autowired
    private RoleCustomMapper roleCustomMapper;
    @Override
    public boolean addRole(Role role) throws SQLException {
        //如果编号为空就设置一个新的编号
        if(ValidateCheck.isNull(role.getRoleid())){
            role.setRoleid(UUIDUtil.getUUID2());
        }
        //如果是否在用默认设置为1
        if(ValidateCheck.isNull(role.getIsuse())){
            role.setIsuse(DefaultValue.IS_USE);
        }
        return roleMapper.insert(role)>0?true:false;
    }

    @Override
    public List<Map<String, Object>> getRolesByCondition(Map condition) throws SQLException {
        return roleCustomMapper.getRolesByCondition(condition);
    }

    @Override
    public List<Map<String, Object>> getRolePermissionByRoleId(String roleId) throws SQLException {
        return roleCustomMapper.getRolePermissionByRoleId(roleId);
    }

    @Override
    public boolean deleteRoleBatch(List<String> roleIds) throws SQLException {
        return roleCustomMapper.deleteRoleBatch(roleIds)>0?true:false;
    }

    @Override
    public boolean updateRole(Role role) throws SQLException {
        return roleMapper.updateByPrimaryKeySelective(role)>0?true:false;
    }

    @Override
    public boolean addRolePermissionByRoleId(String roleId, String[] permissionIds) throws SQLException {
        //1.根绝角色编号删除角色权限表
        RolepermissionExample example = new RolepermissionExample();
        RolepermissionExample.Criteria criteria = example.createCriteria();
        criteria.andRoleidEqualTo(roleId);
        rolepermissionMapper.deleteByExample(example);
        //2.重新添加
        Rolepermission rolepermission = null;
        for (String permissionId : permissionIds){
            rolepermission = new Rolepermission();
            rolepermission.setRoleid(roleId);
            rolepermission.setPermissionid(permissionId);
            rolepermissionMapper.insert(rolepermission);
        }
        return true;
    }
}
