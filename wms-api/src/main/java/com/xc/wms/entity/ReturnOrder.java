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
public class ReturnOrder extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 退包表主键
     */
    @TableId(value = "RETURN_ORDER_UUID", type = IdType.UUID)
    private String returnOrderUuid;

    /**
     * 退包单号
     */
    @TableField("RETURN_ORDER_NO")
    private String returnOrderNo;

    /**
     * 销售单号
     */
    @TableField("ORDER_NO")
    private String orderNo;

    /**
     * 采购单号
     */
    @TableField("PURCHASE_NO")
    private String purchaseNo;

    /**
     * 报废单号
     */
    @TableField("SCRAP_NO")
    private String scrapNo;

    /**
     * 公司别
     */
    @TableField("COMPANY_ID")
    private String companyId;

    /**
     * 快递公司
     */
    @TableField("EXPRESS_COMPANY")
    private String expressCompany;

    /**
     * 快递单号
     */
    @TableField("EXPRESS_LIST_NO")
    private String expressListNo;

    /**
     * 手机号
     */
    @TableField("TELEPHONE")
    private String telephone;

    /**
     * 收件人
     */
    @TableField("SENDEE")
    private String sendee;

    /**
     * 状态
     */
    @TableField("STATUS")
    private String status;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 自定义字段1
     */
    @TableField("AUX1")
    private String aux1;

    /**
     * 自定义字段2
     */
    @TableField("AUX2")
    private String aux2;

    /**
     * 自定义字段3
     */
    @TableField("AUX3")
    private String aux3;

    /**
     * 自定义字段4
     */
    @TableField("AUX4")
    private String aux4;

    /**
     * 自定义字段5
     */
    @TableField("AUX5")
    private String aux5;

    /**
     * 修改时间
     */
    @TableField("Modify_Time")
    private Date modifyTime;

    @TableField("Modifier")
    private String Modifier;

    /**
     * 并发控制
     */
    @TableField("Rec_Ver")
    private Long recVer;

    /**
     * 控制字
     */
    @TableField("Control_Word")
    private String controlWord;

    /**
     * 退回类型
     */
    @TableField("RETURN_TYPE")
    private String returnType;


}
