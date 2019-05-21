package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 仓库区域
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BasLocAreaLog extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     *  仓库区域表UUID
     */
    @TableId(value = "BAS_LOC_AREA_LOG_UUID", type = IdType.UUID)
    private String basLocAreaLogUuid;

    /**
     * 拣货区UUID
     */
    @TableField("BAS_LOC_AREA_UUID")
    private String basLocAreaUuid;

    /**
     * 区域代码
     */
    @TableField("LOC_AREA_CODE")
    private String locAreaCode;

    /**
     * 区域名称
     */
    @TableField("LOC_AREA_NAME")
    private String locAreaName;

    /**
     * 区域描述
     */
    @TableField("LOC_AREA_NAME_EN")
    private String locAreaNameEn;

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

    /**
     * 拣货人
     */
    @TableField("OPERATOR")
    private String operator;


}
