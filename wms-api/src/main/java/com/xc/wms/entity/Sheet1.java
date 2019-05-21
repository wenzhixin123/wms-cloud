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
public class Sheet1 extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableId(value = "BAS_SITE_UUID", type = IdType.UUID)
    private String basSiteUuid;

    @TableField("PRE_BAS_SITE_UUID")
    private String preBasSiteUuid;

    @TableField("SITE_NAME")
    private String siteName;


}
