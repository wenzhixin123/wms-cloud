package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 物料种类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ItemKind extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 货物种类UUID
     */
    @TableId(value = "ITEM_KIND_UUID", type = IdType.UUID)
    private String itemKindUuid;

    /**
     * 货物种类代码
     */
    @TableField("ITEM_KIND_CODE")
    private String itemKindCode;

    /**
     * 货物种类描述
     */
    @TableField("ITEM_KIND_NAME")
    private String itemKindName;

    @TableField("ITEM_KIND_NAME_EN")
    private String itemKindNameEn;

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
