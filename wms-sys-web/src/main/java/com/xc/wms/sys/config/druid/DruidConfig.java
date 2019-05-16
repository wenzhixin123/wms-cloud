package com.xc.wms.sys.config.druid;


import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chen on 2017/5/16.
 * <p>
 * <p>
 * Describe:
 */
@Configuration
public class DruidConfig {
    /**
     * 注册DruidServlet
     * http://localhost:8080/druid/datasource.html查看监控信息
     * @return
     */
    @Bean
    public ServletRegistrationBean druidServletRegistrationBean() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new StatViewServlet());
        servletRegistrationBean.addUrlMappings("/druid/*");
        return servletRegistrationBean;
    }

    /**
     * 注册DruidFilter拦截
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean duridFilterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();

//        filterRegistrationBean.setFilter();
        Filter filter = new WebStatFilter();

        filterRegistrationBean.setFilter(filter);
//        filterRegistrationBean.setName("DruidWebStatFilter");

        Map<String, String> initParams = new HashMap<String, String>();
        //设置忽略请求
        initParams.put("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");

        filterRegistrationBean.setInitParameters(initParams);
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }

//    @Bean
//    public FilterRegistrationBean myRegisbean(){
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//
//        registration.setFilter(new MyFilter());
//        registration.setName("myFilter");
//        registration.setDispatcherTypes(EnumSet.allOf(DispatcherType.class));
//        return registration;
//    }


}
