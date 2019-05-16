package com.xc.wms.service.impl;

import com.xc.wms.entity.LocationTask;
import com.xc.wms.mapper.LocationTaskMapper;
import com.xc.wms.service.ILocationTaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 库内作业任务表 服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class LocationTaskServiceImpl extends ServiceImpl<LocationTaskMapper, LocationTask> implements ILocationTaskService {

}
