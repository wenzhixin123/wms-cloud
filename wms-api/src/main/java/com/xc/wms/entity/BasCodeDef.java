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
 * 数据字典表
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BasCodeDef implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 主键UUID
     */
    @TableId(value = "BAS_CODE_DEF_UUID", type = IdType.UUID)
    private String basCodeDefUuid;

    /**
     * 类型UUID
     */
    @TableField("BAS_CODE_TYPE_UUID")
    private String basCodeTypeUuid;

    /**
     * 代码值
     */
    @TableField("CODE_VALUE")
    private String codeValue;

    @TableField("CODE_NUMBER")
    private BigDecimal codeNumber;

    /**
     * 编码内容（中文）
     */
    @TableField("DISPLAY_VALUE")
    private String displayValue;

    /**
     * 编码内容（英文）
     */
    @TableField("DISPLAY_VALUE_EN")
    private String displayValueEn;

    /**
     * 是否允许修改
     */
    @TableField("MODIFIABLE")
    private Integer modifiable;

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
     * 中心代码
     */
    @TableField("CENTER_CODE")
    private String centerCode;

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
