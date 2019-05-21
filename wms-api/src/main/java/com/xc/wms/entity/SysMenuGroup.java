package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * <p>
 * 菜单分组
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SysMenuGroup extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 一级菜单UUID
     */
    @TableId(value = "SYS_MENU_GROUP_UUID", type = IdType.UUID)
    private String sysMenuGroupUuid;

    /**
     * 模块UUID
     */
    @TableField("SYS_MODULE_UUID")
    private String sysModuleUuid;

    @TableField("PRE_SYS_MENU_GROUP_UUID")
    private String preSysMenuGroupUuid;

    /**
     * 菜单组序号
     */
    @TableField("MENU_GRP_SEQ")
    private Double menuGrpSeq;

    /**
     * 菜单分组代码
     */
    @TableField("MENU_GRP_CODE")
    private String menuGrpCode;

    /**
     * 菜单分组中文名
     */
    @TableField("MENU_GRP_NAME")
    private String menuGrpName;

    /**
     * 菜单分组英文名
     */
    @TableField("MENU_GRP_NAME_EN")
    private String menuGrpNameEn;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 状态：Active - 有效； Cancel - 作废
     */
    @TableField("STATUS")
    private String status;

    /**
     * 控制字：默认0
     */
    @TableField("CONTROL_WORD")
    private String controlWord;
    transient public List<SysMenuItem> sysMenuItemList;

}
