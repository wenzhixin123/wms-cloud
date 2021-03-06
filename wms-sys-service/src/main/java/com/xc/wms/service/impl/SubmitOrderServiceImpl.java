package com.xc.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.wms.entity.SubmitOrder;
import com.xc.wms.mapper.SubmitOrderMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 委托订单 服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class SubmitOrderServiceImpl extends ServiceImpl<SubmitOrderMapper, SubmitOrder> implements IService<SubmitOrder> {

}
