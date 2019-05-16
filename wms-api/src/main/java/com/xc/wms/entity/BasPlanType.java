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
public class BasPlanType implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "PLAN_TYPE_UUID", type = IdType.UUID)
    private String planTypeUuid;

    @TableField("PLAN_TYPE_CODE")
    private String planTypeCode;

    @TableField("PLAN_TYPE_NAME")
    private String planTypeName;

    @TableField("PLAN_TYPE_NAME_EN")
    private String planTypeNameEn;

    @TableField("REMARK")
    private String remark;

    @TableField("STATUS")
    private String status;

    @TableField("CENTER_CODE")
    private String centerCode;

    @TableField("CONTROL_WORD")
    private String controlWord;

    @TableField("OFFICE_CODE")
    private String officeCode;

    @TableField("REC_VER")
    private Long recVer;

    @TableField("CREATOR")
    private String creator;

    @TableField("CREATE_TIME")
    private Date createTime;

    @TableField("MODIFIER")
    private String modifier;

    @TableField("MODIFY_TIME")
    private Date modifyTime;


}
