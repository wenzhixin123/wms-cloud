package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 港口信息
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BasPort extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableId(value = "PORT_ID", type = IdType.UUID)
    private String portId;

    /**
     * 港口代码
     */
    @TableField("PORT_CODE")
    private String portCode;

    @TableField("PORT_AREA")
    private String portArea;

    @TableField("CITY_CODE")
    private String cityCode;

    /**
     * 港口名称
     */
    @TableField("PORT_NAME")
    private String portName;

    /**
     * 港口英文名
     */
    @TableField("PORT_NAME_EN")
    private String portNameEn;

    @TableField("PORT_KINDS")
    private String portKinds;

    @TableField("PORT_AGENT")
    private String portAgent;

    @TableField("IDD_AREA_CODE")
    private String iddAreaCode;

    @TableField("ROUTE")
    private String route;

    @TableField("PORT_ROUTE")
    private String portRoute;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 控制字：默认0
     */
    @TableField("CONTROL_WORD")
    private String controlWord;

    @TableField("PUB_PORT_ID")
    private String pubPortId;

    @TableField("PUB_PORT_NAME")
    private String pubPortName;

    @TableField("PUB_PORT_NAME_EN")
    private String pubPortNameEn;

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

    @TableField("MNEMONIC_CODE")
    private String mnemonicCode;

    @TableField("MSA_AREA_DESC")
    private String msaAreaDesc;


}
