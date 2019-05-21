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
 * 物料单位转换表
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ItemMasterConversion extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 物料单位转换表UUID
     */
    @TableId(value = "ITEM_MASTER_CONVERSION_UUID", type = IdType.UUID)
    private String itemMasterConversionUuid;

    /**
     * 物料主表UUID
     */
    @TableField("ITEM_MASTER_UUID")
    private String itemMasterUuid;

    /**
     * 转换单位代号
     */
    @TableField("CONV_UNIT_CODE")
    private String convUnitCode;

    /**
     * 转换单位描述
     */
    @TableField("CONV_UNIT_DESC")
    private String convUnitDesc;

    /**
     * 包装单位代号
     */
    @TableField("UNIT_CODE")
    private String unitCode;

    /**
     * 包装单位描述
     */
    @TableField("UNIT_DESC")
    private String unitDesc;

    /**
     * 数量
     */
    @TableField("UNIT_QTY")
    private BigDecimal unitQty;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 状态：ACTIVE - 有效； Cancel - 作废
     */
    @TableField("STATUS")
    private String status;

    /**
     * 控制字：默认0
     */
    @TableField("CONTROL_WORD")
    private String controlWord;


}
