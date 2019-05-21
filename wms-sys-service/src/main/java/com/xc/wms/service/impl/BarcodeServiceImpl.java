package com.xc.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.wms.entity.Barcode;
import com.xc.wms.mapper.BarcodeMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 条码表 服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class BarcodeServiceImpl extends ServiceImpl<BarcodeMapper, Barcode> implements IService<Barcode> {

}
