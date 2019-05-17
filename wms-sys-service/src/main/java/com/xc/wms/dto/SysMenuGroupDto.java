package com.xc.wms.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.xc.wms.entity.SysMenuItem;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysMenuGroupDto implements Serializable {

    /**
     * 一级菜单UUID
     */
    @TableId(value = "SYS_MENU_GROUP_UUID", type = IdType.UUID)
    private String sysMenuGroupUuid;

    /**
     * 模块UUID
     */
    @TableField("SYS_MODULE_UUID")
    private String sysModuleUuid;

    @TableField("PRE_SYS_MENU_GROUP_UUID")
    private String preSysMenuGroupUuid;

    /**
     * 菜单组序号
     */
    @TableField("MENU_GRP_SEQ")
    private Double menuGrpSeq;

    /**
     * 菜单分组代码
     */
    @TableField("MENU_GRP_CODE")
    private String menuGrpCode;

    /**
     * 菜单分组中文名
     */
    @TableField("MENU_GRP_NAME")
    private String menuGrpName;

    /**
     * 菜单分组英文名
     */
    @TableField("MENU_GRP_NAME_EN")
    private String menuGrpNameEn;

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

    public List<SysMenuItem> sysMenuItemList;

    private List<Object> children=new ArrayList<Object>();

    public void addChild(Object child){
        children.add(child);
    }



}
