package com.xc.wms.entity;

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
 * 
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LocPlan implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 上架和拣货计划单UUID
     */
    @TableId(value = "LOC_PLAN_UUID", type = IdType.UUID)
    private String locPlanUuid;

    /**
     * 上架和拣货策略UUID
     */
    @TableField("LOC_PLAN_CONFIG_UUID")
    private String locPlanConfigUuid;

    /**
     * 作业单主键
     */
    @TableField("LOGISTICS_ORDER_UUID")
    private String logisticsOrderUuid;

    /**
     * 上架和拣货单号
     */
    @TableField("LOC_PLAN_NO")
    private String locPlanNo;

    @TableField("LOC_PLAN_TYPE")
    private String locPlanType;

    /**
     * 计划时间
     */
    @TableField("TASK_DATE")
    private Date taskDate;

    /**
     * 要求完成时间
     */
    @TableField("FINISH_DATE")
    private Date finishDate;

    /**
     * 作废时间
     */
    @TableField("CANCEL_DATE")
    private Date cancelDate;

    /**
     * 仓管员
     */
    @TableField("WRH_WORKER")
    private String wrhWorker;

    /**
     * 货物监管员（理货员）
     */
    @TableField("WRH_CUST")
    private String wrhCust;

    /**
     * 企业订单号
     */
    @TableField("ORDER_NO")
    private String orderNo;

    /**
     * 状态：ACTIVE - 有效； Cancel - 作废
     */
    @TableField("STATUS")
    private String status;

    @TableField("CONTROL_WORD")
    private String controlWord;

    @TableField("REMARK")
    private String remark;

    @TableField("AUX1")
    private String aux1;

    @TableField("AUX2")
    private String aux2;

    @TableField("AUX3")
    private String aux3;

    @TableField("AUX4")
    private String aux4;

    @TableField("AUX5")
    private String aux5;

    @TableField("OFFICE_CODE")
    private String officeCode;

    @TableField("REC_VER")
    private Long recVer;

    @TableField("CREATOR")
    private String creator;

    @TableField("CREATE_TIME")
    private Date createTime;

    @TableField("MODIFIER")
    private String modifier;

    @TableField("MODIFY_TIME")
    private Date modifyTime;

    @TableField("PACKAGE_NO")
    private String packageNo;

    /**
     * 推荐包材编码
     */
    @TableField("WRAPPER_CODE")
    private String wrapperCode;

    /**
     * 推荐包材名称
     */
    @TableField("WRAPPER_NAME")
    private String wrapperName;

    /**
     * 关联次数
     */
    @TableField("RELATION_NUM")
    private Integer relationNum;


}
