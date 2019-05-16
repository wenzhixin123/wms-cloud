package com.xc.wms.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 字段名
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LocPlanColumn implements Serializable {

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

    /**
     * 公司（仓库）代码
     */
    @TableField("OFFICE_CODE")
    private String officeCode;

    /**
     * 并发访问控制
     */
    @TableField("REC_VER")
    private BigDecimal recVer;

    /**
     * 创建人
     */
    @TableField("CREATOR")
    private String creator;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private Date createTime;

    /**
     * 修改人
     */
    @TableField("MODIFIER")
    private String modifier;

    /**
     * 修改时间
     */
    @TableField("MODIFY_TIME")
    private Date modifyTime;


}
