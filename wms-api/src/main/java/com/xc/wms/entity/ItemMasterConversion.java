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
 * 物料单位转换表
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ItemMasterConversion implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 物料单位转换表UUID
     */
    @TableId(value = "ITEM_MASTER_CONVERSION_UUID", type = IdType.UUID)
    private String itemMasterConversionUuid;

    /**
     * 物料主表UUID
     */
    @TableField("ITEM_MASTER_UUID")
    private String itemMasterUuid;

    /**
     * 转换单位代号
     */
    @TableField("CONV_UNIT_CODE")
    private String convUnitCode;

    /**
     * 转换单位描述
     */
    @TableField("CONV_UNIT_DESC")
    private String convUnitDesc;

    /**
     * 包装单位代号
     */
    @TableField("UNIT_CODE")
    private String unitCode;

    /**
     * 包装单位描述
     */
    @TableField("UNIT_DESC")
    private String unitDesc;

    /**
     * 数量
     */
    @TableField("UNIT_QTY")
    private BigDecimal unitQty;

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
