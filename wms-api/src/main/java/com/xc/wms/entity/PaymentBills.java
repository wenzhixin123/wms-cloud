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
public class PaymentBills extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 付款单主键
     */
    @TableId(value = "PAYMENT_BILLS_UUID", type = IdType.UUID)
    private String paymentBillsUuid;

    /**
     * 付款单编号
     */
    @TableField("PAYMENT_NO")
    private String paymentNo;

    /**
     * 销售订单号
     */
    @TableField("ORDER_NO")
    private String orderNo;

    /**
     * 付款金额
     */
    @TableField("AMOUNT")
    private BigDecimal amount;

    /**
     * 币别
     */
    @TableField("CURRENCY_CODE")
    private String currencyCode;

    /**
     * 传输状态
     */
    @TableField("TRANS_STATUS")
    private String transStatus;

    /**
     * 是否已到帐
     */
    @TableField("ARRIVAL_STATUS")
    private String arrivalStatus;

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


}
