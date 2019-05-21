package com.xc.wms.sys.config.plus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.Assert;

public class DelegateBean implements ApplicationContextAware {
    private static final Logger logger = LoggerFactory.getLogger(DelegateBean.class);
    protected ApplicationContext applicationContext;
    protected Object target;
    protected String targetBeanName;
    protected Class targetBeanType;

    public DelegateBean(String targetBeanName) {
        this.targetBeanName = targetBeanName;
    }

    public DelegateBean(Class targetBeanType) {
        this.targetBeanType = targetBeanType;
    }

    public DelegateBean(ApplicationContext applicationContext, String targetBeanName) {
        this.applicationContext = applicationContext;
        this.targetBeanName = targetBeanName;
    }

    public DelegateBean(ApplicationContext applicationContext, Class targetBeanType) {
        this.applicationContext = applicationContext;
        this.targetBeanType = targetBeanType;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    //当调用这个方法的时候才从spring容器中获取bean；
    public Object target() {
        Assert.notNull(this.applicationContext, "A DelegateBean should be managed by ApplicationContext or pass ApplicationContext though constructor arg");
        if(this.target == null) {
            synchronized(this) {
                return this.target != null?this.target:(this.target = this.doGetBeanFromApplicationContext());
            }
        } else {
            return this.target;
        }
    }

    protected Object doGetBeanFromApplicationContext() {
        return this.targetBeanName != null?this.applicationContext.getBean(this.targetBeanName):(this.targetBeanType != null?this.applicationContext.getBean(this.targetBeanType):null);
    }
}
