package cn.xm.jwxt.controller.system;

import cn.xm.jwxt.bean.system.User;
import cn.xm.jwxt.service.system.UserService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    private Logger logger = Logger.getLogger(UserController.class);//日志记录器
    @Autowired
    private UserService userService;


    /**
     * 根据UserCode
     * 判断当前账户是否已经存在，用于验证添加不可重复的userCode
     * (如果是0则证明账户不存在，可以添加；否则不能添加)
     * @param userCode
     * @return
     * @throws SQLException
     */
    @RequestMapping("/selectUserCountByUserCode")
    public int selectUserCountByUserCode(@RequestParam(defaultValue = "1") String userCode){
        try {
            return userService.selectUserCountByUserCode(userCode);
        } catch (SQLException e) {
            logger.error("根据usercode查询总数出错",e);
            return 1;
        }
    }

    /**
     * 添加单个用户的操作
     *
     * @param user ()
     * @return
     */
    @RequestMapping("/addUser")
    public String addUser(User user) {
        String result = null;
        try {
            result = userService.addUser(user) ? "添加成功" : "添加失败";
        } catch (SQLException e) {
            logger.error("添加用户出错", e);
            return "添加失败";
        }
        return result;
    }


    /**
     * 修改单个用户的操作
     *
     * @param user ()
     * @return
     */
    @RequestMapping("/updateUser")
    public String updateUser(User user) {
        String result = null;
        try {
            result = userService.updateUser(user) ? "修改成功" : "修改失败";
        } catch (SQLException e) {
            logger.error("修改用户出错", e);
            return "修改失败";
        }
        return result;
    }



    /**
     * 分页查询用户信息
     * @param condition 自动映射的查询条件
     * @return  分页信息
     */
    @RequestMapping("/getUserFY")
    public PageInfo<Map<String,Object>> getUserFY(@RequestParam Map condition){
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
        List<Map<String, Object>> userFy = null;
        try {
            userFy =  userService.getUsersByCondition(condition);
        } catch (SQLException e) {
            logger.error("分页查询角色信息出错",e);
            return null;
        }
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<Map<String,Object>>(userFy);
        return pageInfo;
    }

    /**
     * 根据用户ID查询该用户的所有角色
     * @param userId
     * @return
     */
    @RequestMapping("/getUserRoleByUserId")
    public List<Map<String, Object>> getUserRoleByUserId(@RequestParam(defaultValue = "1") String userId){
        List<Map<String, Object>> userRoleByUserId = null;
        try {
            userRoleByUserId = userService.getUserRoleByUserId(userId);
        } catch (SQLException e) {
            logger.error("根据userid查询role出错",e);
            return null;
        }
        return userRoleByUserId;
    }

    /**
     * 批量删除用户
     * @param userIds 用户ID集合数组
     * @return
     */
    @RequestMapping("/deleteUserBatch")
    public String deleteUserBatch(@RequestParam(defaultValue = "1") String userIds){
        String[] ids = userIds.split(",");
        String result = null;
        try {
            result = userService.deleteUserBatch(ids)?"删除成功":"删除失败";
        } catch (SQLException e) {
            logger.error("批量删除用户失败",e);
            return "删除失败";
        }
        return result;
    }

    /**
     * 批量分配用户角色
     * @param userIds   用户ID
     * @param roleIds   角色ID
     * @return
     */
    @RequestMapping("/setUserRoleBatch")
    public String setUserRoleBatch(@RequestParam(defaultValue = "1") String userIds,@RequestParam(defaultValue = "1") String roleIds){
        String[] userIds_arr = userIds.split(",");
        String[] roleIds_arr = roleIds.split(",");
        try {
            return userService.setUserRoleBatch(userIds_arr,roleIds_arr)?"分配成功":"分配失败";
        } catch (SQLException e) {
            logger.error("批量设置用户角色出错",e);
            return "分配失败";
        }
    }



}
