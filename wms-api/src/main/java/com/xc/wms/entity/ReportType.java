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
public class ReportType extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableId(value = "REPORT_TYPE_UUID", type = IdType.UUID)
    private String reportTypeUuid;

    @TableField("TYPE_CODE")
    private String typeCode;

    @TableField("TYPE_NAME")
    private String typeName;

    @TableField("MANAGER_CLASS")
    private String managerClass;

    @TableField("FUNCTION")
    private String function;

    @TableField("PARAMETER")
    private String parameter;

    @TableField("REMARK")
    private String remark;

    @TableField("STATUS")
    private String status;

    @TableField("CONTROL_WORD")
    private String controlWord;

    @TableField("AUX1")
    private String aux1;

    @TableField("AUX2")
    private String aux2;

    @TableField("AUX3")
    private String aux3;

    @TableField("AUX4")
    private String aux4;

    @TableField("AUX5")
    private String aux5;


}
