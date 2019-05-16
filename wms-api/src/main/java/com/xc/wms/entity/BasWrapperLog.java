package com.xc.wms.entity;

import java.math.BigDecimal;
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
public class BasWrapperLog implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 包材操作日志主键
     */
    @TableId(value = "BAS_WRAPPER_LOG_UUID", type = IdType.UUID)
    private String basWrapperLogUuid;

    /**
     * 货物编码
     */
    @TableField("ITEM_CODE")
    private String itemCode;

    /**
     * 包材编码
     */
    @TableField("WRAPPER_CODE")
    private String wrapperCode;

    /**
     * 包材名称
     */
    @TableField("WRAPPER_NAME")
    private String wrapperName;

    /**
     * 包材英文名
     */
    @TableField("WRAPPER_NAME_CN")
    private String wrapperNameCn;

    /**
     * 操作类型
     */
    @TableField("OPERATE_TYPE")
    private String operateType;

    /**
     * 操作内容
     */
    @TableField("OPERATE_CONTENT")
    private String operateContent;

    /**
     * 状态
     */
    @TableField("STATUS")
    private String status;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 包材数量
     */
    @TableField("WRAPPER_QTY")
    private BigDecimal wrapperQty;

    /**
     * 控制字
     */
    @TableField("CONTROL_WORD")
    private String controlWord;

    /**
     * 仓库代码
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
     * 自定义字段1
     */
    @TableField("AUX1")
    private String aux1;

    /**
     * 自定义字段2
     */
    @TableField("AUX2")
    private String aux2;

    /**
     * 自定义字段3
     */
    @TableField("AUX3")
    private String aux3;

    /**
     * 自定义字段4
     */
    @TableField("AUX4")
    private String aux4;

    /**
     * 自定义字段5
     */
    @TableField("AUX5")
    private String aux5;


}
