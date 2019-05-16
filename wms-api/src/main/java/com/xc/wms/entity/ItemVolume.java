package com.xc.wms.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ItemVolume implements Serializable {

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
