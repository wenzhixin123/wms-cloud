package com.xc.wms.sys.realms;

import com.xc.wms.common.util.ApplicationContextRegister;
import com.xc.wms.common.util.Encodes;
import com.xc.wms.entity.SysUser;
import com.xc.wms.service.ISysUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

public class ShiroRealm extends AuthorizingRealm {

    @Value("${shiro.algorithmName}")
    private String algorithmName;

    @Value("${shiro.iterations}")
    private int iterations;

    @Autowired
    private ISysUserService iSysUserService;

    @PostConstruct
    public void initCredentialsMatcher(){
        HashedCredentialsMatcher matcher = new HashedCredentialsMatcher();
        matcher.setHashAlgorithmName(algorithmName);
        matcher.setHashIterations(iterations);
        setCredentialsMatcher(matcher);

    }



    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        String loginName=((UsernamePasswordToken) authenticationToken).getUsername();
        //1. 根据用户名查询数据库中是否存在
        SysUser sysUser = iSysUserService.login(loginName);
        if (sysUser == null) {
            throw new UnknownAccountException("用户"+loginName+"不存在!");
        }
        Object credentials = sysUser.getPassword();
        sysUser.setPassword("");

        //存放当前用户的角色和菜单列表
        iSysUserService.setMenuAndRoles(sysUser.getUserCode());

        return new SimpleAuthenticationInfo(sysUser, credentials, ByteSource.Util.bytes(loginName), getName());

    }

    /**
     * 用来做假密码生成的程序
     * @param args
     */
    public static void main(String[] args) {
        String userName = "SHA-1";
        String credentials = "123456";
        String salt = "ADMIN";
        int hashIterations = 1024;


        SimpleHash simpleHash = new SimpleHash(userName, credentials, salt, hashIterations);
        System.out.println(simpleHash);

    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        Object primaryPrincipal = principalCollection.getPrimaryPrincipal();

        Set<String> roles = new HashSet<>();
        roles.add("user");
        if("admin".equals(primaryPrincipal)){
            roles.add("admin");
        }

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo(roles);


        return simpleAuthorizationInfo;
    }
}
