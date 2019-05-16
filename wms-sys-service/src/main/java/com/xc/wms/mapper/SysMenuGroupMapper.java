package com.xc.wms.mapper;

import com.xc.wms.entity.SysMenuGroup;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 菜单分组 Mapper 接口
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
public interface SysMenuGroupMapper extends BaseMapper<SysMenuGroup> {

    List<SysMenuGroup> getMenuByUser(@Param("userId") String userId);

}
