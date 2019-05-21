package com.xc.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.wms.entity.BasLocType;
import com.xc.wms.mapper.BasLocTypeMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 仓库货位类型 服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class BasLocTypeServiceImpl extends ServiceImpl<BasLocTypeMapper, BasLocType> implements IService<BasLocType> {

}
