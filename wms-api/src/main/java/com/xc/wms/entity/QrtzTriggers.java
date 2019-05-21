package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.sql.Blob;

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
public class QrtzTriggers extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableId(value = "TRIGGER_NAME", type = IdType.UUID)
    private String triggerName;

    @TableField("TRIGGER_GROUP")
    private String triggerGroup;

    @TableField("JOB_NAME")
    private String jobName;

    @TableField("JOB_GROUP")
    private String jobGroup;

    @TableField("IS_VOLATILE")
    private String isVolatile;

    @TableField("DESCRIPTION")
    private String description;

    @TableField("NEXT_FIRE_TIME")
    private Long nextFireTime;

    @TableField("PREV_FIRE_TIME")
    private Long prevFireTime;

    @TableField("PRIORITY")
    private Long priority;

    @TableField("TRIGGER_STATE")
    private String triggerState;

    @TableField("TRIGGER_TYPE")
    private String triggerType;

    @TableField("START_TIME")
    private Long startTime;

    @TableField("END_TIME")
    private Long endTime;

    @TableField("CALENDAR_NAME")
    private String calendarName;

    @TableField("MISFIRE_INSTR")
    private Integer misfireInstr;

    @TableField("JOB_DATA")
    private Blob jobData;


}
