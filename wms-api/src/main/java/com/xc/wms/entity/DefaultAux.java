package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 默认扩充字段（针对所有表）
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class DefaultAux extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 唯一主键
     */
    @TableId(value = "DEFAULT_AUX_UUID", type = IdType.UUID)
    private String defaultAuxUuid;

    /**
     * 类型：SO、SOD、LO、LOD
     */
    @TableField("AUX_TYPE")
    private String auxType;

    /**
     * 关联UUID
     */
    @TableField("ORDER_UUID")
    private String orderUuid;

    /**
     * 关联单号
     */
    @TableField("ORDER_NO")
    private String orderNo;

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

    /**
     * 自定义字段6
     */
    @TableField("AUX6")
    private String aux6;

    /**
     * 自定义字段7
     */
    @TableField("AUX7")
    private String aux7;

    /**
     * 自定义字段8
     */
    @TableField("AUX8")
    private String aux8;

    /**
     * 自定义字段9
     */
    @TableField("AUX9")
    private String aux9;

    /**
     * 自定义字段10
     */
    @TableField("AUX10")
    private String aux10;

    /**
     * 自定义字段11
     */
    @TableField("AUX11")
    private String aux11;

    /**
     * 自定义字段12
     */
    @TableField("AUX12")
    private String aux12;

    /**
     * 自定义字段13
     */
    @TableField("AUX13")
    private String aux13;

    /**
     * 自定义字段14
     */
    @TableField("AUX14")
    private String aux14;

    /**
     * 自定义字段15
     */
    @TableField("AUX15")
    private String aux15;

    /**
     * 自定义字段16
     */
    @TableField("AUX16")
    private String aux16;

    /**
     * 自定义字段17
     */
    @TableField("AUX17")
    private String aux17;

    /**
     * 自定义字段18
     */
    @TableField("AUX18")
    private String aux18;

    /**
     * 自定义字段19
     */
    @TableField("AUX19")
    private String aux19;

    /**
     * 自定义字段20
     */
    @TableField("AUX20")
    private String aux20;

    /**
     * 控制位
     */
    @TableField("CONTROL_WORD")
    private String controlWord;


}
