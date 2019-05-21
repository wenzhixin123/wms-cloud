package com.xc.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.wms.entity.SysNews;
import com.xc.wms.mapper.SysNewsMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 信息发布表 服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class SysNewsServiceImpl extends ServiceImpl<SysNewsMapper, SysNews> implements IService<SysNews> {

}
