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
public class BasSiteCust implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "BAS_SITE_CUST_UUID", type = IdType.UUID)
    private String basSiteCustUuid;

    @TableField("BAS_SITE_UUID")
    private String basSiteUuid;

    @TableField("DATE_TYPE")
    private String dateType;

    @TableField("SEQ_NO")
    private Long seqNo;

    @TableField("LOC_CODE")
    private String locCode;

    @TableField("LOC_NAME")
    private String locName;

    @TableField("CUSTOMER_CODE")
    private String customerCode;

    @TableField("CUSTOMER_NAME")
    private String customerName;

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


}
