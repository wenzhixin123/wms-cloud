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
 * 上架和拣货策略
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LocPlanConfig implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 上架和拣货策略UUID
     */
    @TableId(value = "LOC_PLAN_CONFIG_UUID", type = IdType.UUID)
    private String locPlanConfigUuid;

    /**
     * 上架和拣货策略号
     */
    @TableField("CONFIG_CODE")
    private String configCode;

    /**
     * 上架和拣货策略描述
     */
    @TableField("CONFIG_NAME")
    private String configName;

    @TableField("CONFIG_NAME_EN")
    private String configNameEn;

    /**
     * 策略类型：上架、拣货
     */
    @TableField("CONFIG_TYPE")
    private String configType;

    /**
     * 开始日期
     */
    @TableField("BEGIN_DATE")
    private Date beginDate;

    /**
     * 结束日期
     */
    @TableField("END_DATE")
    private Date endDate;

    /**
     * 取消日期
     */
    @TableField("CANCEL_DATE")
    private Date cancelDate;

    /**
     * 客户代码
     */
    @TableField("CUSTOMER_CODE")
    private String customerCode;

    /**
     * 客户名称
     */
    @TableField("CUSTOMER_NAME")
    private String customerName;

    /**
     * 状态：ACTIVE - 有效； Cancel - 作废
     */
    @TableField("STATUS")
    private String status;

    /**
     * 控制字
     */
    @TableField("CONTROL_WORD")
    private String controlWord;

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
     * 公司（仓库）代码
     */
    @TableField("OFFICE_CODE")
    private String officeCode;

    /**
     * 并发访问控制
     */
    @TableField("REC_VER")
    private BigDecimal recVer;

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
     * 下一级策略编码
     */
    @TableField("NEXT_CONFIG_CODE")
    private String nextConfigCode;

    /**
     * 用户代码（策略与人员关联）
     */
    @TableField("USER_CODE")
    private String userCode;


}
