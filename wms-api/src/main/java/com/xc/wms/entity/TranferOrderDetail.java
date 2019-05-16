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
public class TranferOrderDetail implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 在途仓出库明细表主键
     */
    @TableId(value = "TRANFER_ORDER_DETAIL_UUID", type = IdType.UUID)
    private String tranferOrderDetailUuid;

    /**
     * 在途仓出库表主键
     */
    @TableField("TRANFER_ORDER_UUID")
    private String tranferOrderUuid;

    /**
     * 在途仓出库单号
     */
    @TableField("TRANFER_ORDER_NO")
    private String tranferOrderNo;

    /**
     * 物料编码
     */
    @TableField("ITEM_CODE")
    private String itemCode;

    /**
     * 物料名称
     */
    @TableField("ITEM_NAME")
    private String itemName;

    /**
     * 物料出库数量
     */
    @TableField("ITEM_QTY")
    private BigDecimal itemQty;

    /**
     * 包装单位
     */
    @TableField("QTY_UNIT_CODE")
    private String qtyUnitCode;

    /**
     * 包装单位描述
     */
    @TableField("QTY_UNIT_DESC")
    private String qtyUnitDesc;

    /**
     * 规格
     */
    @TableField("SPEC")
    private String spec;

    /**
     * 型号
     */
    @TableField("MODEL")
    private String model;

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
     * 仓库代码
     */
    @TableField("OFFICE_CODE")
    private String officeCode;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private Date createTime;

    /**
     * 创建人
     */
    @TableField("CREATOR")
    private String creator;

    /**
     * 修改人
     */
    @TableField("Modifier")
    private String Modifier;

    /**
     * 修改时间
     */
    @TableField("Modify_Time")
    private Date modifyTime;

    /**
     * 并发控制
     */
    @TableField("Rec_Ver")
    private Long recVer;

    /**
     * 控制字
     */
    @TableField("Control_Word")
    private String controlWord;


}
