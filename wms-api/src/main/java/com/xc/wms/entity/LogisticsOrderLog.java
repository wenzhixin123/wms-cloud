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
 *  作业单操作记录
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class LogisticsOrderLog extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 操作记录的UUID
     */
    @TableId(value = "LOGISTICS_ORDER_LOG_UUID", type = IdType.UUID)
    private String logisticsOrderLogUuid;

    /**
     * 作业单UUID
     */
    @TableField("LOGISTICS_ORDER_UUID")
    private String logisticsOrderUuid;

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


}
