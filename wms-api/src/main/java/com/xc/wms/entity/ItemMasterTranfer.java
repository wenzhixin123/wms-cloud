package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ItemMasterTranfer extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 在途仓库存表主键
     */
    @TableId(value = "ITEM_MASTER_TRANFER_UUID", type = IdType.UUID)
    private String itemMasterTranferUuid;

    /**
     * 物料编码
     */
    @TableField("ITEM_CODE")
    private String itemCode;

    /**
     * 物料名称
     */
    @TableField("ITEM_NAME")
    private String itemName;

    /**
     * 库存数量
     */
    @TableField("ITEM_QTY")
    private Double itemQty;

    /**
     * 单位描述
     */
    @TableField("QTY_UNIT_DESC")
    private String qtyUnitDesc;

    /**
     * 单位代码
     */
    @TableField("QTY_UNIT_CODE")
    private String qtyUnitCode;

    /**
     * 规格
     */
    @TableField("SPEC")
    private String spec;

    /**
     * 0为京东，1为唯品会
     */
    @TableField("TYPE")
    private String type;

    /**
     * 型号
     */
    @TableField("MODEL")
    private String model;

    /**
     * 状态
     */
    @TableField("STATUS")
    private String status;

    /**
     * 自定义字段1
     */
    @TableField("AUX1")
    private String aux1;

    /**
     * 自定义字段2
     */
    @TableField("AUX2")
    private String aux2;

    /**
     * 自定义字段3
     */
    @TableField("AUX3")
    private String aux3;

    /**
     * 自定义字段4
     */
    @TableField("AUX4")
    private String aux4;

    /**
     * 自定义字段5
     */
    @TableField("AUX5")
    private String aux5;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 控制字
     */
    @TableField("CONTROL_WORD")
    private String controlWord;


}
