package com.xc.wms.entity;

import java.math.BigDecimal;
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
public class WorkOrderLog implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 排班表日志主键
     */
    @TableId(value = "Work_Sechdule_Log_UUID", type = IdType.UUID)
    private String workSechduleLogUuid;

    /**
     * 序列号
     */
    @TableField("Work_Sechdule_Log_Seq")
    private Integer workSechduleLogSeq;

    /**
     * 操作类型
     */
    @TableField("Work_Type")
    private String workType;

    /**
     * 人员编号
     */
    @TableField("Person_Id")
    private String personId;

    /**
     * 人员名称
     */
    @TableField("Person_Name")
    private String personName;

    /**
     * 操作描述
     */
    @TableField("Work_Desc")
    private String workDesc;

    /**
     * 操作日期
     */
    @TableField("Work_Date")
    private Date workDate;

    /**
     * 工作量计数
     */
    @TableField("Work_Count")
    private BigDecimal workCount;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    /**
     * 控制位
     */
    @TableField("Control_Word")
    private String controlWord;

    /**
     * 状态
     */
    @TableField("Status")
    private String Status;

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
    @TableField("Office_Code")
    private String officeCode;

    /**
     * 并发控制逻辑
     */
    @TableField("Rec_Ver")
    private Long recVer;

    /**
     * 创建人
     */
    @TableField("Creator")
    private String Creator;

    /**
     * 创建时间
     */
    @TableField("Create_Time")
    private Date createTime;

    /**
     * 修改者
     */
    @TableField("Modifier")
    private String Modifier;

    /**
     * 修改时间
     */
    @TableField("Modify_Time")
    private Date modifyTime;


}
