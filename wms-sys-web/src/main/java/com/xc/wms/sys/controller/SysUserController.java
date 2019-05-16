package com.xc.wms.sys.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xc.wms.entity.SysUser;
import com.xc.wms.service.ISysUserService;
import com.xc.wms.common.util.ReType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Controller
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    @GetMapping(value = "showUser")
//    @RequiresPermissions("user:show")
    public String showUser(Model model) {
        return "sys/user/userList";
    }

    @GetMapping(value = "showUserList")
    @ResponseBody
//    @RequiresPermissions("user:show")
    public ReType showUser(Model model, SysUser user, String page, String limit) {

        Page<SysUser> pages  = new Page<>();
        if(!StringUtils.isEmpty(page) || !StringUtils.isEmpty(limit)){
            pages.setCurrent(Integer.valueOf(page));
            pages.setSize(Integer.valueOf(limit));
        }

        return sysUserService.show(user, pages);
    }



}

