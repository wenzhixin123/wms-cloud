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
 * 物料资料主表
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ItemMaster implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 物料主表UUID
     */
    @TableId(value = "ITEM_MASTER_UUID", type = IdType.UUID)
    private String itemMasterUuid;

    @TableField("ITEM_NATURE_CODE")
    private String itemNatureCode;

    @TableField("ITEM_KIND_CODE")
    private String itemKindCode;

    /**
     * 客户代码
     */
    @TableField("CUSTOMER_CODE")
    private String customerCode;

    /**
     * 客户名称
     */
    @TableField("CUSTOMER_NAME")
    private String customerName;

    /**
     * 货物编码
     */
    @TableField("ITEM_CODE")
    private String itemCode;

    /**
     * 货物名称
     */
    @TableField("ITEM_NAME")
    private String itemName;

    /**
     * 物料描述
     */
    @TableField("ITEM_NAME_EN")
    private String itemNameEn;

    /**
     * 物料简称
     */
    @TableField("ITEM_SHORTNAME")
    private String itemShortname;

    /**
     * 外部物料编码
     */
    @TableField("EXT_ITEM_CODE")
    private String extItemCode;

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
     * 单价
     */
    @TableField("UNIT_PRICE")
    private BigDecimal unitPrice;

    /**
     * 长度单位
     */
    @TableField("LENGTH_UNIT_CODE")
    private String lengthUnitCode;

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
     * 体积
     */
    @TableField("VOLUME")
    private BigDecimal volume;

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

    /**
     * 状态：ACTIVE - 有效； Cancel - 作废
     */
    @TableField("STATUS")
    private String status;

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
     * 商家代码
     */
    @TableField("CARGO_CONSIGNEE_CODE")
    private String cargoConsigneeCode;

    /**
     * 商家名称
     */
    @TableField("CARGO_CONSIGNEE_DESC")
    private String cargoConsigneeDesc;

    /**
     * WLB商品ID WLB
     */
    @TableField("ITEM_ID")
    private String itemId;

    /**
     * 商品版本，WLB允许货主修改商品属性描述，每修改一次就对应一个商品版本信息 WLB
     */
    @TableField("ITEM_VERSION")
    private String itemVersion;

    /**
     * 预警数
     */
    @TableField("WARN_QTY")
    private BigDecimal warnQty;

    /**
     * 计量单位
     */
    @TableField("UNIT_CODE")
    private String unitCode;


}
