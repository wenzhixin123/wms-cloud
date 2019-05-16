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
public class BasSiteTest implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "BAS_SITE_UUID", type = IdType.AUTO)
    private Integer basSiteUuid;

    @TableField("PRE_BAS_SITE_UUID")
    private Integer preBasSiteUuid;

    @TableField("SITE_NAME")
    private String siteName;


}
