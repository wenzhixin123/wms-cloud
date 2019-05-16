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
 * 仓库货位类型
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BasLocType implements Serializable {

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
