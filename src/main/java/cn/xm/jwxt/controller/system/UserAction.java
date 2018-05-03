package cn.xm.jwxt.controller.system;

import cn.xm.jwxt.bean.system.User;
import cn.xm.jwxt.service.system.UserService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

@Controller
public class UserAction {
    private Logger logger = Logger.getLogger(UserAction.class);
    @Autowired
    private UserService userService;
    @RequestMapping("/addUser")
    public String addUser(){
        try {
            userService.addUser(null);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "sss";
    }
    /**
     * 根据userCode查询user
     * @param userCode
     * @return
     */
    @RequestMapping("/findUserById.action")
    public @ResponseBody
    User findUserById(String userCode){
        User user = null;
        try {
            user = userService.findUserByUsercode(userCode);
        } catch (SQLException e) {
            logger.error("根据userCode查询user出错",e);
        }
        return user;
    }

    /**
     * 根据usercode修改username
     * @param userCode
     * @param username
     * @return
     */
    @RequestMapping("/updateUser")
    public @ResponseBody String updateUser(String userCode,String username){
        String result = null;
        try {
            result = userService.updateUserByUserCode(userCode, username)?"success update":"fail update";
        } catch (SQLException e) {
            logger.error("根据userCode修改username出错",e);
        }
        return result;
    }

    /**
     * 分页查询用户信息
     * @return
     */
    @RequestMapping("/findAllUser")
    public @ResponseBody  PageInfo<User> findAllUsers(){
        //分页的用法
        PageHelper.startPage(1,4);
        List<User> allUsers = null;
        try {
            allUsers = userService.findAllUserByCondition(null);
        } catch (SQLException e) {
            logger.error("查询所有用户出错",e);
        }
        PageInfo<User> pageInfo = new PageInfo<>(allUsers);
        return pageInfo;
    }

    /**
     * 测试环境
     * @return
     */
    @RequestMapping("/test.action")
    public @ResponseBody
    String testEnv() {
        return "success";
    }

    /**
     * 测试环境
     * @return
     */
    @RequestMapping("/test2")
    public @ResponseBody
    String testEnv2() {
        return "成功了";
    }
}
