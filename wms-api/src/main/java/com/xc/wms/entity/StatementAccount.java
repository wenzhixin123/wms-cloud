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
 * 
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class StatementAccount extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 对账单主键
     */
    @TableId(value = "STATEMENT_ACCOUNT_UUID", type = IdType.UUID)
    private String statementAccountUuid;

    /**
     * 对账单号
     */
    @TableField("STATEMENT_ACCOUNT_NO")
    private String statementAccountNo;

    /**
     * 账单类型
     */
    @TableField("STATEMENT_TYPE")
    private String statementType;

    /**
     * 快递公司编码
     */
    @TableField("CUSTOMER_CODE")
    private String customerCode;

    /**
     * 快递公司名称
     */
    @TableField("CUSTOMER_NAME")
    private String customerName;

    /**
     * 结算金额
     */
    @TableField("AMOUNT")
    private BigDecimal amount;

    /**
     * 结算代码
     */
    @TableField("SETTLEMENT_NO")
    private String settlementNo;

    /**
     * 结算状态
     */
    @TableField("SETTLEMENT_STATUS")
    private String settlementStatus;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 控制位
     */
    @TableField("CONTROL_WORD")
    private String controlWord;

    /**
     * 状态
     */
    @TableField("STATUS")
    private String status;

    /**
     * 扩展字段1
     */
    @TableField("AUX1")
    private String aux1;

    /**
     * 扩展字段2
     */
    @TableField("AUX2")
    private String aux2;

    /**
     * 扩展字段3
     */
    @TableField("AUX3")
    private String aux3;

    /**
     * 扩展字段4
     */
    @TableField("AUX4")
    private String aux4;

    /**
     * 扩展字段5
     */
    @TableField("AUX5")
    private String aux5;

    /**
     * 交寄日期
     */
    @TableField("EXPRESS_DATE")
    private Date expressDate;


}
