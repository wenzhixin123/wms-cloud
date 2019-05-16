package com.xc.wms.entity;

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
public class EdiConfig implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "EDI_CONFIG_UUID", type = IdType.UUID)
    private String ediConfigUuid;

    @TableField("CONFIG_TYPE")
    private String configType;

    @TableField("CONFIG_NAME")
    private String configName;

    @TableField("SENDER_CODE")
    private String senderCode;

    @TableField("SENDER_NAME")
    private String senderName;

    @TableField("RECEIPTOR_CODE")
    private String receiptorCode;

    @TableField("RECEIPTOR_NAME")
    private String receiptorName;

    @TableField("REPORT_TYPE_UUID")
    private String reportTypeUuid;

    @TableField("REPORT_NAME")
    private String reportName;

    @TableField("EXCHANGE_MODE")
    private String exchangeMode;

    @TableField("EXCHANGE_URL")
    private String exchangeUrl;

    @TableField("ACCOUNT")
    private String account;

    @TableField("PASSWORD")
    private String password;

    @TableField("DEFAULT_PATH")
    private String defaultPath;

    @TableField("START_TIME")
    private Date startTime;

    @TableField("END_TIME")
    private Date endTime;

    @TableField("REPEAT_COUNT")
    private Double repeatCount;

    @TableField("REPEAT_INTERVAL")
    private Double repeatInterval;

    @TableField("CRON_EXPRESSIONS")
    private String cronExpressions;

    @TableField("MAX_DATE_BX")
    private Double maxDateBx;

    @TableField("MAX_ROW_BX")
    private Double maxRowBx;

    @TableField("TIME_OUT")
    private Double timeOut;

    @TableField("IS_AUTO")
    private String isAuto;

    @TableField("IS_DELETE")
    private String isDelete;

    @TableField("IS_EMPTY")
    private String isEmpty;

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

    @TableField("SEND_CONDITIONS")
    private String sendConditions;

    @TableField("EDI_SENDER_CODE")
    private String ediSenderCode;

    @TableField("EDI_RECEIVER_CODE")
    private String ediReceiverCode;


}
