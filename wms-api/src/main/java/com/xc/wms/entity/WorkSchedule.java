package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WorkSchedule implements Serializable {

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

    /**
     * 公司代码
     */
    @TableField("OFFICE_CODE")
    private String officeCode;

    /**
     * 访问并发控制
     */
    @TableField("REC_VER")
    private Long recVer;

    /**
     * 创建人
     */
    @TableField("CREATOR")
    private String creator;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private Date createTime;

    /**
     * 修改人
     */
    @TableField("MODIFIER")
    private String modifier;

    /**
     * 修改时间
     */
    @TableField("MODIFY_TIME")
    private Date modifyTime;


}
