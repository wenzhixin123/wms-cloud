package com.xc.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.wms.entity.ProductMaster;
import com.xc.wms.mapper.ProductMasterMapper;
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
public class ProductMasterServiceImpl extends ServiceImpl<ProductMasterMapper, ProductMaster> implements IService<ProductMaster> {

}
