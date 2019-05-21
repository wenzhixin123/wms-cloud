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
 * 
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TranferOrderDetail extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 在途仓出库明细表主键
     */
    @TableId(value = "TRANFER_ORDER_DETAIL_UUID", type = IdType.UUID)
    private String tranferOrderDetailUuid;

    /**
     * 在途仓出库表主键
     */
    @TableField("TRANFER_ORDER_UUID")
    private String tranferOrderUuid;

    /**
     * 在途仓出库单号
     */
    @TableField("TRANFER_ORDER_NO")
    private String tranferOrderNo;

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
     * 物料出库数量
     */
    @TableField("ITEM_QTY")
    private BigDecimal itemQty;

    /**
     * 包装单位
     */
    @TableField("QTY_UNIT_CODE")
    private String qtyUnitCode;

    /**
     * 包装单位描述
     */
    @TableField("QTY_UNIT_DESC")
    private String qtyUnitDesc;

    /**
     * 规格
     */
    @TableField("SPEC")
    private String spec;

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
     * 备注
     */
    @TableField("REMARK")
    private String remark;

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
     * 修改人
     */
    @TableField("Modifier")
    private String Modifier;

    /**
     * 修改时间
     */
    @TableField("Modify_Time")
    private Date modifyTime;

    /**
     * 并发控制
     */
    @TableField("Rec_Ver")
    private Long recVer;

    /**
     * 控制字
     */
    @TableField("Control_Word")
    private String controlWord;


}
