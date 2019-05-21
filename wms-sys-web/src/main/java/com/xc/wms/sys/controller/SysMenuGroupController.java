package com.xc.wms.sys.controller;


import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.xc.wms.entity.SysUser;
import com.xc.wms.mapper.SysUserMapper;
import com.xc.wms.service.ISysMenuGroupService;
import com.xc.wms.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    @Autowired
    ISysUserService isysUserService;

    @Autowired
    SysUserMapper mapper;

    @GetMapping(value = "testSave")
    @ResponseBody
    public String test(){
        SysUser sysUser = new SysUser().setUserCode("xinxin001").setUserName("xinxin8").setUserType("1");
//        isysUserService.insert(sysUser);
//        isysUserService.saveBatch(Arrays.asList(sysUser));
//        sysUser.setUserUuid(UUID.randomUUID().toString());
        isysUserService.save(sysUser);
        System.out.println(sysUser.toString());
        return "success";
    }

    @GetMapping(value = "testUpdate")
    @ResponseBody
    public String update(){

        LambdaQueryWrapper<SysUser> wrapper = Wrappers.<SysUser>lambdaQuery().eq(SysUser::getUserCode, "xinxin001")
                .eq(SysUser::getUserName, "xinxin8-2")
                .eq(SysUser::getUserType, "1");

        List<SysUser> sysUsers = mapper.selectList(wrapper);

        SysUser sysUser = sysUsers.get(0);
        if(sysUser != null){
            System.out.println(sysUser.toString());
            sysUser.setUserName("xinxin8-3");

            isysUserService.updateById(sysUser);
        }else{
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>"+sysUser.toString());
        }

        return "success";
    }
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

    @GetMapping(value = "showAddMenu")
    public String addMenu(Model model) {
        JSONArray ja = iSysMenuGroupService.getMenuJsonList();
        model.addAttribute("menus", ja.toJSONString());
        return "sys/menu/add-menu";
    }

}

