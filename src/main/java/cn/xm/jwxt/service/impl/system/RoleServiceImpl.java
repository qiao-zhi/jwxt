package cn.xm.jwxt.service.impl.system;

import cn.xm.jwxt.bean.system.*;
import cn.xm.jwxt.mapper.system.RoleMapper;
import cn.xm.jwxt.mapper.system.RolepermissionMapper;
import cn.xm.jwxt.mapper.system.UserRoleMapper;
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
    private UserRoleMapper userRoleMapper;
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
    public List<Role> getAllRolesIsUse() throws SQLException {
        RoleExample example = new RoleExample();
        RoleExample.Criteria criteria = example.createCriteria();
        criteria.andIsuseEqualTo(DefaultValue.IS_USE);//正在使用的(未删除的)
        criteria.andRolestatusEqualTo("1");//启用的
        return roleMapper.selectByExample(example);
    }

    @Override
    public List<Map<String, Object>> getRolePermissionByRoleId(String roleId) throws SQLException {
        return roleCustomMapper.getRolePermissionByRoleId(roleId);
    }

    @Override
    public boolean deleteRoleBatch(List<String> roleIds) throws SQLException {
        UserRoleExample example_1 = null;
        RolepermissionExample example_2 = null;
        UserRoleExample.Criteria criteria_1 = null;
        RolepermissionExample.Criteria criteria_2 = null;
        for(String roleId : roleIds){
            //1.根据角色ID删除userRole表
            example_1 = new UserRoleExample();
            criteria_1 = example_1.createCriteria();
            criteria_1.andRoleidEqualTo(roleId);
            userRoleMapper.deleteByExample(example_1);
            //2.根据角色ID删除rolePermission表
            example_2 = new RolepermissionExample();
            criteria_2 = example_2.createCriteria();
            criteria_2.andRoleidEqualTo(roleId);
            rolepermissionMapper.deleteByExample(example_2);
            //3.删除role自己
            roleMapper.deleteByPrimaryKey(roleId);
        }
        return true;
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
