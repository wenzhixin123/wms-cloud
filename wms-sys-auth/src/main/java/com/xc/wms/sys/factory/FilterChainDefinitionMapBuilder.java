package com.xc.wms.sys.factory;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Shiro 的过滤器链
 */
public class FilterChainDefinitionMapBuilder {

    public Map<String,String> buildFilterChainDefinitionMap(){

        Map<String,String> filterChainDefinitionMap = new LinkedHashMap<>();

        filterChainDefinitionMap.put("/logout","logout");
        filterChainDefinitionMap.put("/login","anon");
//        filterChainDefinitionMap.put("/","anon");

        //开放的静态资源
//        filterChainDefinitionMap.put("/favicon.ico", "anon");//网站图标
        filterChainDefinitionMap.put("/static/**","anon");
//        filterChainDefinitionMap.put("/lib/**","anon");
//        filterChainDefinitionMap.put("/css/**","anon");
//        filterChainDefinitionMap.put("/fonts/**","anon");
//        filterChainDefinitionMap.put("/images/**","anon");
//        filterChainDefinitionMap.put("/js/**","anon");
//        filterChainDefinitionMap.put("/layui/**","anon");
//        filterChainDefinitionMap.put("/static/img/**","anon");
//        filterChainDefinitionMap.put("/static/fonts/**","anon");

        filterChainDefinitionMap.put("/plugin/**", "anon");

        filterChainDefinitionMap.put("/health/**","anon");
        filterChainDefinitionMap.put("/env/**","anon");
        filterChainDefinitionMap.put("/metrics/**","anon");
        filterChainDefinitionMap.put("/trace/**","anon");
        filterChainDefinitionMap.put("/dump/**","anon");
        filterChainDefinitionMap.put("/jolokia/**","anon");
        filterChainDefinitionMap.put("/info/**","anon");
        filterChainDefinitionMap.put("/logfile/**","anon");
        filterChainDefinitionMap.put("/refresh/**","anon");
        filterChainDefinitionMap.put("/flyway/**","anon");
        filterChainDefinitionMap.put("/liquibase/**","anon");
        filterChainDefinitionMap.put("/heapdump/**","anon");
        filterChainDefinitionMap.put("/loggers/**","anon");
        filterChainDefinitionMap.put("/auditevents/**","anon");


        filterChainDefinitionMap.put("/layouts/**","anon");
        filterChainDefinitionMap.put("/attach/**","anon");


        filterChainDefinitionMap.put("/*", "authc");//表示需要认证才可以访问
        filterChainDefinitionMap.put("/**", "authc");//表示需要认证才可以访问
        filterChainDefinitionMap.put("/*.*", "authc");
        return filterChainDefinitionMap;
    }
}
