package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 包装单位信息
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BasUnit extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 包装单位UUID
     */
    @TableId(value = "BAS_UNIT_UUID", type = IdType.UUID)
    private String basUnitUuid;

    /**
     * 包装单位代码
     */
    @TableField("UNIT_CODE")
    private String unitCode;

    /**
     * 包装单位名称
     */
    @TableField("UNIT_NAME")
    private String unitName;

    /**
     * 包装单位英文名
     */
    @TableField("UNIT_NAME_EN")
    private String unitNameEn;

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
     * 中心代码
     */
    @TableField("CENTER_CODE")
    private String centerCode;

    /**
     * 控制字：默认0
     */
    @TableField("CONTROL_WORD")
    private String controlWord;

    @TableField("EXT_CUST_CODE")
    private String extCustCode;


}
