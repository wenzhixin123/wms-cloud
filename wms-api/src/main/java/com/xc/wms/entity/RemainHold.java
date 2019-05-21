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
 * 可出库库存表
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class RemainHold extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * INSTOCK_DETAIL_NO
     */
    @TableId(value = "REMAIN_HOLD_UUID", type = IdType.UUID)
    private String remainHoldUuid;

    /**
     * 作业单货物明细UUID
     */
    @TableField("IN_LOGISTICS_ORDER_DETAIL_UUID")
    private String inLogisticsOrderDetailUuid;

    /**
     * INSTOCK_QTY
     */
    @TableField("INSTOCK_QTY")
    private BigDecimal instockQty;

    /**
     * 第二包装单位
     */
    @TableField("INSTOCK_UNIT_CODE")
    private String instockUnitCode;

    /**
     * 第二包装单位
     */
    @TableField("INSTOCK_UNIT_DESC")
    private String instockUnitDesc;

    /**
     * 第二包装数量
     */
    @TableField("INSTOCK_SECOND_QTY")
    private BigDecimal instockSecondQty;

    /**
     * 第二包装数量
     */
    @TableField("INSTOCK_SECOND_UNIT_CODE")
    private String instockSecondUnitCode;

    /**
     * 第二包装单位
     */
    @TableField("INSTOCK_SECOND_UNIT_DESC")
    private String instockSecondUnitDesc;

    @TableField("INSTOCK_THIRD_QTY")
    private BigDecimal instockThirdQty;

    /**
     * 第二包装数量
     */
    @TableField("INSTOCK_THIRD_UNIT_CODE")
    private String instockThirdUnitCode;

    /**
     * 第二包装单位
     */
    @TableField("INSTOCK_THIRD_UNIT_DESC")
    private String instockThirdUnitDesc;

    /**
     * 净重
     */
    @TableField("INSTOCK_NET_WEIGHT")
    private BigDecimal instockNetWeight;

    /**
     * 毛重
     */
    @TableField("INSTOCK_GROSS_WEIGHT")
    private BigDecimal instockGrossWeight;

    /**
     * INSTOCK_CBM
     */
    @TableField("INSTOCK_VOLUME")
    private BigDecimal instockVolume;

    /**
     * REMAIN_QTY
     */
    @TableField("REMAIN_QTY")
    private BigDecimal remainQty;

    /**
     * 第二包装数量
     */
    @TableField("REMAIN_SECOND_QTY")
    private BigDecimal remainSecondQty;

    @TableField("REMAIN_THIRD_QTY")
    private BigDecimal remainThirdQty;

    /**
     * 毛重
     */
    @TableField("REMAIN_GROSS_WEIGHT")
    private BigDecimal remainGrossWeight;

    /**
     * 净重
     */
    @TableField("REMAIN_NET_WEIGHT")
    private BigDecimal remainNetWeight;

    /**
     * REMAIN_CBM
     */
    @TableField("REMAIN_VOLUME")
    private BigDecimal remainVolume;

    @TableField("HOLD_QTY")
    private BigDecimal holdQty;

    @TableField("HOLD_SECOND_QTY")
    private BigDecimal holdSecondQty;

    @TableField("HOLD_THIRD_QTY")
    private BigDecimal holdThirdQty;

    /**
     * 毛重
     */
    @TableField("HOLD_GROSS_WEIGHT")
    private BigDecimal holdGrossWeight;

    /**
     * 净重
     */
    @TableField("HOLD_NET_WEIGHT")
    private BigDecimal holdNetWeight;

    /**
     * REMAIN_CBM
     */
    @TableField("HOLD_VOLUME")
    private BigDecimal holdVolume;

    /**
     * 批次号
     */
    @TableField("BATCH_NO")
    private String batchNo;

    /**
     * 货物编码
     */
    @TableField("ITEM_CODE")
    private String itemCode;

    /**
     * 物料序列号
     */
    @TableField("ITEM_SEQNO")
    private String itemSeqno;

    /**
     * 货物编码
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
     * 货物条码
     */
    @TableField("BARCODE")
    private String barcode;

    /**
     * 包装编码（箱名号）
     */
    @TableField("PACKAGE_NO")
    private String packageNo;

    /**
     * 货物属性
     */
    @TableField("GOODS_NATURE")
    private String goodsNature;

    /**
     * 货物种类
     */
    @TableField("GOODS_KIND")
    private String goodsKind;

    /**
     * 物料生产日期
     */
    @TableField("PRODUCTION_DATE")
    private Date productionDate;


}
