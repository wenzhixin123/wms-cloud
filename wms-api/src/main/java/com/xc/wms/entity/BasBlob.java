package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.sql.Blob;

/**
 * <p>
 * 大字段文件表
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BasBlob extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "BAS_BLOB_UUID", type = IdType.UUID)
    private String basBlobUuid;

    /**
     * 调用主键
     */
    @TableField("PRE_DATA_UUID")
    private String preDataUuid;

    /**
     * 类型代码
     */
    @TableField("TYPE_CODE")
    private String typeCode;

    /**
     * 类型名称
     */
    @TableField("TYPE_DESC")
    private String typeDesc;

    @TableField("DATA")
    private Blob data;

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
