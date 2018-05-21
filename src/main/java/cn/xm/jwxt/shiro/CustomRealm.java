package cn.xm.jwxt.shiro;


import cn.xm.jwxt.bean.system.Permission;
import cn.xm.jwxt.bean.system.User;
import cn.xm.jwxt.service.system.UserService;
import cn.xm.jwxt.utils.ValidateCheck;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: qlq
 * @Description 自定义realm。根据上面传下来的token去数据库查信息，查到返回一个SimpleAuthenticationInfo，查不到返回null(用于shiro认证)
 * @Date: 21:56 2018/5/6
 */
public class CustomRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    // 设置realm的名称
    @Override
    public void setName(String name) {
        super.setName("customRealm");
    }

    // realm的认证方法，从数据库查询用户信息
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String userCode=(String)token.getPrincipal();//获取token的主身份(登录的username
        User user = null;
        try {
            user =  userService.getUserByUserCode(userCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
        AuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(user, user.getPassword(), this.getName());
        return authenticationInfo;
    }
    // 用于授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //0.下面方法principals.getPrimaryPrincipal()获取的是在上面认证的时候装进AuthenticationInfo的对象
        String userId=((User)(principals.getPrimaryPrincipal())).getUserid();
        SimpleAuthorizationInfo simpleAuthorizationInfo=null;
        try {
            simpleAuthorizationInfo = new SimpleAuthorizationInfo();
            //1.设置所有的权限(注意权限是以字符串的形式保存的权限码)
            List<Permission> permissions1 = userService.selectPermissionsByUserId(userId);//获取所有权限码
            Set<String> permissions = new HashSet<>();
            for(Permission permission:permissions1){
                if(ValidateCheck.isNotNull(permission.getPermissioncode())){
                    permissions.add(permission.getPermissioncode());
                }
            }
            if (permissions != null && permissions.size()>0) {
                simpleAuthorizationInfo.setStringPermissions(permissions);
            }
            //2.设置角色，角色也是以字符串的形式表示(这里存的是角色名字)
            Set<String> userRoleNames = userService.getUserRoleNameByUserId(userId);
            if(userRoleNames != null && userRoleNames.size()>0){
                simpleAuthorizationInfo.setRoles(userRoleNames);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return simpleAuthorizationInfo;
    }

    // 清除缓存
    public void clearCached() {
        PrincipalCollection principals = SecurityUtils.getSubject().getPrincipals();
        super.clearCache(principals);
    }

}
