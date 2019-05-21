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
public class EnterpriseOrderLog extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 订单日志主键
     */
    @TableId(value = "Enterprise_Order_Log_UUID", type = IdType.UUID)
    private String enterpriseOrderLogUuid;

    /**
     * 订单主键
     */
    @TableField("Enterprise_Order_UUID")
    private String enterpriseOrderUuid;

    /**
     * 订单明细主键
     */
    @TableField("Enterprise_Order_Detail_UUID")
    private String enterpriseOrderDetailUuid;

    /**
     * 传输类型
     */
    @TableField("Transcation_Type")
    private String transcationType;

    /**
     * 公司别
     */
    @TableField("Company_Id")
    private String companyId;

    /**
     * 订单号
     */
    @TableField("Order_No")
    private String orderNo;

    /**
     * 订单类型
     */
    @TableField("Order_Type")
    private String orderType;

    /**
     * 序列号
     */
    @TableField("Seq_No")
    private Long seqNo;

    /**
     * 状态
     */
    @TableField("Status")
    private String Status;

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
     * 并发控制
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


}
