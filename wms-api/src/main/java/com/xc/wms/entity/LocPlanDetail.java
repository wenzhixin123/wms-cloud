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
 * 
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LocPlanDetail implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "LOC_PLAN_DETAIL_UUID", type = IdType.UUID)
    private String locPlanDetailUuid;

    @TableField("LOC_PLAN_UUID")
    private String locPlanUuid;

    @TableField("LOGISTICS_ORDER_UUID")
    private String logisticsOrderUuid;

    @TableField("LOGISTICS_ORDER_DETAIL_UUID")
    private String logisticsOrderDetailUuid;

    @TableField("IN_LOGISTICS_ORDER_DETAIL_UUID")
    private String inLogisticsOrderDetailUuid;

    @TableField("IN_STOCK_WORK_UUID")
    private String inStockWorkUuid;

    @TableField("LOC_PLAN_TYPE")
    private String locPlanType;

    @TableField("LOC_PLAN_DESC")
    private String locPlanDesc;

    @TableField("BATCH_NO")
    private String batchNo;

    @TableField("ITEM_CODE")
    private String itemCode;

    @TableField("ITEM_SEQNO")
    private String itemSeqno;

    @TableField("EXT_ITEM_CODE")
    private String extItemCode;

    @TableField("GOODS_DESC")
    private String goodsDesc;

    @TableField("MARKS_NUMBER")
    private String marksNumber;

    @TableField("MODEL")
    private String model;

    @TableField("SPEC")
    private String spec;

    @TableField("LENGTH_UNIT_CODE")
    private String lengthUnitCode;

    @TableField("LENGTH_UNIT_DESC")
    private String lengthUnitDesc;

    @TableField("LENGTH")
    private BigDecimal length;

    @TableField("WIDTH")
    private BigDecimal width;

    @TableField("HEIGHT")
    private BigDecimal height;

    @TableField("QTY")
    private BigDecimal qty;

    @TableField("UNIT_CODE")
    private String unitCode;

    @TableField("UNIT_DESC")
    private String unitDesc;

    @TableField("WEIGHT_UNIT_CODE")
    private String weightUnitCode;

    @TableField("WEIGHT_UNIT_DESC")
    private String weightUnitDesc;

    @TableField("GROSS_WEIGHT")
    private BigDecimal grossWeight;

    @TableField("NET_WEIGHT")
    private BigDecimal netWeight;

    @TableField("VOLUME_UNIT_CODE")
    private String volumeUnitCode;

    @TableField("VOLUME_UNIT_DESC")
    private String volumeUnitDesc;

    @TableField("VOLUME")
    private BigDecimal volume;

    @TableField("SECOND_QTY")
    private BigDecimal secondQty;

    @TableField("SECOND_UNIT_CODE")
    private String secondUnitCode;

    @TableField("SECOND_UNIT_DESC")
    private String secondUnitDesc;

    @TableField("THIRD_QTY")
    private BigDecimal thirdQty;

    @TableField("THIRD_UNIT_CODE")
    private String thirdUnitCode;

    @TableField("THIRD_UNIT_DESC")
    private String thirdUnitDesc;

    @TableField("GOODS_NATURE")
    private String goodsNature;

    @TableField("GOODS_KIND")
    private String goodsKind;

    /**
     * 拣货顺序
     */
    @TableField("SEQ_NO")
    private BigDecimal seqNo;

    @TableField("LOT_CODE")
    private String lotCode;

    @TableField("DANGER_CODE")
    private String dangerCode;

    @TableField("PACKAGE_NO")
    private String packageNo;

    @TableField("PACKAGE_TYPE")
    private String packageType;

    @TableField("SOURCE_LOT_CODE")
    private String sourceLotCode;

    @TableField("TARGET_LOT_CODE")
    private String targetLotCode;

    @TableField("BARCODE")
    private String barcode;

    @TableField("PANEL_NO")
    private String panelNo;

    @TableField("WRH_WORKER")
    private String wrhWorker;

    @TableField("WRH_CUST")
    private String wrhCust;

    @TableField("STATUS")
    private String status;

    @TableField("CONTROL_WORD")
    private String controlWord;

    @TableField("REMARK")
    private String remark;

    @TableField("AUX1")
    private String aux1;

    @TableField("AUX2")
    private String aux2;

    @TableField("AUX3")
    private String aux3;

    @TableField("AUX4")
    private String aux4;

    @TableField("AUX5")
    private String aux5;

    @TableField("OFFICE_CODE")
    private String officeCode;

    @TableField("REC_VER")
    private Long recVer;

    @TableField("CREATOR")
    private String creator;

    @TableField("CREATE_TIME")
    private Date createTime;

    @TableField("MODIFIER")
    private String modifier;

    @TableField("MODIFY_TIME")
    private Date modifyTime;

    @TableField("CONFIRMED_QTY")
    private BigDecimal confirmedQty;

    @TableField("BAS_WRAPPER_UUID")
    private String basWrapperUuid;

    @TableField("BAS_WRAPPER_PROJECT")
    private String basWrapperProject;


}
