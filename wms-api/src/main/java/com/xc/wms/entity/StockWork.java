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
 * 库内操作记录表
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class StockWork implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * UUID
     */
    @TableId(value = "STOCK_WORK_UUID", type = IdType.UUID)
    private String stockWorkUuid;

    /**
     * 作业任务表UUID
     */
    @TableField("LOCATION_TASK_UUID")
    private String locationTaskUuid;

    /**
     * 库存操作STOCK_WORK的UUID
     */
    @TableField("IN_STOCK_WORK_UUID")
    private String inStockWorkUuid;

    /**
     * 操作时间
     */
    @TableField("STOCK_DATE")
    private Date stockDate;

    /**
     * 操作类型
     */
    @TableField("STOCK_TYPE")
    private String stockType;

    /**
     * 操作描述
     */
    @TableField("STOCK_DESC")
    private String stockDesc;

    /**
     * 数量
     */
    @TableField("QTY")
    private BigDecimal qty;

    /**
     * 第二包装数量
     */
    @TableField("SECOND_QTY")
    private BigDecimal secondQty;

    /**
     * 第三包装数量
     */
    @TableField("THIRD_QTY")
    private BigDecimal thirdQty;

    /**
     * 净重
     */
    @TableField("NET_WEIGHT")
    private BigDecimal netWeight;

    /**
     * 重量
     */
    @TableField("GROSS_WEIGHT")
    private BigDecimal grossWeight;

    /**
     * 体积
     */
    @TableField("VOLUME")
    private BigDecimal volume;

    /**
     * 上条次操记录UUID
     */
    @TableField("LAST_STOCK_WORK_UUID")
    private String lastStockWorkUuid;

    /**
     * 货位
     */
    @TableField("LOT_CODE")
    private String lotCode;

    /**
     * 控制字
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
