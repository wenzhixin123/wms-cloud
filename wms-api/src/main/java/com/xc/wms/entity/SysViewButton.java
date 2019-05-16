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
 * 界面按钮
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysViewButton implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 界面按钮UUID
     */
    @TableId(value = "SYS_VIEW_BUTTON_UUID", type = IdType.UUID)
    private String sysViewButtonUuid;

    /**
     * 菜单项UUID
     */
    @TableField("SYS_MENU_ITEM_UUID")
    private String sysMenuItemUuid;

    /**
     * 按钮代码
     */
    @TableField("BTN_CODE")
    private String btnCode;

    /**
     * 按钮名
     */
    @TableField("BTN_NAME")
    private String btnName;

    /**
     * 按钮英文名
     */
    @TableField("BTN_NAME_EN")
    private String btnNameEn;

    /**
     * 按钮链接
     */
    @TableField("BTN_URL")
    private String btnUrl;

    /**
     * 按钮提交权限
     */
    @TableField("BTN_ACTION")
    private String btnAction;

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
