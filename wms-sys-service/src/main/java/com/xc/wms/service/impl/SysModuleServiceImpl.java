package com.xc.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.wms.entity.SysModule;
import com.xc.wms.mapper.SysModuleMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统主菜单（模块条） 服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class SysModuleServiceImpl extends ServiceImpl<SysModuleMapper, SysModule> implements IService<SysModule> {

}
