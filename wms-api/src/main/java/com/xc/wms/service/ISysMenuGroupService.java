package com.xc.wms.service;

import com.xc.wms.entity.SysMenuGroup;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 菜单分组 服务类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
public interface ISysMenuGroupService extends IService<SysMenuGroup> {

    List<SysMenuGroup> getMenuByUser(String userId);
}
