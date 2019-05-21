package com.xc.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.wms.entity.BasCountry;
import com.xc.wms.mapper.BasCountryMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 国家信息维护 服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class BasCountryServiceImpl extends ServiceImpl<BasCountryMapper, BasCountry> implements IService<BasCountry> {

}
