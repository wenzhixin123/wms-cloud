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
 * 
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class QuartzClusteredTest extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableId(value = "QUARTZ_UUID", type = IdType.UUID)
    private String quartzUuid;

    @TableField("QUARTZ_SERVER")
    private String quartzServer;

    @TableField("LOG_TEXT")
    private String logText;

    @TableField("RUN_TIME")
    private Date runTime;

    @TableField("FILE_NAME")
    private String fileName;

    @TableField("METHID_NAME")
    private String methidName;


}
