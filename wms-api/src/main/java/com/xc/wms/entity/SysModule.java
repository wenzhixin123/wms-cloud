package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统主菜单（模块条）
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SysModule extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 模块ID
     */
    @TableId(value = "SYS_MODULE_UUID", type = IdType.UUID)
    private String sysModuleUuid;

    /**
     * 菜单组序号
     */
    @TableField("MODULE_SEQ")
    private Double moduleSeq;

    /**
     * 模块代码
     */
    @TableField("MODULE_CODE")
    private String moduleCode;

    /**
     * 模块标题
     */
    @TableField("MODULE_NAME")
    private String moduleName;

    /**
     * 模块说明
     */
    @TableField("MODULE_NAME_EN")
    private String moduleNameEn;

    /**
     * 客户端类型
     */
    @TableField("CLIENT_TYPE")
    private Integer clientType;

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
