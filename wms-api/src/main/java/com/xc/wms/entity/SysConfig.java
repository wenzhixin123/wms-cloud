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
public class SysConfig extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableId(value = "SYS_CONFIG_UUID", type = IdType.UUID)
    private String sysConfigUuid;

    /**
     * 配置项
     */
    @TableField("CONFIG_ITEM")
    private String configItem;

    /**
     * 配置值
     */
    @TableField("CONFIG_VALUE")
    private String configValue;

    /**
     * 配置英文值
     */
    @TableField("CONFIG_VALUE_EN")
    private String configValueEn;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 状态：Active - 有效； Cancel - 作废
     */
    @TableField("STATUS")
    private String status;

    /**
     * 控制字：默认0
     */
    @TableField("CONTROL_WORD")
    private String controlWord;


}
