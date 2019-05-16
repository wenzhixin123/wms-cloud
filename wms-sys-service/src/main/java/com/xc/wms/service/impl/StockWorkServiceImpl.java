package com.xc.wms.service.impl;

import com.xc.wms.entity.StockWork;
import com.xc.wms.mapper.StockWorkMapper;
import com.xc.wms.service.IStockWorkService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 库内操作记录表 服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class StockWorkServiceImpl extends ServiceImpl<StockWorkMapper, StockWork> implements IStockWorkService {

}
