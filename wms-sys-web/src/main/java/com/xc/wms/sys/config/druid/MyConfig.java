package com.xc.wms.sys.config.druid;

import com.xc.wms.sys.config.plus.DelegateBean;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.mgt.SessionsSecurityManager;
import org.apache.shiro.session.mgt.DefaultSessionContext;
import org.apache.shiro.session.mgt.SessionContext;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    @Qualifier("sessionSecurityManager")
    public DelegateBean tenantUserCloudService(){
        return new DelegateBean(SessionsSecurityManager.class);
    }

    @Bean
    @Qualifier("sessionContextService")
    public DelegateBean sessionContextService(){
        return new DelegateBean("defaultSessionContext");
    }


    @Bean("defaultSessionContext")
    public DefaultSessionContext sessionContext(){
        return new DefaultSessionContext();
    }

}
