package com.xc.wms.service.impl;

import com.xc.wms.entity.SysMenuGroup;
import com.xc.wms.mapper.SysMenuGroupMapper;
import com.xc.wms.service.ISysMenuGroupService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 菜单分组 服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class SysMenuGroupServiceImpl extends ServiceImpl<SysMenuGroupMapper, SysMenuGroup> implements ISysMenuGroupService {

    @Override
    public List<SysMenuGroup> getMenuByUser(String userId) {

        return this.baseMapper.getMenuByUser(userId);
    }
}
