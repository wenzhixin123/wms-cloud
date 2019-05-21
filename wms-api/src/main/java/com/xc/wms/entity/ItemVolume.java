package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
public class ItemVolume extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableField("ITEM_ID")
    private String itemId;

    @TableField("LENGTH")
    private BigDecimal length;

    @TableField("WIDTH")
    private BigDecimal width;

    @TableField("HEIGHT")
    private BigDecimal height;


}
