package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 界面按钮
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SysViewButton extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 界面按钮UUID
     */
    @TableId(value = "SYS_VIEW_BUTTON_UUID", type = IdType.UUID)
    private String sysViewButtonUuid;

    /**
     * 菜单项UUID
     */
    @TableField("SYS_MENU_ITEM_UUID")
    private String sysMenuItemUuid;

    /**
     * 按钮代码
     */
    @TableField("BTN_CODE")
    private String btnCode;

    /**
     * 按钮名
     */
    @TableField("BTN_NAME")
    private String btnName;

    /**
     * 按钮英文名
     */
    @TableField("BTN_NAME_EN")
    private String btnNameEn;

    /**
     * 按钮链接
     */
    @TableField("BTN_URL")
    private String btnUrl;

    /**
     * 按钮提交权限
     */
    @TableField("BTN_ACTION")
    private String btnAction;

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
