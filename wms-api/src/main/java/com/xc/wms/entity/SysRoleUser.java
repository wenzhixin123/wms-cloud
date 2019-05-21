package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户角色分配
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SysRoleUser extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 用户角色分配UUID
     */
    @TableId(value = "SYS_ROLE_USER_UUID", type = IdType.UUID)
    private String sysRoleUserUuid;

    /**
     * 角色UUID
     */
    @TableField("SYS_ROLE_UUID")
    private String sysRoleUuid;

    /**
     * UUID
     */
    @TableField("USER_UUID")
    private String userUuid;

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


}
