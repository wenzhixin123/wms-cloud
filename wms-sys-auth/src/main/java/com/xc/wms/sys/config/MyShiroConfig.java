package com.xc.wms.sys.config;

import com.xc.wms.sys.factory.FilterChainDefinitionMapBuilder;
import com.xc.wms.sys.realms.ShiroRealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.mgt.SessionsSecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.crazycake.shiro.RedisCacheManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xc.wms.sys.cache")
public class MyShiroConfig {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Bean(name = "shiroRealm")
    public Realm shiroRealm(){
//        return new IniRealm("classpath:shiro.ini");
        ShiroRealm realm = new ShiroRealm();

//        HashedCredentialsMatcher matcher = new HashedCredentialsMatcher();
//        matcher.setHashAlgorithmName("MD5");
//
//        realm.setCredentialsMatcher(matcher);
        return realm;
    }

    //配置核心安全事务管理器
    @Bean
    public SecurityManager securityManager(@Qualifier("shiroRealm")Realm authRealm, @Qualifier("redisCacheManager")RedisCacheManager
            cacheManager) {

        logger.info("--------------shiro已经加载----------------");
        DefaultWebSecurityManager manager=new DefaultWebSecurityManager();
        // 设置realm.
        manager.setRealm(authRealm);

        //注入缓存管理器;
        //注意:开发时请先关闭，如不关闭热启动会报错
        manager.setCacheManager(cacheManager);//这个如果执行多次，也是同样的一个对象;
        //注入记住我管理器;
        manager.setRememberMeManager(rememberMeManager());


        return manager;
    }


//    @Bean
//    public DefaultWebSecurityManager securityManager(Realm shiroRealm,Realm secondRealm,ModularRealmAuthenticator authenticator){
//        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
////        defaultWebSecurityManager.setRealm(shiroRealm);
//        defaultWebSecurityManager.setAuthenticator(authenticator);
//        List<Realm> realmList = new ArrayList<>();
//        realmList.add(shiroRealm);
//        realmList.add(secondRealm);
//        defaultWebSecurityManager.setRealms(realmList);
//
//        return defaultWebSecurityManager;
//    }

//    @Bean
//    public ShiroFilterFactoryBean shiroFilter(DefaultWebSecurityManager securityManager,FilterChainDefinitionMapBuilder mapBuilder){
//        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
//        shiroFilterFactoryBean.setSecurityManager(securityManager);
////        Map<String,String> map = new LinkedHashMap<>();
//
//        ///admin/** = authc, roles[admin]
//        // /docs/** = authc, perms[document:read]
//        // /** = authc
//
//        shiroFilterFactoryBean.setFilterChainDefinitionMap(mapBuilder.buildFilterChainDefinitionMap());
//        return shiroFilterFactoryBean;
//    }


    @Bean
    public SimpleCookie rememberMeCookie(){
        //这个参数是cookie的名称，对应前端的checkbox的name = rememberMe
        SimpleCookie simpleCookie = new SimpleCookie("rememberMe");
        //<!-- 记住我cookie生效时间30天 ,单位秒;-->
        /* simpleCookie.setMaxAge(259200);*/
        simpleCookie.setMaxAge(20);
        logger.info("--------------rememberMeCookie init---------------"+simpleCookie);
        return simpleCookie;
    }
    /**
     * cookie管理对象;
     * @return
     */
    @Bean
    public CookieRememberMeManager rememberMeManager(){
        CookieRememberMeManager cookieRememberMeManager = new CookieRememberMeManager();
        cookieRememberMeManager.setCookie(rememberMeCookie());

        logger.info("--------------rememberMeManager init---------------"+cookieRememberMeManager);
        return cookieRememberMeManager;
    }


    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager, FilterChainDefinitionMapBuilder mapBuilder){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        shiroFilterFactoryBean.setLoginUrl("/login");
        shiroFilterFactoryBean.setUnauthorizedUrl("/404.html");
        shiroFilterFactoryBean.setSuccessUrl("/index");
//        Map<String,String> map = new LinkedHashMap<>();

        ///admin/** = authc, roles[admin]
        // /docs/** = authc, perms[document:read]
        // /** = authc

        shiroFilterFactoryBean.setFilterChainDefinitionMap(mapBuilder.buildFilterChainDefinitionMap());
        return shiroFilterFactoryBean;
    }

    @Bean
    public FilterChainDefinitionMapBuilder filterChainDefinitionMapBuilder(){
        return new FilterChainDefinitionMapBuilder();
    }

//
    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor(){
        LifecycleBeanPostProcessor lifecycleBeanPostProcessor = new LifecycleBeanPostProcessor();
        return lifecycleBeanPostProcessor;
    }

//    @Bean
//    public DefaultAdvisorAutoProxyCreator autoProxyCreator(LifecycleBeanPostProcessor lifecycleBeanPostProcessor, SecurityManager securityManager){
//        DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
//        defaultAdvisorAutoProxyCreator.setBeanName("org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor");
//        return defaultAdvisorAutoProxyCreator;
//    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
        //  SecurityManager manager= securityManager(authRealm);
        AuthorizationAttributeSourceAdvisor advisor=new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager);
        return advisor;
    }



    /**
     * AOP式方法级权限检查
     * @return
     */
    @Bean
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator creator=new DefaultAdvisorAutoProxyCreator();
        creator.setProxyTargetClass(true);
        return creator;
    }

}
