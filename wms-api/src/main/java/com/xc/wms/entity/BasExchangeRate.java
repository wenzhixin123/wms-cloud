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
 * 汇率信息
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BasExchangeRate implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * Phisical Primary Key
     */
    @TableId(value = "BAS_EXCHANGE_RATE_UUID", type = IdType.UUID)
    private String basExchangeRateUuid;

    /**
     * 原币别
     */
    @TableField("CURRENCY_CODE")
    private String currencyCode;

    /**
     * 币别名称
     */
    @TableField("EXCHANGE_CURRENCY_CODE")
    private String exchangeCurrencyCode;

    /**
     * 汇率
     */
    @TableField("EXCHANGE_RATE")
    private BigDecimal exchangeRate;

    /**
     * 兑换起始时间
     */
    @TableField("ACTIVE_STA_DATE")
    private Date activeStaDate;

    /**
     * 兑换结束时间
     */
    @TableField("ACTIVE_END_DATE")
    private Date activeEndDate;

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


}
