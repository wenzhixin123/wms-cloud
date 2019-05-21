package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

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
public class ExpressAccountRuleDetail extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 快递计费规则明细表主键
     */
    @TableId(value = "EXPRESS_ACCOUNT_RULE_DETAIL_UUID", type = IdType.UUID)
    private String expressAccountRuleDetailUuid;

    /**
     * 快递计费规则表主键
     */
    @TableField("EXPRESS_ACCOUNT_RULE_UUID")
    private String expressAccountRuleUuid;

    /**
     * 快递规则顺序
     */
    @TableField("RULE_SEQ_NO")
    private Integer ruleSeqNo;

    /**
     * 起始地
     */
    @TableField("ORIGIN_ADDRESS")
    private String originAddress;

    /**
     * 目的地
     */
    @TableField("FINAL_ADDRESS")
    private String finalAddress;

    @TableField("UNIT_CODE")
    private String unitCode;

    /**
     * 首重
     */
    @TableField("FIRST_SET")
    private BigDecimal firstSet;

    /**
     * 首重1
     */
    @TableField("FIRST_SET1")
    private BigDecimal firstSet1;

    /**
     * 续重
     */
    @TableField("ADDITIONAL_SET")
    private BigDecimal additionalSet;

    /**
     * 首重资费
     */
    @TableField("FIRST_SET_PRICE")
    private BigDecimal firstSetPrice;

    /**
     * 首重资费1
     */
    @TableField("FIRST_SET_PRICE1")
    private BigDecimal firstSetPrice1;

    /**
     * 续重资费
     */
    @TableField("ADDITIONAL_SET_PRICE")
    private BigDecimal additionalSetPrice;

    /**
     * 次晨首重计费
     */
    @TableField("NEXT_MORNING_FIRST_PRICE")
    private BigDecimal nextMorningFirstPrice;

    /**
     * 次晨续重计费
     */
    @TableField("NEXT_MORNING_ADDITIONAL_PRICE")
    private BigDecimal nextMorningAdditionalPrice;

    /**
     * 次日首重资费
     */
    @TableField("NEXT_DAY_FIRST_PRICE")
    private BigDecimal nextDayFirstPrice;

    /**
     * 次日续重资费
     */
    @TableField("NEXT_DAY_ADDITIONAL_PRICE")
    private BigDecimal nextDayAdditionalPrice;

    /**
     * 隔日首重资费
     */
    @TableField("OVERNIGHT_FIRST_PRICE")
    private BigDecimal overnightFirstPrice;

    /**
     * 限重
     */
    @TableField("OVERNIGHT_LIMIT_SET")
    private BigDecimal overnightLimitSet;

    /**
     * 隔日(限重之内)首重
     */
    @TableField("OVERNIGHT_ADDITIONAL_IN_PRICE")
    private BigDecimal overnightAdditionalInPrice;

    /**
     * 隔日(限重之外)续重
     */
    @TableField("OVERNIGHT_ADDITIONAL_OUT_PRICE")
    private BigDecimal overnightAdditionalOutPrice;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 状态
     */
    @TableField("STATUS")
    private String status;

    /**
     * 控制关键字
     */
    @TableField("CONTROL_WORD")
    private String controlWord;

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


}
