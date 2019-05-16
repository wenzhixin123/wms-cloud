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
 * 角色
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysRole implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 角色UUID
     */
    @TableId(value = "SYS_ROLE_UUID", type = IdType.UUID)
    private String sysRoleUuid;

    /**
     * 角色代码
     */
    @TableField("ROLE_CODE")
    private String roleCode;

    /**
     * 角色中文名
     */
    @TableField("ROLE_NAME")
    private String roleName;

    /**
     * 角色英文名称
     */
    @TableField("ROLE_NAME_EN")
    private String roleNameEn;

    /**
     * 允许查询
     */
    @TableField("CAN_QUERYALL_FLAG")
    private Integer canQueryallFlag;

    /**
     * 虚拟的
     */
    @TableField("IS_VIRTUAL_FLAG")
    private Integer isVirtualFlag;

    /**
     * 生效日期
     */
    @TableField("ACTIVE_DATE")
    private Date activeDate;

    /**
     * 失效日期
     */
    @TableField("EXPIRED_DATE")
    private Date expiredDate;

    /**
     * 删除标志
     */
    @TableField("DELETED_FLAG")
    private Integer deletedFlag;

    /**
     * 角色类别
     */
    @TableField("ROLE_TYPE")
    private String roleType;

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
     * 控制字：默认0
     */
    @TableField("CONTROL_WORD")
    private String controlWord;

    /**
     * 公司（仓库）代码
     */
    @TableField("OFFICE_CODE")
    private String officeCode;

    /**
     * 并发访问控制
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
