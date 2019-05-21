package com.xc.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.wms.entity.WorkSchedule;
import com.xc.wms.mapper.WorkScheduleMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class WorkScheduleServiceImpl extends ServiceImpl<WorkScheduleMapper, WorkSchedule> implements IService<WorkSchedule> {

}
