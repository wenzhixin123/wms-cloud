package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.sql.Blob;
import java.util.Date;

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
public class EdiRequest extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableId(value = "EDI_REQUEST_UUID", type = IdType.UUID)
    private String ediRequestUuid;

    @TableField("EDI_CONFIG_UUID")
    private String ediConfigUuid;

    @TableField("FROM_CUSTOMER_CODE")
    private String fromCustomerCode;

    @TableField("TO_CUSTOMER_CODE")
    private String toCustomerCode;

    @TableField("REQ_TYPE")
    private String reqType;

    @TableField("REQ_DESC")
    private String reqDesc;

    @TableField("REQ_DATE")
    private Date reqDate;

    @TableField("DATA_UUID")
    private String dataUuid;

    @TableField("DATA_XML")
    private Blob dataXml;

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

    @TableField("BX_ROW")
    private Double bxRow;


}
