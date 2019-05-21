package com.xc.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.wms.entity.BasProvince;
import com.xc.wms.mapper.BasProvinceMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 省份维护 服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class BasProvinceServiceImpl extends ServiceImpl<BasProvinceMapper, BasProvince> implements IService<BasProvince> {

}
