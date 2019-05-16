package com.xc.wms.service.impl;

import com.xc.wms.entity.LogisticsOrderP;
import com.xc.wms.mapper.LogisticsOrderPMapper;
import com.xc.wms.service.ILogisticsOrderPService;
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
public class LogisticsOrderPServiceImpl extends ServiceImpl<LogisticsOrderPMapper, LogisticsOrderP> implements ILogisticsOrderPService {

}
