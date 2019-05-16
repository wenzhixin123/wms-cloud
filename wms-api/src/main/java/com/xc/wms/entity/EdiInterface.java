package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.sql.Blob;
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
public class EdiInterface implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "EDI_INTERFACE_UUID", type = IdType.UUID)
    private String ediInterfaceUuid;

    @TableField("EDI_TYPE")
    private String ediType;

    @TableField("EDI_DATE")
    private Date ediDate;

    @TableField("EDI_DESC")
    private String ediDesc;

    @TableField("SEND_CODE")
    private String sendCode;

    @TableField("SEND_NAME")
    private String sendName;

    @TableField("RECEIPT_CODE")
    private String receiptCode;

    @TableField("RECEIPT_NAME")
    private String receiptName;

    @TableField("ORDER_NO")
    private String orderNo;

    @TableField("ORDER_UUID")
    private String orderUuid;

    @TableField("EDI_FORMAT")
    private String ediFormat;

    @TableField("EDI_NAME")
    private String ediName;

    @TableField("EDI_MESSAGE")
    private Blob ediMessage;

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


}
