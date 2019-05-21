package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ProductItemMaster extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 产品明细主键
     */
    @TableId(value = "Product_Item_UUID", type = IdType.UUID)
    private String productItemUuid;

    /**
     * 产品主键
     */
    @TableField("Product_Master_UUID")
    private String productMasterUuid;

    @TableField("Item_Master_UUID")
    private String itemMasterUuid;

    /**
     * 产品代码
     */
    @TableField("Product_Code")
    private String productCode;

    /**
     * 产品名称
     */
    @TableField("Product_Name")
    private String productName;

    /**
     * 产品中文名称
     */
    @TableField("Product_Name_En")
    private String productNameEn;

    /**
     * 序号
     */
    @TableField("Seq_No")
    private Integer seqNo;

    /**
     * 物料编码
     */
    @TableField("Item_Code")
    private String itemCode;

    /**
     * 物料名称
     */
    @TableField("Item_Name")
    private String itemName;

    /**
     * 料物英文名称
     */
    @TableField("Item_Name_En")
    private String itemNameEn;

    /**
     * 组成数量
     */
    @TableField("Component_Qty")
    private Integer componentQty;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    /**
     * 控制位
     */
    @TableField("Control_Word")
    private String controlWord;

    /**
     * 状态
     */
    @TableField("Status")
    private String Status;

    /**
     * 扩展字段1
     */
    @TableField("AUX1")
    private String aux1;

    /**
     * 扩展字段2
     */
    @TableField("AUX2")
    private String aux2;

    /**
     * 扩展字段3
     */
    @TableField("AUX3")
    private String aux3;

    /**
     * 扩展字段4
     */
    @TableField("AUX4")
    private String aux4;

    /**
     * 扩展字段5
     */
    @TableField("AUX5")
    private String aux5;

    /**
     * 公司代码
     */
    @TableField("Office_Code")
    private String officeCode;

    /**
     * 访问并发控制
     */
    @TableField("Rec_Ver")
    private Long recVer;

    /**
     * 创建人
     */
    @TableField("Creator")
    private String Creator;

    /**
     * 创建日期
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
     * 单位代码
     */
    @TableField("Qty_Unit_Code")
    private String qtyUnitCode;

    /**
     * 单位名称
     */
    @TableField("Qty_Unit_Desc")
    private String qtyUnitDesc;


}
