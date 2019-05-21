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
 * 包装条码明细
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BarcodeDetail extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 条码明细表UUID
     */
    @TableId(value = "BARCODE_DETAIL_UUID", type = IdType.UUID)
    private String barcodeDetailUuid;

    /**
     * 条码表UUID
     */
    @TableField("BARCODE_UUID")
    private String barcodeUuid;

    /**
     * 序号
     */
    @TableField("SEQ_NO")
    private Long seqNo;

    /**
     * 物料编码
     */
    @TableField("ITEM_CODE")
    private String itemCode;

    /**
     * 物料序列号
     */
    @TableField("ITEM_SEQNO")
    private String itemSeqno;

    /**
     * 外部物料编码
     */
    @TableField("EXT_ITEM_CODE")
    private String extItemCode;

    /**
     * 货物名称
     */
    @TableField("GOODS_DESC")
    private String goodsDesc;

    /**
     * 数量
     */
    @TableField("QTY")
    private BigDecimal qty;

    /**
     * 包装单位代码
     */
    @TableField("QTY_UNIT_CODE")
    private String qtyUnitCode;

    /**
     * 包装单位描述
     */
    @TableField("QTY_UNIT_DESC")
    private String qtyUnitDesc;

    /**
     * 长度单位
     */
    @TableField("LENGTH_UNIT_CODE")
    private String lengthUnitCode;

    /**
     * 长度单位
     */
    @TableField("LENGTH_UNIT_DESC")
    private String lengthUnitDesc;

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
     * 重量单位
     */
    @TableField("WEIGHT_UNIT_CODE")
    private String weightUnitCode;

    /**
     * 重量单位
     */
    @TableField("WEIGHT_UNIT_DESC")
    private String weightUnitDesc;

    /**
     * 净重
     */
    @TableField("NET_WEIGHT")
    private BigDecimal netWeight;

    /**
     * 毛重
     */
    @TableField("GROSS_WEIGHT")
    private BigDecimal grossWeight;

    /**
     * 体积单位
     */
    @TableField("VOLUME_UNIT_CODE")
    private String volumeUnitCode;

    /**
     * 体积单位
     */
    @TableField("VOLUME_UNIT_DESC")
    private String volumeUnitDesc;

    /**
     * VOLUME 体积(立方米)
     */
    @TableField("VOLUME")
    private BigDecimal volume;

    /**
     * 单价
     */
    @TableField("UNIT_PRICE")
    private BigDecimal unitPrice;

    /**
     * 币种代码
     */
    @TableField("CURRENCY_CODE")
    private String currencyCode;

    /**
     * 币种描述
     */
    @TableField("CURRENCY_DESC")
    private String currencyDesc;

    /**
     * 合计
     */
    @TableField("TOTAL_PRICE")
    private BigDecimal totalPrice;

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

    /**
     * 作废日期
     */
    @TableField("CANCEL_DATE")
    private Date cancelDate;

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


}
