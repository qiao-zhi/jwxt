package cn.xm.jwxt.controller.system;

import cn.xm.jwxt.annotation.MyLogAnnotation;
import cn.xm.jwxt.bean.system.User;
import cn.xm.jwxt.service.system.UserService;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.Map;

/**
 * @Author: qlq
 * @Description 登录controller
 * @Date: 11:28 2018/5/13
 */
@Controller
public class LoginController {
    private final String SESSION_USER_INFO="userinfo"; //用户信息的session名
    private final String SESSION_PERMISSION_INFO="permissioninfo"; //权限信息的session名
    @Autowired
    private UserService userService;//用于处理登录的业务流程
    private Logger logger = Logger.getLogger(LoginController.class);

    // 未登录的用户默认重定向到的地址.和applicationContext-shiro.xml中配置的loginurl一致(只是简单的将地址转发到login.jsp)
    @RequestMapping("/login")
    public String login() throws Exception {
        return "login";
    }

    /**
     * @param usercode 账户
     * @param password 密码
     * @param usersort 用户类型
     * @return  登录结果
     * @throws Exception
     */
    @RequestMapping("/userLogin")
    public @ResponseBody Map<String,Object> userLogin(@RequestParam(defaultValue = "1") String usercode, @RequestParam(defaultValue = "1") String password, @RequestParam(defaultValue = "1") String usersort, HttpServletRequest request) {
        Map<String, Object> userLoginInfo =null;
        try {
            userLoginInfo  = userService.getUserLoginInfo(usercode, password, usersort);
        } catch (SQLException e) {
            logger.error("登录出错",e);
            userLoginInfo.put("loginInfo","登录失败!");
            return userLoginInfo;
        }
        String loginInfo = (String) userLoginInfo.get("loginInfo");//获取登录信息
        ////shiro的使用需要先把用户的信息放入session 需要先用shiro的方法进行登录 但是登录方法已经写好。这里在登录成功之后用shiro的方法再登录一次
        if("登录成功" == loginInfo){
            //1.存session东西
            HttpSession session=request.getSession();
            User user = (User) userLoginInfo.get("user");
            //1.1存用户主键
            String id = null;
            try {
                id =  userService.getuserIdByUser(user);
            } catch (SQLException e) {
                logger.error("查询用户ID出错",e);
            }
            session.setAttribute("id", id);//将老师或学生表主键存进去
            session.setAttribute(SESSION_USER_INFO, user);
            session.setAttribute(SESSION_PERMISSION_INFO, user.getPermissions());
            userLoginInfo.remove("user");//从map中删除用户返回前台
            //2.到shiro验证授权
            Subject currentUser=SecurityUtils.getSubject();
            UsernamePasswordToken token=new UsernamePasswordToken(usercode, password);
            currentUser.login(token);
            //3.访问日志标记方法，记录日志
            userService.logSuccess();
        }
        return userLoginInfo;
    }

}
