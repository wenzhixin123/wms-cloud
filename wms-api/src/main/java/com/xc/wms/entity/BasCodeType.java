package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 数据字典类型
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BasCodeType extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     *  类型UUID
     */
    @TableId(value = "BAS_CODE_TYPE_UUID", type = IdType.UUID)
    private String basCodeTypeUuid;

    /**
     * 类型编码
     */
    @TableField("TYPE_CODE")
    private String typeCode;

    /**
     * 类型名称
     */
    @TableField("TYPE_NAME")
    private String typeName;

    /**
     * 类型等级
     */
    @TableField("TYPE_GRADE")
    private Integer typeGrade;

    /**
     * 编码宽度
     */
    @TableField("TYPE_WIDTH")
    private Long typeWidth;

    /**
     * 类型描述
     */
    @TableField("TYPE_DESC")
    private String typeDesc;

    /**
     * 数据类型：字符或数字
     */
    @TableField("DATA_TYPE")
    private String dataType;

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


}
