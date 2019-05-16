package com.xc.wms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xc.wms.common.util.ReType;
import com.xc.wms.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
public interface ISysUserService extends IService<SysUser> {

    SysUser login(@Param("userName")String userName);

    void setMenuAndRoles(String username);

    ReType show(SysUser user, Page<SysUser> pages);
}
