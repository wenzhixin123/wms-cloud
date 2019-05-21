package com.xc.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.wms.entity.EnterpriseOrder;
import com.xc.wms.mapper.EnterpriseOrderMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 企业订单 服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class EnterpriseOrderServiceImpl extends ServiceImpl<EnterpriseOrderMapper, EnterpriseOrder> implements IService<EnterpriseOrder> {

}
