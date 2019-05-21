package com.xc.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.wms.entity.BasUnit;
import com.xc.wms.mapper.BasUnitMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 包装单位信息 服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class BasUnitServiceImpl extends ServiceImpl<BasUnitMapper, BasUnit> implements IService<BasUnit> {

}
