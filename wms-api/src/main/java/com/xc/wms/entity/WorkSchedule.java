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
public class WorkSchedule extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 排班表主键
     */
    @TableId(value = "WORK_SCHEDULE_UUID", type = IdType.UUID)
    private String workScheduleUuid;

    /**
     * 人员编号
     */
    @TableField("PERSON_ID")
    private String personId;

    /**
     * 人员名称
     */
    @TableField("PERSON_NAME")
    private String personName;

    /**
     * 是否上班
     */
    @TableField("ON_WORK")
    private String onWork;

    /**
     * 工作计数
     */
    @TableField("WORK_COUNT")
    private Long workCount;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 控制位
     */
    @TableField("CONTROL_WORD")
    private String controlWord;

    /**
     * 状态
     */
    @TableField("STATUS")
    private String status;

    /**
     * 扩展字段1
     */
    @TableField("AUX1")
    private String aux1;

    /**
     * 扩展字段2
     */
    @TableField("AUX2")
    private String aux2;

    /**
     * 扩展字段3
     */
    @TableField("AUX3")
    private String aux3;

    /**
     * 扩展字段4
     */
    @TableField("AUX4")
    private String aux4;

    /**
     * 扩展字段5
     */
    @TableField("AUX5")
    private String aux5;


}
