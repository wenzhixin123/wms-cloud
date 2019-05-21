package com.xc.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.wms.entity.ItemMaster;
import com.xc.wms.mapper.ItemMasterMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 物料资料主表 服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class ItemMasterServiceImpl extends ServiceImpl<ItemMasterMapper, ItemMaster> implements IService<ItemMaster> {

}
