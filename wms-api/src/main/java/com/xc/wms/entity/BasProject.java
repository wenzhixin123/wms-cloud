package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 项目名称
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BasProject extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 项目名称UUID
     */
    @TableId(value = "BAS_PROJECT_UUID", type = IdType.UUID)
    private String basProjectUuid;

    /**
     * 项目代码
     */
    @TableField("PROJECT_CODE")
    private String projectCode;

    /**
     * 项目名称
     */
    @TableField("PROJECT_NAME")
    private String projectName;

    /**
     * 项目英文名
     */
    @TableField("PROJECT_NAME_EN")
    private String projectNameEn;

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


}
