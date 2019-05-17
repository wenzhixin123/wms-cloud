package com.xc.wms.sys.controller;


import com.alibaba.fastjson.JSONArray;
import com.xc.wms.service.ISysMenuGroupService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 菜单分组 前端控制器
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Controller
@RequestMapping("/sysMenu")
public class SysMenuGroupController {

    @Autowired
    private ISysMenuGroupService iSysMenuGroupService;

    /**
     * 展示tree
     *
     * @param model
     * @return
     */
    @GetMapping(value = "showMenu")
//    @RequiresPermissions("menu:show")
    public String showMenu(Model model) {
        JSONArray ja = iSysMenuGroupService.getMenuJsonList();
        model.addAttribute("menus", ja.toJSONString());
        return "sys/menu/menuList";
    }


}

