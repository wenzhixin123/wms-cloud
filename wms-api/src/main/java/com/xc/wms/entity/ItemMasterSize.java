package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 物料尺寸表
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ItemMasterSize extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 物料尺寸表UUID
     */
    @TableId(value = "ITEM_MASTER_SIZE_UUID", type = IdType.UUID)
    private String itemMasterSizeUuid;

    /**
     * 物料主表UUID
     */
    @TableField("ITEM_MASTER_UUID")
    private String itemMasterUuid;

    /**
     * 尺寸编码
     */
    @TableField("SIZE_CODE")
    private String sizeCode;

    /**
     * 尺寸名称
     */
    @TableField("SIZE_NAME")
    private String sizeName;

    @TableField("SIZE_NAME_EN")
    private String sizeNameEn;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

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
