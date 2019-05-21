package com.xc.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.wms.entity.BasProject;
import com.xc.wms.mapper.BasProjectMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 项目名称 服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class BasProjectServiceImpl extends ServiceImpl<BasProjectMapper, BasProject> implements IService<BasProject> {

}
