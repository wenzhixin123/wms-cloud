package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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
public class OfficeMessageDetail extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableId(value = "OFFICE_MESSAGE_DETAIL_UUID", type = IdType.UUID)
    private String officeMessageDetailUuid;

    @TableField("OFFICE_MESSAGE_UUID")
    private String officeMessageUuid;

    /**
     * 序号
     */
    @TableField("SEQ_NO")
    private Double seqNo;

    /**
     * 内容
     */
    @TableField("CONTENT")
    private String content;

    /**
     * 操作人
     */
    @TableField("OPERATE_PERSON")
    private String operatePerson;

    /**
     * 操作时间
     */
    @TableField("OPERATE_DATE")
    private Date operateDate;

    /**
     * 是否确认
     */
    @TableField("IS_CONFIRM")
    private String isConfirm;

    /**
     * 确认状态
     */
    @TableField("CONFIRM_STATUS")
    private String confirmStatus;

    /**
     * 确认时间
     */
    @TableField("CONFIRM_DATE")
    private Date confirmDate;

    @TableField("REMARK")
    private String remark;

    @TableField("STATUS")
    private String status;

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

    @TableField("CONTROL_WORD")
    private String controlWord;


}
