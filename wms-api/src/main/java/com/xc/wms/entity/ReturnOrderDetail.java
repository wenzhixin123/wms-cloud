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
public class ReturnOrderDetail extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 退包明细表主键
     */
    @TableId(value = "RETURN_ORDER_DETAIL_UUID", type = IdType.UUID)
    private String returnOrderDetailUuid;

    /**
     * 退包表主键
     */
    @TableField("RETURN_ORDER_UUID")
    private String returnOrderUuid;

    /**
     * 退包单号
     */
    @TableField("RETURN_ORDER_NO")
    private String returnOrderNo;

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
     * 商品编码
     */
    @TableField("EXT_ITEM_CODE")
    private String extItemCode;

    /**
     * 单物料退回总数
     */
    @TableField("ITEM_QTY")
    private BigDecimal itemQty;

    /**
     * 单物料入库总数
     */
    @TableField("IN_QTY")
    private BigDecimal inQty;

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

    /**
     * 单位
     */
    @TableField("QTY_UNIT_CODE")
    private String qtyUnitCode;


}
