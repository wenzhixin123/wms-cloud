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
 * 包材信息
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BasWrapper implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 包材UUID
     */
    @TableId(value = "BAS_WRAPPER_UUID", type = IdType.UUID)
    private String basWrapperUuid;

    /**
     * 物料主表UUID
     */
    @TableField("ITEM_MASTER_UUID")
    private String itemMasterUuid;

    /**
     * 货物编码
     */
    @TableField("ITEM_CODE")
    private String itemCode;

    /**
     * 包材编码
     */
    @TableField("WRAPPER_CODE")
    private String wrapperCode;

    /**
     * 包材名称
     */
    @TableField("WRAPPER_NAME")
    private String wrapperName;

    /**
     * 英文名
     */
    @TableField("WRAPPER_NAME_CN")
    private String wrapperNameCn;

    /**
     * 长度单位
     */
    @TableField("LENGTH_UNIT_CODE")
    private String lengthUnitCode;

    /**
     * 长度单位
     */
    @TableField("LENGTH_UNIT_DESC")
    private String lengthUnitDesc;

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
     * 体积单位
     */
    @TableField("VOLUME_UNIT_CODE")
    private String volumeUnitCode;

    /**
     * 体积单位描述
     */
    @TableField("VOLUME_UNIT_DESC")
    private String volumeUnitDesc;

    /**
     * VOLUME 体积(立方米)
     */
    @TableField("VOLUME")
    private BigDecimal volume;

    /**
     * 重量单位
     */
    @TableField("WEIGHT_UNIT_CODE")
    private String weightUnitCode;

    /**
     * 重量单位描述
     */
    @TableField("WEIGHT_UNIT_DESC")
    private String weightUnitDesc;

    /**
     * 净重
     */
    @TableField("NET_WEIGHT")
    private BigDecimal netWeight;

    /**
     * 毛重
     */
    @TableField("GROSS_WEIGHT")
    private BigDecimal grossWeight;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 状态：Active - 有效； Cancel - 作废
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

    /**
     * 打印内部SPU标签个数
     */
    @TableField("PRINT_SPU_NUM")
    private Integer printSpuNum;

    /**
     * 打印华为标签个数
     */
    @TableField("PRINT_HW_NUM")
    private Integer printHwNum;

    /**
     * 包材服务类代码：折盒子（FOLD_BOX）
     */
    @TableField("SERVICE_CODE")
    private String serviceCode;

    /**
     * 中心代码
     */
    @TableField("CENTER_CODE")
    private String centerCode;

    /**
     * 主作业项目
     */
    @TableField("MAIN_ITEM")
    private String mainItem;

    /**
     * 单位
     */
    @TableField("UNIT")
    private String unit;

    /**
     * 是 :Y
     */
    @TableField("IS_INT")
    private String isInt;

    /**
     * 包材类型
     */
    @TableField("WRAPPER_TYPE")
    private String wrapperType;

    /**
     * 包材库存
     */
    @TableField("WRAPPER_STOCK")
    private BigDecimal wrapperStock;


}
