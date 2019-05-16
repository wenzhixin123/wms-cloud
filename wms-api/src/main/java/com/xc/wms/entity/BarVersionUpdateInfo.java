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
 * 巴枪版本更新记录表
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BarVersionUpdateInfo implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 唯一主键
     */
    @TableId(value = "BAR_UUID", type = IdType.UUID)
    private String barUuid;

    /**
     * 仓库代码
     */
    @TableField("OFFICE_CODE")
    private String officeCode;

    /**
     * 当前更新文件名称
     */
    @TableField("CURRENT_FILE_NAME")
    private String currentFileName;

    /**
     * 上一版本文件名称
     */
    @TableField("HISTORY_FILE_NAME")
    private String historyFileName;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 版本号控制
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
