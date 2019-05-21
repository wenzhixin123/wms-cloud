package com.xc.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.wms.entity.LogisticsOrder;
import com.xc.wms.mapper.LogisticsOrderMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 作业单（入库、移位、加工、出库等） 服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class LogisticsOrderServiceImpl extends ServiceImpl<LogisticsOrderMapper, LogisticsOrder> implements IService<LogisticsOrder> {

}
