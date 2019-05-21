package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 物料属性
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ItemNature extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 货物属性UUID
     */
    @TableId(value = "ITEM_NATURE_UUID", type = IdType.UUID)
    private String itemNatureUuid;

    /**
     * 货物属性代码
     */
    @TableField("ITEM_NATURE_CODE")
    private String itemNatureCode;

    /**
     * 货物属性描述
     */
    @TableField("ITEM_NATURE_NAME")
    private String itemNatureName;

    @TableField("ITEM_NATURE_NAME_EN")
    private String itemNatureNameEn;

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


}
