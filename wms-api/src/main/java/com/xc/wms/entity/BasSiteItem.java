package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

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
public class BasSiteItem extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableId(value = "BAS_SITE_ITEM_UUID", type = IdType.UUID)
    private String basSiteItemUuid;

    @TableField("BAS_SITE_UUID")
    private String basSiteUuid;

    @TableField("SITE_NAME")
    private String siteName;

    @TableField("SITE_TYPE")
    private String siteType;

    @TableField("CUSTOMER_CODE")
    private String customerCode;

    @TableField("CUSTOMER_NAME")
    private String customerName;

    @TableField("ITEM_CODE")
    private String itemCode;

    @TableField("ITEM_NAME")
    private String itemName;

    @TableField("EXPRESS_CODE")
    private String expressCode;

    @TableField("EXPRESS_NAME")
    private String expressName;

    @TableField("IS_AUTO")
    private String isAuto;

    @TableField("FIRST_WEIGHT")
    private BigDecimal firstWeight;

    @TableField("SECOND_WEIGHT")
    private BigDecimal secondWeight;

    @TableField("REMARK")
    private String remark;

    @TableField("STATUS")
    private String status;

    @TableField("CONTROL_WORD")
    private String controlWord;

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

    @TableField("LAST_EXPRESS_CODE")
    private String lastExpressCode;

    @TableField("LAST_EXPRESS_NAME")
    private String lastExpressName;

    @TableField("CONFIG_TYPE")
    private String configType;

    @TableField("SEQ_NO")
    private Long seqNo;

    @TableField("IS_INVALID")
    private String isInvalid;

    @TableField("FINAL_EXPRESS_CODE")
    private String finalExpressCode;

    @TableField("FINAL_EXPRESS_NAME")
    private String finalExpressName;


}
