package com.xc.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.wms.common.util.CommonUtils;
import com.xc.wms.common.util.ReType;
import com.xc.wms.entity.SysMenuGroup;
import com.xc.wms.entity.SysUser;
import com.xc.wms.mapper.SysUserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xc.wms.service.ISysMenuGroupService;
import com.xc.wms.service.ISysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Autowired
    ISysMenuGroupService iSysMenuGroupService;


    @Override
    public SysUser login(String userCode) {
        QueryWrapper<SysUser> wrapper = new QueryWrapper<>();
        wrapper.eq("user_code",userCode);
        wrapper.eq("status",CommonUtils.ACTIVE);


        return getOne(wrapper);
    }

    @Override
    public void setMenuAndRoles(String userCode) {
        LambdaQueryWrapper<SysUser> queryWrapper = Wrappers.<SysUser>lambdaQuery()
                                                            .eq(SysUser::getUserCode, userCode)
                                                            .eq(SysUser::getStatus,CommonUtils.ACTIVE);
        SysUser sysUser = this.getOne(queryWrapper);


        //1. 根据用户查询对应角色
        //2. 根据角色查询对应菜单
        //3. 根据菜单进行菜单组分组
        List<SysMenuGroup> sysMenuGroups = iSysMenuGroupService.getMenuByUser(sysUser.getUserUuid());

        Subject subject = SecurityUtils.getSubject();

        Session session = subject.getSession();
        session.setAttribute("menuGroups",sysMenuGroups);

        sysUser.setPassword("");
        session.setAttribute("currentUser",sysUser);
    }

    @Override
    public ReType show(SysUser user, Page<SysUser> pages) {

        LambdaQueryWrapper<SysUser> queryWrapper = Wrappers.<SysUser>lambdaQuery()
                                                    .eq(false,SysUser::getUserCode,user.getUserCode())
                                                    .eq(false,SysUser::getUserName,user.getUserName())
                                                    .eq(SysUser::getStatus,CommonUtils.ACTIVE);

        IPage<SysUser> iPage = this.page(pages, queryWrapper);

        ReType reType = new ReType(iPage.getTotal(),iPage.getRecords());
//        ReType reType = new ReType(iPage.getCurrent(),iPage.getTotal(),iPage.getRecords());

        return reType;
    }
}
