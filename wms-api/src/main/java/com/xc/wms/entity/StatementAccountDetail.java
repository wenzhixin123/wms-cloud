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
public class StatementAccountDetail implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 对账单明细表主键
     */
    @TableId(value = "STATEMENT_ACCOUNT_DETAIL_UUID", type = IdType.UUID)
    private String statementAccountDetailUuid;

    /**
     * 对账单表主键
     */
    @TableField("STATEMENT_ACCOUNT_UUID")
    private String statementAccountUuid;

    /**
     * 对账单号
     */
    @TableField("STATEMENT_ACCOUNT_NO")
    private String statementAccountNo;

    /**
     * 账单类型  0 应付运费，1 应付服务费
     */
    @TableField("STATEMENT_TYPE")
    private String statementType;

    /**
     * 序列号
     */
    @TableField("SEQ_NO")
    private Long seqNo;

    /**
     * 快递单号
     */
    @TableField("EXPRESS_LIST_NO")
    private String expressListNo;

    /**
     * 转单号/退单号
     */
    @TableField("EXT_EXPRESS_LIST_NO")
    private String extExpressListNo;

    /**
     * 交寄日期
     */
    @TableField("EXPRESS_DATE")
    private Date expressDate;

    /**
     * 邮寄地址
     */
    @TableField("DELIVERY_ADDRESS")
    private String deliveryAddress;

    /**
     * 销售订单号
     */
    @TableField("ORDER_NO")
    private String orderNo;

    /**
     * 结算部门
     */
    @TableField("SETTLEMENT_DEPARTMENT")
    private String settlementDepartment;

    /**
     * 实际重量
     */
    @TableField("ACTUAL_WEIGHT")
    private BigDecimal actualWeight;

    /**
     * 计费重量
     */
    @TableField("PAY_WEIGHT")
    private BigDecimal payWeight;

    /**
     * 代收货款
     */
    @TableField("PAYMENT_COLLECTION")
    private BigDecimal paymentCollection;

    /**
     * 服务费
     */
    @TableField("SERVICE_AMOUNT")
    private BigDecimal serviceAmount;

    /**
     * 系统代收货款金额
     */
    @TableField("SYSTEM_PAYMENT_COLLECTION")
    private BigDecimal systemPaymentCollection;

    /**
     * 代收费率
     */
    @TableField("PAYMENT_COLLECTION_RATIO")
    private BigDecimal paymentCollectionRatio;

    /**
     * 运费
     */
    @TableField("EXPRESS_AMOUNT")
    private BigDecimal expressAmount;

    /**
     * 折扣金额
     */
    @TableField("OFF_AMOUNT")
    private BigDecimal offAmount;

    /**
     * 应付用费
     */
    @TableField("FREIGHT_RECEIVABLE")
    private BigDecimal freightReceivable;

    /**
     * 币别
     */
    @TableField("CURRENCY_CODE")
    private String currencyCode;

    /**
     * 结算状态
     */
    @TableField("SETTLEMENT_STATUS")
    private String settlementStatus;

    /**
     * 快递状态
     */
    @TableField("EXPRESS_STATUS")
    private String expressStatus;

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

    /**
     * 快递公司运费金额是否与系统运费金额有差异，0 ，无差异，1有差异
     */
    @TableField("IF_DIFF_EXPRESS_AMOUT")
    private String ifDiffExpressAmout;

    /**
     * 系统计算的运费
     */
    @TableField("SYSTEM_EXPRESS_AMOUNT")
    private BigDecimal systemExpressAmount;


}
