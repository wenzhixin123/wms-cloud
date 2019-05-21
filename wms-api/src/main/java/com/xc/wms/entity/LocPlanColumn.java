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
 * 字段名
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class LocPlanColumn extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 字段UUID
     */
    @TableId(value = "LOC_PLAN_COLUMN_UUID", type = IdType.UUID)
    private String locPlanColumnUuid;

    /**
     * 序号
     */
    @TableField("SEQ_NO")
    private BigDecimal seqNo;

    /**
     * 表名
     */
    @TableField("TABLE_NAME")
    private String tableName;

    /**
     * 指定字段
     */
    @TableField("COLUMN_CODE")
    private String columnCode;

    /**
     * 指定字段名称
     */
    @TableField("COLUMN_NAME")
    private String columnName;

    /**
     * 策略类型：上架、拣货
     */
    @TableField("CONFIG_TYPE")
    private String configType;

    /**
     * 状态：Active － 确认,Pending － 草稿,Cancel － 作废
     */
    @TableField("STATUS")
    private String status;

    /**
     * 控制字
     */
    @TableField("CONTROL_WORD")
    private String controlWord;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;


}
