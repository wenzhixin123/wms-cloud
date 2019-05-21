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
 * 物料存储货位数量表
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ItemMasterLocType extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 物料存储货位数量UUID
     */
    @TableId(value = "ITEM_MASTER_LOC_TYPE_UUID", type = IdType.UUID)
    private String itemMasterLocTypeUuid;

    /**
     * 物料主表UUID
     */
    @TableField("ITEM_MASTER_UUID")
    private String itemMasterUuid;

    /**
     * 货位类型代码
     */
    @TableField("LOC_TYPE_CODE")
    private String locTypeCode;

    /**
     * 货位类型名称
     */
    @TableField("LOC_TYPE_NAME")
    private String locTypeName;

    /**
     * 货物包装单位
     */
    @TableField("STOCK_UNIT_CODE")
    private String stockUnitCode;

    /**
     * 存储数量
     */
    @TableField("STOCK_QTY")
    private BigDecimal stockQty;

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
