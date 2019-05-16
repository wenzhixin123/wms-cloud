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
public class ExpressAccountRule implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 快递计费规则主键
     */
    @TableId(value = "EXPRESS_ACCOUNT_RULE_UUID", type = IdType.UUID)
    private String expressAccountRuleUuid;

    /**
     * 快递公司主键
     */
    @TableField("BAS_CUSTOMER_UUID")
    private String basCustomerUuid;

    /**
     * 快递计费规则代码
     */
    @TableField("ACCOUNT_RULE_CODE")
    private String accountRuleCode;

    /**
     * 快递计费规则描述
     */
    @TableField("ACCOUNT_RULE_DESCRIPTION")
    private String accountRuleDescription;

    /**
     * 快递公司代码
     */
    @TableField("CUSTOMER_CODE")
    private String customerCode;

    /**
     * 快递公司名称
     */
    @TableField("CUSTOMER_NAME")
    private String customerName;

    /**
     * 有效起始日期
     */
    @TableField("VALID_FROM_DATE")
    private Date validFromDate;

    /**
     * 有效截止日期
     */
    @TableField("VALID_TO_DATE")
    private Date validToDate;

    /**
     * 结算代码
     */
    @TableField("ACCOUNT_DEPT_NO")
    private String accountDeptNo;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 状态
     */
    @TableField("STATUS")
    private String status;

    /**
     * 关键字
     */
    @TableField("CONTROL_WORD")
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
     * 公司(仓库)代码
     */
    @TableField("OFFICE_CODE")
    private String officeCode;

    /**
     * 并发访问控制
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
