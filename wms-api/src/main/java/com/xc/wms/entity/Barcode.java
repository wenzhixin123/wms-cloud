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
 * 条码表
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Barcode implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 条码表UUID
     */
    @TableId(value = "BARCODE_UUID", type = IdType.UUID)
    private String barcodeUuid;

    /**
     * 上级条码UUID
     */
    @TableField("PRE_BARCODE_UUID")
    private String preBarcodeUuid;

    /**
     * 作业单明细UUID
     */
    @TableField("LOGISTICS_ORDER_DETAIL_UUID")
    private String logisticsOrderDetailUuid;

    /**
     * 作业单号
     */
    @TableField("LOGISTICS_ORDER_NO")
    private String logisticsOrderNo;

    /**
     * 作业任务表UUID
     */
    @TableField("IN_STOCK_WORK_UUID")
    private String inStockWorkUuid;

    /**
     * 条码（包装条码、物料条码、托盘条码等）
     */
    @TableField("BARCODE")
    private String barcode;

    /**
     * 条码内容的描述
     */
    @TableField("BARCODE_DESC")
    private String barcodeDesc;

    /**
     * 其它条码
     */
    @TableField("EXT_BARCODE")
    private String extBarcode;

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
     * 托盘号
     */
    @TableField("PANEL_NO")
    private String panelNo;

    /**
     * 数量（打印标签用）
     */
    @TableField("QTY")
    private BigDecimal qty;

    /**
     * 包装单位代码（打印标签用）
     */
    @TableField("QTY_UNIT_CODE")
    private String qtyUnitCode;

    /**
     * 包装单位描述（打印标签用）
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
     * 创建日期
     */
    @TableField("CREATOR_DATE")
    private Date creatorDate;

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
     * 生产日期
     */
    @TableField("PRODUCTION_DATE")
    private Date productionDate;

    /**
     * 批次号
     */
    @TableField("BATCH_NO")
    private String batchNo;


}
