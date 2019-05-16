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
public class PaymentBills implements Serializable {

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

    /**
     * 公司代码
     */
    @TableField("OFFICE_CODE")
    private String officeCode;

    /**
     * 访问并发控制
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


}
