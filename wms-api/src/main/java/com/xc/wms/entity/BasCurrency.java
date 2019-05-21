package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 币别信息
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BasCurrency extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 币种UUID
     */
    @TableId(value = "BAS_CURRENCY_UUID", type = IdType.UUID)
    private String basCurrencyUuid;

    /**
     * 币别编码
     */
    @TableField("CURRENCY_CODE")
    private String currencyCode;

    /**
     * 币别名称
     */
    @TableField("CURRENCY_NAME")
    private String currencyName;

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
