package com.xc.wms.sys;

import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xc.wms.entity.SysMenuGroup;
import com.xc.wms.entity.SysRoleUser;
import com.xc.wms.entity.SysUser;
import com.xc.wms.service.ISysMenuGroupService;
import com.xc.wms.service.ISysRoleUserService;
import com.xc.wms.service.ISysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@EnableTransactionManagement
@RunWith(SpringRunner.class)
@SpringBootTest
public class WmsSysWebApplicationTests {

    @Autowired
    ISysUserService isysUserService;
    @Autowired
    ISysRoleUserService iSysRoleUserService;

    @Autowired
    ISysMenuGroupService iSysMenuGroupService;

    @Test
    public void queryMenuGrpTree(){
        List<SysMenuGroup> menuByUser = iSysMenuGroupService.getMenuByUser("2c9081551bb094da011bb0ea14000007");
        System.out.println(menuByUser);
    }

    @Test
    public void getMenuGrpTree(){
        JSONArray menuJsonList = iSysMenuGroupService.getMenuJsonList();
        System.out.println(menuJsonList);

    }


    @Transactional(rollbackFor = Exception.class)
    @Test
    public void contextLoads() {
        SysUser sysUser = new SysUser().setUserCode("aaa2").setUserName("xinxin7").setUserType("1");
//        isysUserService.insert(sysUser);
//        isysUserService.saveBatch(Arrays.asList(sysUser));
//        sysUser.setUserUuid(UUID.randomUUID().toString());
        isysUserService.save(sysUser);
        System.out.println(sysUser.toString());
    }

    @Transactional(rollbackFor = Exception.class)
    @Test
    public void getUsers() {

        Page<SysUser> pages  = new Page<>();
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        pages.setCurrent(1);
        pages.setSize(10);

//        queryWrapper.allEq((k,v) -> "Active".equals(k.),{"id":"","name":"老王","age":""});
        queryWrapper.eq("status","Active");
        queryWrapper.eq(false,"office_Code","");


        IPage<SysUser> page = isysUserService.page(pages, queryWrapper);

        System.out.println(page.toString());

        List<SysUser> users = page.getRecords();
//        List<SysUser> users = isysUserService.list();

        users.forEach(sysUser -> System.out.println(sysUser.toString()));

    }

    @Test
    public void test1(){
        String userCode = "ADMIN";



        //1. 根据用户查询对应角色
        LambdaQueryWrapper<SysRoleUser> queryWrapper = Wrappers.<SysRoleUser>lambdaQuery().eq(SysRoleUser::getUserUuid, "123");

        iSysRoleUserService.list(queryWrapper);

    }


}
