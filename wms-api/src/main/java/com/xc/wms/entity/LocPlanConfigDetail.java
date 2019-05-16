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
 * 上架和拣货策略明细
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LocPlanConfigDetail implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 上架和拣货策略明细UUID
     */
    @TableId(value = "LOC_PLAN_CONFIG_DETAIL_UUID", type = IdType.UUID)
    private String locPlanConfigDetailUuid;

    /**
     * 上架和拣货策略UUID
     */
    @TableField("LOC_PLAN_CONFIG_UUID")
    private String locPlanConfigUuid;

    @TableField("PRE_LOC_PLAN_CONFIG_DETAIL_UUI")
    private String preLocPlanConfigDetailUui;

    /**
     * 序号
     */
    @TableField("SEQ_NO")
    private BigDecimal seqNo;

    /**
     * 指定字段
     */
    @TableField("FIELD_CODE")
    private String fieldCode;

    /**
     * 指定字段名称
     */
    @TableField("FIELD_NAME")
    private String fieldName;

    /**
     * 指定数值
     */
    @TableField("FIELD_VALUE")
    private String fieldValue;

    /**
     * 数值格式
     */
    @TableField("FIELD_FORMAT")
    private String fieldFormat;

    /**
     * 指定数值名称
     */
    @TableField("VALUE_NAME")
    private String valueName;

    /**
     * 控制符（Y/空）
     */
    @TableField("ANDOR_FLAG")
    private String andorFlag;

    /**
     * 策略标示
     */
    @TableField("PLAN_FLAG")
    private String planFlag;

    /**
     * 约束标识
     */
    @TableField("CONTROL_FLAG")
    private String controlFlag;

    /**
     * 运算符
     */
    @TableField("OPERATION_FLAG")
    private String operationFlag;

    /**
     * 状态：Active － 确认,Pending － 草稿,Cancel － 作废
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


}
