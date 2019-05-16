package com.xc.wms.service.impl;

import com.xc.wms.entity.ItemKind;
import com.xc.wms.mapper.ItemKindMapper;
import com.xc.wms.service.IItemKindService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 物料种类 服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class ItemKindServiceImpl extends ServiceImpl<ItemKindMapper, ItemKind> implements IItemKindService {

}
