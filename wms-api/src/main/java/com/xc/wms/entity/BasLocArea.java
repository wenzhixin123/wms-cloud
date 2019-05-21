package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 仓库区域
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BasLocArea extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     *  仓库区域表UUID
     */
    @TableId(value = "BAS_LOC_AREA_UUID", type = IdType.UUID)
    private String basLocAreaUuid;

    /**
     * 仓库UUID
     */
    @TableField("BAS_WAREHOUSE_UUID")
    private String basWarehouseUuid;

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
     * 周转箱数量
     */
    @TableField("CONTAINER_QTY")
    private Integer containerQty;

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
     * 海关区域代码
     */
    @TableField("CUSTOMS_AREA_CODE")
    private String customsAreaCode;

    /**
     * 扫描口
     */
    @TableField("SCAN_PORT")
    private String scanPort;

    /**
     * 拣货人
     */
    @TableField("OPERATOR")
    private String operator;

    /**
     * 货区对于传送带方向（左右）
     */
    @TableField("SCAN_DIRECTION")
    private String scanDirection;


}
