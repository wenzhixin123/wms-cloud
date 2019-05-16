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
 * 系统主菜单（模块条）
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysModule implements Serializable {

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
