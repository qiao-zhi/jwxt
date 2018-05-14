package cn.xm.jwxt.shiro;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author: qlq
 * @Description 自定义表单验证器(进行表单认证)
 * 在认证之前进行验证码校验。
 * @Date: 22:04 2018/5/6
 */
public class CustomFormAuthenticationFilter extends FormAuthenticationFilter {

    private String usersort;//用户类型

    //原FormAuthenticationFilter的认证方法
    @Override
    protected boolean onAccessDenied(ServletRequest request,
                                     ServletResponse response) throws Exception {
        //在这里进行用户身份的校验(验证身份是0和1否)
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;

        String usersort = httpServletRequest.getParameter("usersort");
        if(usersort != null &&usersort != "0" && usersort != "1"){
            httpServletRequest.setAttribute("shiroLoginFailure", "userSortError");//设置一个错误消息(身份错误)
        }
        return super.onAccessDenied(request, response);
    }

    public String getUsersort() {
        return usersort;
    }

    public void setUsersort(String usersort) {
        this.usersort = usersort;
    }
}
