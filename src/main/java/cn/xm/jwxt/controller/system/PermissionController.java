package cn.xm.jwxt.controller.system;

import cn.xm.jwxt.bean.system.Permission;
import cn.xm.jwxt.service.system.PermissionService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


/**
 * @Author: qlq
 * @Description 权限控制器
 * @Date: 16:27 2018/5/11
 */
@RestController
@RequestMapping("/permission")
public class PermissionController {
    private Logger logger = Logger.getLogger(PermissionController.class);
    @Autowired
    private PermissionService permissionService;

    /**
     * 获取权限树
     * @return
     */
    @RequestMapping("/getPermissionTree")
    public List<Map<String,Object>> getPermissionTree(){
        List<Map<String, Object>> permissionTree = null;
        try {
            permissionTree  = permissionService.getPermissionTree();
        } catch (SQLException e) {
            logger.error("查询权限树出错",e);
        }
        return permissionTree;
    }



    /**
     * 获取权限树
     * @return
     */
    @RequestMapping("/getPermissionTree4Role")
    public List<Map<String,Object>> getPermissionTree4Role(){
        List<Map<String, Object>> permissionTree = null;
        try {
            permissionTree  = permissionService.getPermissionTree4Role();
        } catch (SQLException e) {
            logger.error("查询权限树出错",e);
        }
        return permissionTree;
    }


    /**
     * 分页查询权限信息
     * @param condition
     * @return
     */
    @Cacheable(value = "permissionFY")//添加到redis缓存
    @RequestMapping("/getPermissionByCondition")
    public PageInfo<Permission> getPermissionByCondition(@RequestParam Map<String,Object> condition){
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
        List<Permission> permissions = null;
        try {
            permissions = permissionService.getPermissionByCondition(condition);
        } catch (SQLException e) {
            logger.error("分页查询信息权限",e);
            return null;
        }
        PageInfo<Permission> pageInfo = new PageInfo<Permission>(permissions);
        return pageInfo;
    }


    /**
     * 修改权限状态
     * @param permissionId  权限ID
     * @param newStatus 权限状态
     * @return
     */
    @CacheEvict(value = "permissionFY",allEntries = true)//清空缓存
    @RequestMapping("/updatePermission")
    public String updatePermissionStatusById(@RequestParam(defaultValue = "1")String permissionId,@RequestParam(defaultValue = "1")String newStatus){
        String result = null;
        try {
            result =  permissionService.updatePermissionStatusById(permissionId, newStatus)?"修改成功":"修改失败";
        } catch (SQLException e) {
            logger.error("修改权限状态失败",e);
            return "修改失败";
        }
        return result;
    }


}
