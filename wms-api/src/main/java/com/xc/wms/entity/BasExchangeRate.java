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
 * 汇率信息
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BasExchangeRate extends BaseEntity {

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


}
