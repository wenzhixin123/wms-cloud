package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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
public class QrtzFiredTriggers extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableId(value = "ENTRY_ID", type = IdType.UUID)
    private String entryId;

    @TableField("TRIGGER_NAME")
    private String triggerName;

    @TableField("TRIGGER_GROUP")
    private String triggerGroup;

    @TableField("IS_VOLATILE")
    private String isVolatile;

    @TableField("INSTANCE_NAME")
    private String instanceName;

    @TableField("FIRED_TIME")
    private Long firedTime;

    @TableField("PRIORITY")
    private Long priority;

    @TableField("STATE")
    private String state;

    @TableField("JOB_NAME")
    private String jobName;

    @TableField("JOB_GROUP")
    private String jobGroup;

    @TableField("IS_STATEFUL")
    private String isStateful;

    @TableField("REQUESTS_RECOVERY")
    private String requestsRecovery;


}
