package com.xc.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.wms.entity.DefaultAux;
import com.xc.wms.mapper.DefaultAuxMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 默认扩充字段（针对所有表） 服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class DefaultAuxServiceImpl extends ServiceImpl<DefaultAuxMapper, DefaultAux> implements IService<DefaultAux> {

}
