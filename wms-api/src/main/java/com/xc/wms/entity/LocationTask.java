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
 * 库内作业任务表
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class LocationTask extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 作业任务表UUID
     */
    @TableId(value = "LOCATION_TASK_UUID", type = IdType.UUID)
    private String locationTaskUuid;

    /**
     * 作业单明细UUID
     */
    @TableField("LOGISTICS_ORDER_DETAIL_UUID")
    private String logisticsOrderDetailUuid;

    /**
     * 来源作业单货物明细UUID（库存）
     */
    @TableField("IN_LOGISTICS_ORDER_DETAIL_UUID")
    private String inLogisticsOrderDetailUuid;

    /**
     * 库存操作STOCK_WORK的UUID
     */
    @TableField("IN_STOCK_WORK_UUID")
    private String inStockWorkUuid;

    /**
     * 作业任务号
     */
    @TableField("LOC_TASK_NO")
    private String locTaskNo;

    /**
     * 作业时间
     */
    @TableField("LOC_TASK_DATE")
    private Date locTaskDate;

    /**
     * 作业类型（收货、上架、移位、加工等）
     */
    @TableField("LOC_TASK_TYPE")
    private String locTaskType;

    /**
     * 作业描述
     */
    @TableField("LOC_TASK_DESC")
    private String locTaskDesc;

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
    @TableField("UNIT_CODE")
    private String unitCode;

    /**
     * 包装单位描述
     */
    @TableField("UNIT_DESC")
    private String unitDesc;

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
     * 毛重
     */
    @TableField("GROSS_WEIGHT")
    private BigDecimal grossWeight;

    /**
     * 净重
     */
    @TableField("NET_WEIGHT")
    private BigDecimal netWeight;

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
     * 体积
     */
    @TableField("VOLUME")
    private BigDecimal volume;

    /**
     * 控制字
     */
    @TableField("CONTROL_WORD")
    private String controlWord;

    /**
     * 来源作业任务表UUID
     */
    @TableField("LAST_LOCATION_TASK_UUID")
    private String lastLocationTaskUuid;

    /**
     * 操作状态
     */
    @TableField("STATUS")
    private String status;

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
     * 危险品UN代码
     */
    @TableField("DANGER_CODE")
    private String dangerCode;

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

    /**
     * 源货位
     */
    @TableField("SOURCE_LOT_CODE")
    private String sourceLotCode;

    /**
     * 目的货架
     */
    @TableField("TARGET_LOT_CODE")
    private String targetLotCode;

    /**
     * 货物条码
     */
    @TableField("BARCODE")
    private String barcode;

    /**
     * 托盘号
     */
    @TableField("PANEL_NO")
    private String panelNo;

    /**
     * 仓管员
     */
    @TableField("WRH_WORKER")
    private String wrhWorker;

    /**
     * 货物监管员（理货员）
     */
    @TableField("WRH_CUST")
    private String wrhCust;

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
     * 其它单证UUID
     */
    @TableField("OTHER_PK_UUID")
    private String otherPkUuid;

    /**
     * 物料生产日期
     */
    @TableField("PRODUCTION_DATE")
    private Date productionDate;


}
