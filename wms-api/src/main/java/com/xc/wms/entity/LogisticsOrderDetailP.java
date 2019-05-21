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
 * 作业单明细
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class LogisticsOrderDetailP extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 作业单明细UUID
     */
    @TableId(value = "LOGISTICS_ORDER_DETAIL_UUID", type = IdType.UUID)
    private String logisticsOrderDetailUuid;

    /**
     * 作业单UUID
     */
    @TableField("LOGISTICS_ORDER_UUID")
    private String logisticsOrderUuid;

    /**
     * 作业单号
     */
    @TableField("LOGISTICS_ORDER_NO")
    private String logisticsOrderNo;

    /**
     * 序号
     */
    @TableField("SEQ_NO")
    private Long seqNo;

    /**
     * 运单号(SUBMIT_ORDER_NO)
     */
    @TableField("BILL_NO")
    private String billNo;

    /**
     * 批次号
     */
    @TableField("BATCH_NO")
    private String batchNo;

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
     * 物料编码
     */
    @TableField("EXT_ITEM_CODE")
    private String extItemCode;

    /**
     * 货物名称
     */
    @TableField("GOODS_DESC")
    private String goodsDesc;

    /**
     * 唛头
     */
    @TableField("MARKS_NUMBER")
    private String marksNumber;

    /**
     * 型号
     */
    @TableField("MODEL")
    private String model;

    /**
     * 规格
     */
    @TableField("SPEC")
    private String spec;

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
     * 第二包装数量
     */
    @TableField("SECOND_QTY")
    private BigDecimal secondQty;

    /**
     * 第二包装单位代码
     */
    @TableField("SECOND_UNIT_CODE")
    private String secondUnitCode;

    /**
     * 第二包装单位描述
     */
    @TableField("SECOND_UNIT_DESC")
    private String secondUnitDesc;

    /**
     * 第三包装数量
     */
    @TableField("THIRD_QTY")
    private BigDecimal thirdQty;

    /**
     * 第三包装单位代码
     */
    @TableField("THIRD_UNIT_CODE")
    private String thirdUnitCode;

    /**
     * 第三包装单位描述
     */
    @TableField("THIRD_UNIT_DESC")
    private String thirdUnitDesc;

    /**
     * 重量单位
     */
    @TableField("WEIGHT_UNIT_CODE")
    private String weightUnitCode;

    /**
     * 重量单位描述
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
     * 体积单位描述
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
     * 合计
     */
    @TableField("TOTAL_PRICE")
    private BigDecimal totalPrice;

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
     * 危险品UN代码
     */
    @TableField("DANGER_CODE")
    private String dangerCode;

    /**
     * 交付数量
     */
    @TableField("DELIVERED_QTY")
    private BigDecimal deliveredQty;

    /**
     * 确认数量
     */
    @TableField("CONFIRMED_QTY")
    private BigDecimal confirmedQty;

    /**
     * 货物类型
     */
    @TableField("GOODS_KIND")
    private String goodsKind;

    /**
     * 货物属性
     */
    @TableField("GOODS_NATURE")
    private String goodsNature;

    /**
     * 包装编码（箱名号）
     */
    @TableField("PACKAGE_NO")
    private String packageNo;

    /**
     * 包装类型（箱型）
     */
    @TableField("PACKAGE_TYPE")
    private String packageType;

    @TableField("BOM_CODE")
    private String bomCode;

    /**
     * 货物条码
     */
    @TableField("BARCODE")
    private String barcode;

    /**
     * 控制字
     */
    @TableField("CONTROL_WORD")
    private String controlWord;

    /**
     * 来源作业单明细UUID
     */
    @TableField("IN_LOGISTICS_ORDER_DETAIL_UUID")
    private String inLogisticsOrderDetailUuid;

    /**
     * 来源作业单号
     */
    @TableField("IN_LOGISTICS_ORDER_NO")
    private String inLogisticsOrderNo;

    /**
     * INSTOCK_DETAIL_NO
     */
    @TableField("REMAIN_HOLD_UUID")
    private String remainHoldUuid;

    /**
     * 源货架
     */
    @TableField("SOURCE_LOT_CODE")
    private String sourceLotCode;

    /**
     * 目的货架
     */
    @TableField("TARGET_LOT_CODE")
    private String targetLotCode;

    /**
     * 操作状态
     */
    @TableField("TRANSACTION_STATUS")
    private String transactionStatus;

    /**
     * 操作类型
     */
    @TableField("TRANSACTION_TYPE")
    private String transactionType;

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
     * SOD 明细 UUID 
     */
    @TableField("SUBMIT_ORDER_DETAIL_UUID")
    private String submitOrderDetailUuid;

    /**
     * 物料生产日期
     */
    @TableField("PRODUCTION_DATE")
    private Date productionDate;


}
