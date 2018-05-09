package cn.xm.jwxt.shiro;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @Author: qlq
 * @Description 自定义realm。根据上面传下来的token去数据库查信息，查到返回一个SimpleAuthenticationInfo，查不到返回null
 * @Date: 21:56 2018/5/6
 */
public class CustomRealm extends AuthorizingRealm {


    // 设置realm的名称
    @Override
    public void setName(String name) {
        super.setName("customRealm");
    }

    // realm的认证方法，从数据库查询用户信息
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        return null;
    }

    // 用于授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    // 清除缓存
    public void clearCached() {
        PrincipalCollection principals = SecurityUtils.getSubject().getPrincipals();
        super.clearCache(principals);
    }

}
