package com.xc.wms.sys.controller;

import com.xc.wms.entity.SysMenuGroup;
import com.xc.wms.entity.SysMenuItem;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {

    private static Logger log = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private Realm shiroRealm;

    @Autowired
    private SecurityManager securityManager;


    /**
     *  空地址请求
     * @return
     */
    @GetMapping(value = "")
    public String index() {
        return loginCheck();
    }

    @GetMapping(value = "/login")
    public String loginCheck() {
        Subject s = SecurityUtils.getSubject();
        return s.isRemembered() || s.isAuthenticated() ? "redirect:/index" : "login";
    }


    @GetMapping(value = "/sys/welcome")
    public String welcome() {
        return "welcome";
    }


    @GetMapping(value = "/sys/sysUserList")
    public String sysUserPage() {
        return "sys/sysUserList";
    }

    @GetMapping(value = "/logout")
    public String logout(){
        Subject s = SecurityUtils.getSubject();
        s.logout();
        return "login";
    }



    @PostMapping(value = "/login")
    public String login(@Param("username") String username,@Param("password") String password, Model model){

        if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
            model.addAttribute("message","请输入账号密码!");
            return "login";
        }

        SecurityUtils.setSecurityManager(securityManager);
        Subject currentUser = SecurityUtils.getSubject();
        String errorMsg = null;

        if (!currentUser.isAuthenticated()) {
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            token.setRememberMe(true);
            try {
                currentUser.login(token);
            } catch (UnknownAccountException e) {
                errorMsg = "用户名不存在";
            }catch (IncorrectCredentialsException e){
                errorMsg = "密码错误";
            }catch (AuthenticationException ae) {
                errorMsg = "登录异常";
            }
        }
        if(errorMsg != null){
            model.addAttribute("message",errorMsg);
        }

        return  currentUser.isAuthenticated() ? "redirect:/index" : "login";
    }

    @RequestMapping("/index")
    public String list(ModelMap modelMap){

        //查询所有菜单组数据
//        List<SysMenuGroup> sysMenuGroups = new ArrayList<>();
//
//        SysMenuGroup sysMenuGroup = new SysMenuGroup();
//        sysMenuGroup.setMenuGrpName("系统管理");
//        sysMenuGroup.setMenuGrpCode("123");
//        sysMenuGroups.add(sysMenuGroup);
//
//        //查询所有菜单数据
//        List<SysMenuItem> sysMenuItemList = new ArrayList<>();
//        SysMenuItem sysMenuItem = new SysMenuItem();
//        sysMenuItem.setMenuItemCode("12345");
//        sysMenuItem.setMenuItemName("菜单组管理");
//        sysMenuItem.setMenuItemUrl("sys/sysList");
//
//        SysMenuItem sysMenuItem1 = new SysMenuItem();
//        sysMenuItem1.setMenuItemCode("1234");
//        sysMenuItem1.setMenuItemName("菜单管理");
//        sysMenuItem1.setMenuItemUrl("sys/sysUserList");
//
//        sysMenuItemList.add(sysMenuItem);
//        sysMenuItemList.add(sysMenuItem1);
//        sysMenuGroup.setSysMenuItemList(sysMenuItemList);
//
//
//        modelMap.put("menuGroups",sysMenuGroups);

        return "main/main";
    }

}
