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
 * 
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class QuartzClusteredTest implements Serializable {

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
