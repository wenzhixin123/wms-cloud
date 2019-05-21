package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 角色菜单按钮权限
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SysRoleMenuButton extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 角色菜单按钮权限UUID
     */
    @TableId(value = "SYS_ROLE_MENU_BUTTON_UUID", type = IdType.UUID)
    private String sysRoleMenuButtonUuid;

    /**
     * 角色菜单项权限UUID
     */
    @TableField("SYS_ROLE_MENU_ITEM_UUID")
    private String sysRoleMenuItemUuid;

    /**
     * 界面按钮UUID
     */
    @TableField("SYS_VIEW_BUTTON_UUID")
    private String sysViewButtonUuid;

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


}
