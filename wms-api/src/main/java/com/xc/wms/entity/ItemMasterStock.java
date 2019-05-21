package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 物料存储控制表
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ItemMasterStock extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 物料存储控制表UUID
     */
    @TableId(value = "ITEM_MASTER_STOCK_UUID", type = IdType.UUID)
    private String itemMasterStockUuid;

    /**
     * 物料主表UUID
     */
    @TableField("ITEM_MASTER_UUID")
    private String itemMasterUuid;

    /**
     * 开始日期
     */
    @TableField("BEGIN_DATE")
    private Date beginDate;

    /**
     * 结束日期
     */
    @TableField("END_DATE")
    private Date endDate;

    /**
     * 货物包装单位
     */
    @TableField("UNIT_CODE")
    private String unitCode;

    /**
     * 最小库存量
     */
    @TableField("SAFETY_STOCK")
    private BigDecimal safetyStock;

    /**
     * 最大库存量
     */
    @TableField("MAX_STOCK")
    private BigDecimal maxStock;

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
