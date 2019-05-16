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
public class EnterpriseOrderP implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 订单主键
     */
    @TableId(value = "Enterprise_Order_UUID", type = IdType.UUID)
    private String enterpriseOrderUuid;

    /**
     * 公司别
     */
    @TableField("Company_Id")
    private String companyId;

    /**
     * 订单编号
     */
    @TableField("Order_No")
    private String orderNo;

    /**
     * 订单类型
     */
    @TableField("Order_Type")
    private String orderType;

    /**
     * 订单日期
     */
    @TableField("Order_Date")
    private Date orderDate;

    /**
     * 订单金额
     */
    @TableField("Order_Amount")
    private BigDecimal orderAmount;

    /**
     * 金额
     */
    @TableField("Amount")
    private BigDecimal Amount;

    /**
     * 快递金额
     */
    @TableField("Express_Amount")
    private BigDecimal expressAmount;

    /**
     * 优惠金额
     */
    @TableField("Sales_Amount")
    private BigDecimal salesAmount;

    /**
     * 币别
     */
    @TableField("Currency_Code")
    private String currencyCode;

    /**
     * 供应商/客户
     */
    @TableField("Consignee")
    private String Consignee;

    /**
     * 电话
     */
    @TableField("Telephone")
    private String Telephone;

    /**
     * 地址
     */
    @TableField("Address")
    private String Address;

    /**
     * 快递公司
     */
    @TableField("Express_Company")
    private String expressCompany;

    /**
     * 下单人
     */
    @TableField("Buyer")
    private String Buyer;

    /**
     * 状态
     */
    @TableField("Status")
    private String Status;

    /**
     * 快递状态
     */
    @TableField("Express_Status")
    private String expressStatus;

    /**
     * 库内状态
     */
    @TableField("Order_Stcok_Status")
    private String orderStcokStatus;

    /**
     * 控制位
     */
    @TableField("Control_Word")
    private String controlWord;

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
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    /**
     * 公司代码
     */
    @TableField("Office_Code")
    private String officeCode;

    /**
     * 并发访问控制
     */
    @TableField("Rec_Ver")
    private Long recVer;

    /**
     * 创建人
     */
    @TableField("Creator")
    private String Creator;

    /**
     * 创建时间
     */
    @TableField("Create_Time")
    private Date createTime;

    /**
     * 修改人
     */
    @TableField("Modifier")
    private String Modifier;

    /**
     * 修改时间
     */
    @TableField("Modify_Time")
    private Date modifyTime;

    /**
     * 到货时间
     */
    @TableField("Delivery_date")
    private Date deliveryDate;

    /**
     * 中转快递公司
     */
    @TableField("Ext_Express_Company")
    private String extExpressCompany;

    /**
     * 快递单号
     */
    @TableField("Express_List_No")
    private String expressListNo;

    /**
     * 中转快递单号
     */
    @TableField("Ext_Express_List_No")
    private String extExpressListNo;

    /**
     * 收货人
     */
    private String sendee;

    /**
     * 作业项目
     */
    @TableField("DELIVERY_TYPE")
    private String deliveryType;

    /**
     * 省
     */
    @TableField("PROVINCE")
    private String province;

    /**
     * 市
     */
    @TableField("CITY")
    private String city;

    /**
     * 区域
     */
    @TableField("AREA")
    private String area;

    /**
     * 发票(抬头)
     */
    private String invoiceTitle;

    /**
     * 毛重(顶扫重量回写)
     */
    @TableField("GROSS_WEIGHT")
    private BigDecimal grossWeight;

    /**
     * 工作人
     */
    @TableField("WORK_PERSON")
    private String workPerson;

    /**
     * 发票号
     */
    @TableField("INVOICE_NO")
    private String invoiceNo;

    /**
     * 异常信息
     */
    @TableField("ERROR_LOG")
    private String errorLog;

    /**
     * 快递对账重量
     */
    @TableField("EXPRESS_WEIGHT")
    private BigDecimal expressWeight;


}
