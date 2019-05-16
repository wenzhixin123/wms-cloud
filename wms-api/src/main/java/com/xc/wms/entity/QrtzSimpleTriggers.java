package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class QrtzSimpleTriggers implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "TRIGGER_NAME", type = IdType.UUID)
    private String triggerName;

    @TableField("TRIGGER_GROUP")
    private String triggerGroup;

    @TableField("REPEAT_COUNT")
    private Integer repeatCount;

    @TableField("REPEAT_INTERVAL")
    private Long repeatInterval;

    @TableField("TIMES_TRIGGERED")
    private Long timesTriggered;


}
