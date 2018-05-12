package cn.xm.jwxt.controller.system;

import cn.xm.jwxt.bean.system.Role;
import cn.xm.jwxt.service.system.RoleService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description 角色Controller
 * @Date: 9:58 2018/5/12
 */
@RestController
@RequestMapping("/role")
public class RoleController {
    private Logger logger = Logger.getLogger(RoleController.class);//日志记录器
    @Autowired
    private RoleService roleService;

    /**
     * 添加角色
     * @param role  界面反射自动封装的bean
     * @return
     */
    @RequestMapping("/addRole")
    public String addRole(Role role){
        String result = null;
        try {
            result = roleService.addRole(role)?"添加成功":"添加失败";
        } catch (SQLException e) {
            logger.error("添加角色出错",e);
            return "添加失败";
        }
        return result;
    }

    /**
     * 分页查询培养方案基本信息
     * @param condition 自动映射的查询条件
     * @return  分页信息
     */
    @RequestMapping("/getRoleFY")
    public PageInfo<Map<String,Object>> getRoleFY(@RequestParam Map condition){
        int pageNum = 1;
        if(ValidateCheck.isNotNull((String) condition.get("pageNum"))){ //如果不为空的话改变当前页号
            pageNum = Integer.parseInt((String) condition.get("pageNum"));
        }
        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String) condition.get("pageSize"))){ //如果不为空的话改变当前页大小
            pageSize = Integer.parseInt((String) condition.get("pageSize"));
        }
        //开始分页
        PageHelper.startPage(pageNum,pageSize);
        List<Map<String, Object>> roleFy = null;
        try {
            roleFy =  roleService.getRolesByCondition(condition);
        } catch (SQLException e) {
            logger.error("分页查询角色信息出错",e);
            return null;
        }
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<Map<String,Object>>(roleFy);
        return pageInfo;
    }


    @RequestMapping("/getRolepermission")
    public List<Map<String, Object>> getRolePermissionByRoleId(@RequestParam(defaultValue = "1") String roleId){
        List<Map<String, Object>> rolepermissions = null;
        try {
            rolepermissions = roleService.getRolePermissionByRoleId(roleId);
        } catch (SQLException e) {
            logger.error("查询角色权限出错",e);
            return null;
        }
        return rolepermissions;
    }

    @RequestMapping("/deleteRoleBatch")
    public String deleteRoleBatch(@RequestParam(defaultValue = "1,1") String roleIds){
        //1.分割转为数组
        String[] split = roleIds.split(",");
        List<String> ids = Arrays.asList(split);
        //2.调用service进行删除
        String result = null;
        try {
            result = roleService.deleteRoleBatch(ids)?"删除成功":"删除失败";
        } catch (SQLException e) {
            logger.error("删除角色出错",e);
            return "删除失败";
        }
        return result;
    }

    /**
     * 添加角色
     * @param role  界面反射自动封装的bean
     * @return
     */
    @RequestMapping("/updateRole")
    public String updateRole(Role role){
        String result = null;
        try {
            result = roleService.updateRole(role)?"修改成功":"修改失败";
        } catch (SQLException e) {
            logger.error("修改角色出错",e);
            return "修改失败";
        }
        return result;
    }

    @RequestMapping("/addRolePermissionByRoleId")
    public String addRolePermissionByRoleId(@RequestParam(defaultValue = "1") String roleId,@RequestParam(defaultValue = "xxx") String permissionIds){
        //1.拆分角色编号为数组
        String[] perIds = permissionIds.split(",");
        //2.调用service进行添加
        String result = null;
        try {
            result = roleService.addRolePermissionByRoleId(roleId, perIds)?"添加成功":"添加失败";
        } catch (SQLException e) {
            logger.error("分配角色权限失败",e);
            return "添加失败";
        }
        return result;
    }

}
