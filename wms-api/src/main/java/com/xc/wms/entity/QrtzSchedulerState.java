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
public class QrtzSchedulerState implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "INSTANCE_NAME", type = IdType.UUID)
    private String instanceName;

    @TableField("LAST_CHECKIN_TIME")
    private Long lastCheckinTime;

    @TableField("CHECKIN_INTERVAL")
    private Long checkinInterval;


}
