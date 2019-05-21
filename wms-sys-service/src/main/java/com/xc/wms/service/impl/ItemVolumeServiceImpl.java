package com.xc.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.wms.entity.ItemVolume;
import com.xc.wms.mapper.ItemVolumeMapper;
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
public class ItemVolumeServiceImpl extends ServiceImpl<ItemVolumeMapper, ItemVolume> implements IService<ItemVolume> {

}
