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
public class OfficeMessage implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "OFFICE_MESSAGE_UUID", type = IdType.UUID)
    private String officeMessageUuid;

    /**
     * 协作单号
     */
    @TableField("MESSAGE_NO")
    private String messageNo;

    /**
     * 协作类型
     */
    @TableField("MESSAGE_TYPE")
    private String messageType;

    /**
     * 办单时间
     */
    @TableField("MESSAGE_DATE")
    private Date messageDate;

    /**
     * 订单uuid
     */
    @TableField("ORDER_UUID")
    private String orderUuid;

    /**
     * 订单号
     */
    @TableField("ORDER_NO")
    private String orderNo;

    @TableField("TITLE")
    private String title;

    /**
     * 内容
     */
    @TableField("CONTENT")
    private String content;

    /**
     * 审计时间
     */
    @TableField("AUDITOR_DATE")
    private Date auditorDate;

    @TableField("PROJECT")
    private String project;

    /**
     * 发起人代码
     */
    @TableField("ORIGINATOR_CODE")
    private String originatorCode;

    /**
     * 发起人名称
     */
    @TableField("ORIGINATOR_NAME")
    private String originatorName;

    /**
     * 部门uuid
     */
    @TableField("DEPARTMENT_UUID")
    private String departmentUuid;

    /**
     * 部门名称
     */
    @TableField("DEPARTMENT_NAME")
    private String departmentName;

    /**
     * 部门类型
     */
    @TableField("DEPARTMENT_TYPE")
    private String departmentType;

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

    @TableField("CONFIRM_SQL")
    private String confirmSql;

    @TableField("CANCEL_SQL")
    private String cancelSql;

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

    @TableField("REMARK")
    private String remark;

    @TableField("STATUS")
    private String status;

    @TableField("CONTROL_WORD")
    private String controlWord;

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

    @TableField("BILL_NO")
    private String billNo;

    @TableField("PRE_OFFICE_MESSAGE_UUID")
    private String preOfficeMessageUuid;

    /**
     * 是否分配
     */
    @TableField("IS_ASSIGN")
    private String isAssign;

    /**
     * 是否关闭
     */
    @TableField("IS_CLOSING")
    private String isClosing;

    /**
     * 是否读取
     */
    @TableField("IS_READ")
    private String isRead;

    @TableField("IS_READ_CUST")
    private String isReadCust;

    /**
     * 客户代码
     */
    @TableField("CUSTOMER_CODE")
    private String customerCode;

    /**
     * 订单金额
     */
    @TableField("ORDER_AMOUNT")
    private BigDecimal orderAmount;


}
