package com.hy.config;

import com.hy.realm.UserRealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.mgt.DefaultFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;

@Configuration
public class ShiroConfig {
    @Bean
    public UserRealm userRealm(){
        UserRealm userRealm = new UserRealm();
        // 设置realm的加密方式
        userRealm.setCredentialsMatcher(hashedCredentialsMatcher());
        // 设置realm的缓存管理器
        // userRealm.setCacheManager(cacheManager());
        return userRealm;
    }

    @Bean
    public DefaultWebSecurityManager defaultWebSecurityManager(){
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        defaultWebSecurityManager.setRealm(userRealm());
        return defaultWebSecurityManager;
    }

    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(){
        //创建ShiroFilterFactoryBean对象
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        //设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager());
        //创建一个map集合用于存放当前拦截和放行的指令配置
        LinkedHashMap<String,String> map = new LinkedHashMap<>();
        //拦截/loginController/**路径，不进行身份认证
        map.put("/loginController/**", DefaultFilter.anon.name());
        map.put("/user/**", DefaultFilter.anon.name());
        //拦截所有路径，需要进行身份认证
        map.put("/**", DefaultFilter.authc.name());

        //设置拦截和放行的指令配置
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);
        return shiroFilterFactoryBean;
    }

    @Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher(){
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashAlgorithmName("md5");
        hashedCredentialsMatcher.setHashIterations(7);
        hashedCredentialsMatcher.setStoredCredentialsHexEncoded(true);
        return hashedCredentialsMatcher;
    }
}
