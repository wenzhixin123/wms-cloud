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
 * 货位
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BasLotStock extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 货位UUID
     */
    @TableId(value = "BAS_LOT_STOCK_UUID", type = IdType.UUID)
    private String basLotStockUuid;

    /**
     *  仓库区域表UUID
     */
    @TableField("BAS_LOC_AREA_UUID")
    private String basLocAreaUuid;

    @TableField("BAS_BAS_LOC_TYPE_CODE")
    private String basBasLocTypeCode;

    /**
     * 货位编号
     */
    @TableField("LOT_CODE")
    private String lotCode;

    /**
     * 货位名称
     */
    @TableField("LOT_NAME")
    private String lotName;

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
     * 货架位置-行
     */
    @TableField("LOT_X")
    private BigDecimal lotX;

    /**
     * 货架位置-列
     */
    @TableField("LOT_Y")
    private BigDecimal lotY;

    /**
     * 货架位置-高
     */
    @TableField("LOT_Z")
    private BigDecimal lotZ;

    /**
     * 锁定
     */
    @TableField("LOCK_FLAG")
    private String lockFlag;

    /**
     * 物料编码
     */
    @TableField("ITEM_CODE")
    private String itemCode;

    /**
     * 安全库存
     */
    @TableField("SAFETY_STOCK")
    private BigDecimal safetyStock;

    /**
     * 每箱数量
     */
    @TableField("VITUAL_STOCK")
    private BigDecimal vitualStock;

    /**
     * 最大库存
     */
    @TableField("MAX_STOCK")
    private BigDecimal maxStock;

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

    /**
     * 控制字：默认0
     */
    @TableField("CONTROL_WORD")
    private String controlWord;

    /**
     * 车位占用的车次
     */
    @TableField("TRACTOR_UUID")
    private String tractorUuid;

    /**
     * 是否不允许派位：I–不允许卸车派位；E-不允许装车派位
     */
    @TableField("IS_LOCK_SEND")
    private String isLockSend;

    /**
     * 电子标签ID
     */
    @TableField("LIGHT_ID")
    private String lightId;

    /**
     * 公司别代码
     */
    @TableField("AGENT_CONSIGNEE_CODE")
    private String agentConsigneeCode;

    /**
     * 公司别名称
     */
    @TableField("AGENT_CONSIGNEE_DESC")
    private String agentConsigneeDesc;


}
