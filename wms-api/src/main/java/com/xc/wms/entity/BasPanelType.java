package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * <p>
 * 托盘类型
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BasPanelType extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 托盘类型UUID
     */
    @TableId(value = "BAS_PANEL_TYPE_UUID", type = IdType.UUID)
    private String basPanelTypeUuid;

    /**
     * 托盘类型代码
     */
    @TableField("PANEL_TYPE_CODE")
    private String panelTypeCode;

    /**
     * 托盘类型描述
     */
    @TableField("PANEL_TYPE_DESC")
    private String panelTypeDesc;

    /**
     * 长
     */
    @TableField("LENGTH")
    private BigDecimal length;

    /**
     * 宽
     */
    @TableField("WIDTH")
    private BigDecimal width;

    /**
     * 高
     */
    @TableField("HEIGHT")
    private BigDecimal height;

    /**
     * 控制字
     */
    @TableField("CONTROL_WORD")
    private String controlWord;

    /**
     * 操作状态
     */
    @TableField("STATUS")
    private String status;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;


}
