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
public class TemplateType extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableId(value = "TEMPLATE_TYPE_UUID", type = IdType.UUID)
    private String templateTypeUuid;

    @TableField("TEMPLATE_TYPE_CODE")
    private String templateTypeCode;

    @TableField("TEMPLATE_NAME")
    private String templateName;

    @TableField("TEMPLATE_NAME_EN")
    private String templateNameEn;

    @TableField("REMARK")
    private String remark;

    @TableField("STATUS")
    private String status;

    @TableField("CENTER_CODE")
    private String centerCode;

    @TableField("CONTROL_WORD")
    private String controlWord;

    @TableField("TYPE_GROUP")
    private String typeGroup;


}
