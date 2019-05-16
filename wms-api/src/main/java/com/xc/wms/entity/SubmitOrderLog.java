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
 * 委托订单操作记录
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SubmitOrderLog implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 操作记录的UUID
     */
    @TableId(value = "SUBMIT_ORDER_LOG_UUID", type = IdType.UUID)
    private String submitOrderLogUuid;

    /**
     * 委托单UUID号
     */
    @TableField("SUBMIT_ORDER_UUID")
    private String submitOrderUuid;

    /**
     * 操作类型
     */
    @TableField("TRANSACTION_TYPE")
    private String transactionType;

    /**
     * 操作描述
     */
    @TableField("WORK_DESC")
    private String workDesc;

    /**
     * 操作时间
     */
    @TableField("WORK_DATE")
    private Date workDate;

    /**
     * 操作人
     */
    @TableField("WORK_PERSON")
    private String workPerson;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 状态：
     */
    @TableField("STATUS")
    private String status;

    /**
     * 控制字：默认0
     */
    @TableField("CONTROL_WORD")
    private String controlWord;

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
     * 原因
     */
    @TableField("REASON")
    private String reason;

    /**
     * 结果
     */
    @TableField("RESULT")
    private String result;

    /**
     * 分类
     */
    @TableField("SUB_TYPE")
    private String subType;

    /**
     * 负责人
     */
    @TableField("FUNCTIONARY")
    private String functionary;

    /**
     * 完结时间
     */
    @TableField("CONFIRMED_DATE")
    private Date confirmedDate;

    /**
     * 订单服务UUID
     */
    @TableField("SUBMIT_ORDER_SERVICE_UUID")
    private String submitOrderServiceUuid;


}
