package cn.xm.jwxt.service.system;

import java.util.Map;

public interface UserLoginService {

    /**
     * 传入用户名 username、密码 password、
     *               user_type用户类型：1：教研室主任 2：教学院长 3：教学秘书 4：教师 5：学生
     *           进行登录
     * @param username 用户名
     * @param password 密码
     * @return map :  message: success_1:登录成功_教研室主任
     * 							success_2:登录成功_教学院长
     * 						    success_3:登录成功_教学秘书
     * 						    success_4:登录成功_教师
     * 						    success_5:登录成功_学生
     * 		   					error  :未知错误
     * 		   					error001:该账号不存在
     * 		   					error002：密码错误
     * 		 					error003:该账号没有任何权限，不能使用该系统，请先分配权限
     * 				userinfo:   user对象
     * 				permissioninfo: permission对象
     */
    public Map<String, Object> login(String username, String password, String user_type)throws Exception;
}
