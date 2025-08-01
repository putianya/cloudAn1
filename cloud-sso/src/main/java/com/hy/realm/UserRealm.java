package com.hy.realm;

import com.hy.pojo.TbUser;
import com.hy.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //权限认证
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //登录认证
        //强转对象
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        //获取传递过来的用户名和密码
        String username = token.getUsername();

        //通过username去数据库查询当前对象是否存在
        TbUser tbUser=userService.getUserByUsername(username);

        //判断返回的user对象是否为空
        if (tbUser==null){
            return null;
        }
        //说明user对象存在直接利用shiro校验密码即可
        SimpleAuthenticationInfo sim = new SimpleAuthenticationInfo(tbUser, tbUser.getPassword(), "userRealm");
        return sim;
    }
}
