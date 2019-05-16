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
public class ReturnOrderDetail implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 退包明细表主键
     */
    @TableId(value = "RETURN_ORDER_DETAIL_UUID", type = IdType.UUID)
    private String returnOrderDetailUuid;

    /**
     * 退包表主键
     */
    @TableField("RETURN_ORDER_UUID")
    private String returnOrderUuid;

    /**
     * 退包单号
     */
    @TableField("RETURN_ORDER_NO")
    private String returnOrderNo;

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
     * 商品编码
     */
    @TableField("EXT_ITEM_CODE")
    private String extItemCode;

    /**
     * 单物料退回总数
     */
    @TableField("ITEM_QTY")
    private BigDecimal itemQty;

    /**
     * 单物料入库总数
     */
    @TableField("IN_QTY")
    private BigDecimal inQty;

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

    /**
     * 单位
     */
    @TableField("QTY_UNIT_CODE")
    private String qtyUnitCode;


}
