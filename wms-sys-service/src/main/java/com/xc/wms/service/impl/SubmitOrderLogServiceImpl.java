package com.xc.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.wms.entity.SubmitOrderLog;
import com.xc.wms.mapper.SubmitOrderLogMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 委托订单操作记录 服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class SubmitOrderLogServiceImpl extends ServiceImpl<SubmitOrderLogMapper, SubmitOrderLog> implements IService<SubmitOrderLog> {

}
