package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.sql.Blob;
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
public class QrtzJobDetails implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "JOB_NAME", type = IdType.UUID)
    private String jobName;

    @TableField("JOB_GROUP")
    private String jobGroup;

    @TableField("DESCRIPTION")
    private String description;

    @TableField("JOB_CLASS_NAME")
    private String jobClassName;

    @TableField("IS_DURABLE")
    private String isDurable;

    @TableField("IS_VOLATILE")
    private String isVolatile;

    @TableField("IS_STATEFUL")
    private String isStateful;

    @TableField("REQUESTS_RECOVERY")
    private String requestsRecovery;

    @TableField("JOB_DATA")
    private Blob jobData;


}
