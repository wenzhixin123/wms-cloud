package com.xc.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.wms.entity.QrtzLocks;
import com.xc.wms.mapper.QrtzLocksMapper;
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
public class QrtzLocksServiceImpl extends ServiceImpl<QrtzLocksMapper, QrtzLocks> implements IService<QrtzLocks> {

}
