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
public class OptionControlType extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableId(value = "OC_TYPE_UUID", type = IdType.UUID)
    private String ocTypeUuid;

    @TableField("OC_TYPE_CODE")
    private String ocTypeCode;

    @TableField("OC_TYPE_NAME")
    private String ocTypeName;

    @TableField("OC_TYPE_NAME_EN")
    private String ocTypeNameEn;

    @TableField("REMARK")
    private String remark;

    @TableField("STATUS")
    private String status;

    @TableField("CENTER_CODE")
    private String centerCode;

    @TableField("CONTROL_WORD")
    private String controlWord;


}
