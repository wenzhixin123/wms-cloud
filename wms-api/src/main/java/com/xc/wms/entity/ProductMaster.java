package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
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
public class ProductMaster extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 产品表主键
     */
    @TableId(value = "Product_Master_UUID", type = IdType.UUID)
    private String productMasterUuid;

    /**
     * 包材表主键
     */
    @TableField("BAS_WRAPPER_UUID")
    private String basWrapperUuid;

    /**
     * 产品编码
     */
    @TableField("Product_Code")
    private String productCode;

    /**
     * 产品名称
     */
    @TableField("Product_Name")
    private String productName;

    /**
     * 产品英文名称
     */
    @TableField("Product_Name_En")
    private String productNameEn;

    /**
     * 产品助记码
     */
    @TableField("Product_ShortName")
    private String productShortname;

    /**
     * 产品类型
     */
    @TableField("Product_Type")
    private String productType;

    /**
     * 外部产品编码
     */
    @TableField("Ext_Product_Code")
    private String extProductCode;

    /**
     * 型号
     */
    @TableField("Model")
    private String Model;

    /**
     * 规格
     */
    @TableField("Spec")
    private String Spec;

    /**
     * 有效期开始日
     */
    @TableField("Valid_Date_From")
    private Date validDateFrom;

    /**
     * 有效期截止日
     */
    @TableField("Valid_Date_To")
    private Date validDateTo;

    /**
     * 货币
     */
    @TableField("Currency_Code")
    private String currencyCode;

    /**
     * 单价
     */
    @TableField("Unit_Price")
    private BigDecimal unitPrice;

    /**
     * 长度单位
     */
    @TableField("Length_Unit_Code")
    private String lengthUnitCode;

    /**
     * 长
     */
    @TableField("Length")
    private BigDecimal Length;

    /**
     * 宽
     */
    @TableField("Width")
    private BigDecimal Width;

    /**
     * 高
     */
    @TableField("Height")
    private BigDecimal Height;

    /**
     * 重量单位
     */
    @TableField("Weight_Unit_Code")
    private String weightUnitCode;

    /**
     * 净重
     */
    @TableField("Net_Weight")
    private BigDecimal netWeight;

    /**
     * 毛重
     */
    @TableField("Gross_Weight")
    private BigDecimal grossWeight;

    /**
     * 体积单位
     */
    @TableField("Volume_Unit_Code")
    private String volumeUnitCode;

    /**
     * 体积
     */
    @TableField("Volume")
    private BigDecimal Volume;

    /**
     * 备注
     */
    @TableField("Remark")
    private String Remark;

    /**
     * 控制字
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
     * 并发访问控制
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
     * 包材编码
     */
    @TableField("Wapper_Code")
    private String wapperCode;

    /**
     * 计量单位
     */
    @TableField("Unit_Code")
    private String unitCode;


}
