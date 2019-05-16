package com.xc.wms.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 委托订单货物细项
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SubmitOrderDetail implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 委托单明细UUID
     */
    @TableId(value = "SUBMIT_ORDER_DETAIL_UUID", type = IdType.UUID)
    private String submitOrderDetailUuid;

    /**
     * 委托单UUID
     */
    @TableField("SUBMIT_ORDER_UUID")
    private String submitOrderUuid;

    /**
     * 委托单号
     */
    @TableField("SUBMIT_ORDER_NO")
    private String submitOrderNo;

    /**
     * 序号
     */
    @TableField("SEQ_NO")
    private Long seqNo;

    /**
     * 运单号
     */
    @TableField("BILL_NO")
    private String billNo;

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
     * 控制字
     */
    @TableField("CONTROL_WORD")
    private String controlWord;

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
     * 公司（仓库）代码
     */
    @TableField("OFFICE_CODE")
    private String officeCode;

    /**
     * 并发访问控制
     */
    @TableField("REC_VER")
    private Long recVer;

    /**
     * 创建人
     */
    @TableField("CREATOR")
    private String creator;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private Date createTime;

    /**
     * 修改人
     */
    @TableField("MODIFIER")
    private String modifier;

    /**
     * 修改时间
     */
    @TableField("MODIFY_TIME")
    private Date modifyTime;

    /**
     * 物料生产日期
     */
    @TableField("PRODUCTION_DATE")
    private Date productionDate;

    /**
     * 卖家ID  一般情况下，货主ID和卖家ID相同 WLB
     */
    @TableField("USER_ID")
    private Long userId;

    /**
     * 来源作业单明细UUID
     */
    @TableField("IN_LOGISTICS_ORDER_DETAIL_UUID")
    private String inLogisticsOrderDetailUuid;

    /**
     * 装序
     */
    @TableField("LOAD_SEQ_NO")
    private Long loadSeqNo;

    @TableField("MAXLOAD_SEQ_NO")
    private Long maxloadSeqNo;


}
