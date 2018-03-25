package cn.xm.jwxt.controller.system;

import cn.xm.jwxt.bean.system.User;
import cn.xm.jwxt.service.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.List;

@Controller
public class UserAction {
    @Autowired
    private UserService userService;

    @RequestMapping("/findUserById.action")
    public @ResponseBody
    User findAllUsers(String userId) throws SQLException {
        return userService.findUserById(userId);
    }

    @RequestMapping("/test.action")
    public @ResponseBody
    String testEnv() {
        return "success";
    }
}
