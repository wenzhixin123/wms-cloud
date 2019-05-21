package com.xc.wms.sys.config.plus;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.xc.wms.entity.SysUser;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.mgt.SessionsSecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.DefaultSessionContext;
import org.apache.shiro.session.mgt.SessionContext;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.session.mgt.ServletContainerSessionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.Map;

/**
 * 自动填充类，model 在新增更新时，需要修改的字段
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyMetaObjectHandler.class);

    @Override
    public void insertFill(MetaObject metaObject) {
        Object principal = SecurityUtils.getSubject().getPrincipal();
        SysUser sysUser = (SysUser) principal;

        this.setFieldValByName("creator",sysUser.getUserUuid(), metaObject);
        this.setFieldValByName("createTime",new Date(), metaObject);
        this.setFieldValByName("officeCode",sysUser.getOfficeCode(), metaObject);
        this.setFieldValByName("recVer", 0L, metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        Object principal = SecurityUtils.getSubject().getPrincipal();
        SysUser sysUser = (SysUser) principal;

        Long current_recVer = (Long) this.getFieldValByName("recVer", metaObject);

        this.setFieldValByName("modifier",sysUser.getUserUuid(), metaObject);
        this.setFieldValByName("modifyTime",new Date(), metaObject);
        this.setFieldValByName("officeCode",sysUser.getOfficeCode(), metaObject);
        this.setFieldValByName("recVer", current_recVer + 1L, metaObject);
    }

}