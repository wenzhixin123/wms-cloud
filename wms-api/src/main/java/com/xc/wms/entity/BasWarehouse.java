package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * <p>
 * 仓库信息表
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BasWarehouse extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 仓库UUID
     */
    @TableId(value = "BAS_WAREHOUSE_UUID", type = IdType.UUID)
    private String basWarehouseUuid;

    @TableField("BAS_WAREHOUSE_TYPE_UUID")
    private String basWarehouseTypeUuid;

    @TableField("PRE_BAS_WAREHOUSE_UUID")
    private String preBasWarehouseUuid;

    /**
     * 仓库编号
     */
    @TableField("WAREHOUSE_CODE")
    private String warehouseCode;

    /**
     * 仓库名称
     */
    @TableField("WAREHOUSE_NAME")
    private String warehouseName;

    @TableField("WAREHOUSE_NAME_EN")
    private String warehouseNameEn;

    /**
     * 仓库容量(立方)
     */
    @TableField("WAREHOUSE_CAPACITY")
    private BigDecimal warehouseCapacity;

    /**
     * 仓库地址
     */
    @TableField("WAREHOUSE_ADDRESS")
    private String warehouseAddress;

    /**
     * 服务区域
     */
    @TableField("SERVICE_AREA")
    private String serviceArea;

    /**
     * 时效
     */
    @TableField("SERVICE_AGING")
    private BigDecimal serviceAging;

    /**
     * 控制字
     */
    @TableField("CONTROL_WORD")
    private String controlWord;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

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
     * 状态：ACTIVE - 有效； Cancel - 作废
     */
    @TableField("STATUS")
    private String status;


}
