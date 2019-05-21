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
 * 仓库货位类型
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BasLocType extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 货位类型UUID
     */
    @TableId(value = "BAS_BAS_LOC_TYPE_UUID", type = IdType.UUID)
    private String basBasLocTypeUuid;

    /**
     * 货位类型代码
     */
    @TableField("LOC_TYPE_CODE")
    private String locTypeCode;

    /**
     * 货位类型名称
     */
    @TableField("LOC_TYPE_NAME")
    private String locTypeName;

    /**
     * 货位类型描述
     */
    @TableField("LOC_TYPE_NAME_EN")
    private String locTypeNameEn;

    /**
     * 优先级
     */
    @TableField("PRI")
    private Long pri;

    /**
     * 上架优先级
     */
    @TableField("PUT_PRI")
    private Long putPri;

    /**
     * 拣货优先级
     */
    @TableField("PICK_PRI")
    private Long pickPri;

    /**
     * 最大堆放层数
     */
    @TableField("MAX_PALLET_FLOOR")
    private Long maxPalletFloor;

    /**
     * 最大体积
     */
    @TableField("MAX_VOLUEM")
    private BigDecimal maxVoluem;

    /**
     * 最大重量
     */
    @TableField("MAX_WEIGHT")
    private BigDecimal maxWeight;

    /**
     * 最大托盘数
     */
    @TableField("MAX_PALLET_QTY")
    private Long maxPalletQty;

    /**
     * 长
     */
    @TableField("LENGTH")
    private BigDecimal length;

    /**
     * 宽
     */
    @TableField("WIDTH")
    private BigDecimal width;

    /**
     * 高
     */
    @TableField("HEIGHT")
    private BigDecimal height;

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


}
