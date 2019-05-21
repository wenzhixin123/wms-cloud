package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *  仓库类型
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BasWarehouseType extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableId(value = "BAS_WAREHOUSE_TYPE_UUID", type = IdType.UUID)
    private String basWarehouseTypeUuid;

    /**
     * 仓库类型代码
     */
    @TableField("WA_TYPE_CODE")
    private String waTypeCode;

    /**
     * 仓库类型名称
     */
    @TableField("WA_TYPE_NAME")
    private String waTypeName;

    /**
     * 仓库类型描述
     */
    @TableField("WA_TYPE_NAME_EN")
    private String waTypeNameEn;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 状态：ACTIVE - 有效； Cancel - 作废
     */
    @TableField("STATUS")
    private String status;

    /**
     * 控制字：默认0
     */
    @TableField("CONTROL_WORD")
    private String controlWord;


}
