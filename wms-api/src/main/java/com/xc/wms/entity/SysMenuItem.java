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
 * 菜单项
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysMenuItem implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 菜单项ID
     */
    @TableId(value = "SYS_MENU_ITEM_UUID", type = IdType.UUID)
    private String sysMenuItemUuid;

    /**
     * 一级菜单ID
     */
    @TableField("SYS_MENU_GROUP_UUID")
    private String sysMenuGroupUuid;

    /**
     * 菜单排序号
     */
    @TableField("MENU_ITEM_SEQ")
    private Double menuItemSeq;

    /**
     * 菜单代码
     */
    @TableField("MENU_ITEM_CODE")
    private String menuItemCode;

    /**
     * 菜单中文名
     */
    @TableField("MENU_ITEM_NAME")
    private String menuItemName;

    /**
     * 菜单英文名
     */
    @TableField("MENU_ITEM_NAME_CN")
    private String menuItemNameCn;

    /**
     * 菜单链接
     */
    @TableField("MENU_ITEM_URL")
    private String menuItemUrl;

    /**
     * 功能提交权限
     */
    @TableField("MENU_ITEM_ACTION")
    private String menuItemAction;

    /**
     * 类 名称
     */
    @TableField("CLASS_NAME")
    private String className;

    /**
     * 是否对话框
     */
    @TableField("IS_DIALOG")
    private Integer isDialog;

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
