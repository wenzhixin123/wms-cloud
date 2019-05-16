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
 * 仓库区域
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BasLocAreaLog implements Serializable {

private static final long serialVersionUID=1L;

    /**
     *  仓库区域表UUID
     */
    @TableId(value = "BAS_LOC_AREA_LOG_UUID", type = IdType.UUID)
    private String basLocAreaLogUuid;

    /**
     * 拣货区UUID
     */
    @TableField("BAS_LOC_AREA_UUID")
    private String basLocAreaUuid;

    /**
     * 区域代码
     */
    @TableField("LOC_AREA_CODE")
    private String locAreaCode;

    /**
     * 区域名称
     */
    @TableField("LOC_AREA_NAME")
    private String locAreaName;

    /**
     * 区域描述
     */
    @TableField("LOC_AREA_NAME_EN")
    private String locAreaNameEn;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 状态：ACTIVE - 有效； Cancel - 作废
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

    /**
     * 拣货人
     */
    @TableField("OPERATOR")
    private String operator;


}
