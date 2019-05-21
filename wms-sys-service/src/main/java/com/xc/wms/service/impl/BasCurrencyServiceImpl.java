package com.xc.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.wms.entity.BasCurrency;
import com.xc.wms.mapper.BasCurrencyMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 币别信息 服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class BasCurrencyServiceImpl extends ServiceImpl<BasCurrencyMapper, BasCurrency> implements IService<BasCurrency> {

}
