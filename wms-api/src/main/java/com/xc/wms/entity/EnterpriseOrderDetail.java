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
public class EnterpriseOrderDetail implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 订单明细主键
     */
    @TableId(value = "Enterprise_Order_Detail_UUID", type = IdType.UUID)
    private String enterpriseOrderDetailUuid;

    /**
     * 订单主键
     */
    @TableField("Enterprise_Order_UUID")
    private String enterpriseOrderUuid;

    /**
     * 公司别
     */
    @TableField("Company_Id")
    private String companyId;

    /**
     * 订单号
     */
    @TableField("Order_No")
    private String orderNo;

    /**
     * 订单类型
     */
    @TableField("Order_Type")
    private String orderType;

    /**
     * 序列号
     */
    @TableField("Seq_No")
    private Long seqNo;

    /**
     * 物品编号
     */
    @TableField("Item_code")
    private String itemCode;

    /**
     * 数量
     */
    @TableField("Qty")
    private Double Qty;

    /**
     * 物品类型
     */
    @TableField("Product_Type")
    private String productType;

    /**
     * 单价
     */
    @TableField("Product_Price")
    private BigDecimal productPrice;

    /**
     * 币别
     */
    @TableField("Currency_Code")
    private String currencyCode;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    /**
     * 状态
     */
    @TableField("Status")
    private String Status;

    /**
     * 控制字
     */
    @TableField("Control_Word")
    private String controlWord;

    /**
     * 公司代码
     */
    @TableField("Office_Code")
    private String officeCode;

    /**
     * 并发控制
     */
    @TableField("Rec_Ver")
    private Long recVer;

    /**
     * 创建人
     */
    @TableField("Creator")
    private String Creator;

    /**
     * 创建时间
     */
    @TableField("Create_Time")
    private Date createTime;

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
     * 物料描述
     */
    @TableField("Goods_desc")
    private String goodsDesc;

    /**
     * 规格
     */
    @TableField("Spec")
    private String Spec;

    /**
     * 型号
     */
    @TableField("Model")
    private String Model;

    /**
     * 数量单位代码
     */
    @TableField("Qty_Unit_Code")
    private String qtyUnitCode;

    /**
     * 数量单位描述
     */
    @TableField("Qty_Unit_Desc")
    private String qtyUnitDesc;

    /**
     * 产品code
     */
    private String productCode;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 其他物料編碼
     */
    @TableField("EXT_ITEM_CODE")
    private String extItemCode;


}
