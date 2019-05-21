package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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
public class ItemGoodsContras extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 物料商品对应关系UUID
     */
    @TableId(value = "ITEM_GOODS_CONTRAS_UUID", type = IdType.UUID)
    private String itemGoodsContrasUuid;

    /**
     * 物料主表UUID
     */
    @TableField("ITEM_MASTER_UUID")
    private String itemMasterUuid;

    /**
     * 货位类型代码
     */
    @TableField("ITEM_CODE")
    private String itemCode;

    @TableField("ITEM_NAME")
    private String itemName;

    /**
     * 货位类型名称
     */
    @TableField("EXT_ITEM_CODE")
    private String extItemCode;

    /**
     * 货物包装单位
     */
    @TableField("STOCK_EXT_ITEM_CODE")
    private String stockExtItemCode;

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
