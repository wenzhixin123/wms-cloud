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
 * 作业单（入库、移位、加工、出库等）
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LogisticsOrderP implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 包装号
     */
    @TableField("PACKAGE_NO")
    private String packageNo;

    /**
     * 作业单UUID
     */
    @TableId(value = "LOGISTICS_ORDER_UUID", type = IdType.UUID)
    private String logisticsOrderUuid;

    /**
     * 委托单UUID号
     */
    @TableField("SUBMIT_ORDER_UUID")
    private String submitOrderUuid;

    /**
     * 作业单号
     */
    @TableField("LOGISTICS_ORDER_NO")
    private String logisticsOrderNo;

    /**
     * 送货单号
     */
    @TableField("ORDER_NO")
    private String orderNo;

    /**
     * 项目编号
     */
    @TableField("PROJECT_CODE")
    private String projectCode;

    /**
     * 合同号
     */
    @TableField("CONTRACT_NO")
    private String contractNo;

    /**
     * 委托单位编码
     */
    @TableField("AGENT_CONSIGNEE_CODE")
    private String agentConsigneeCode;

    /**
     * 委托单位名称
     */
    @TableField("AGENT_CONSIGNEE_DESC")
    private String agentConsigneeDesc;

    /**
     * 货主或工厂编码
     */
    @TableField("CARGO_CONSIGNEE_CODE")
    private String cargoConsigneeCode;

    /**
     * 货主或工厂名称
     */
    @TableField("CARGO_CONSIGNEE_DESC")
    private String cargoConsigneeDesc;

    /**
     * 控货人描述
     */
    @TableField("CARGO_CONTROL_DESC")
    private String cargoControlDesc;

    /**
     * 控货人代码
     */
    @TableField("CARGO_CONTROL_CODE")
    private String cargoControlCode;

    /**
     * 结算单位名称
     */
    @TableField("PAYER_DESC")
    private String payerDesc;

    /**
     * 结算单位代码
     */
    @TableField("PAYER_CODE")
    private String payerCode;

    /**
     * 办单日期
     */
    @TableField("ORDER_DATE")
    private Date orderDate;

    /**
     * 出运时间
     */
    @TableField("DELIVERY_DATE")
    private Date deliveryDate;

    /**
     * 取消日期
     */
    @TableField("CANCEL_DATE")
    private Date cancelDate;

    /**
     * 结算日期
     */
    @TableField("CUT_OFF_DATE")
    private Date cutOffDate;

    /**
     * 经办人
     */
    @TableField("FUNCTIONARY")
    private String functionary;

    /**
     * 联系电话
     */
    @TableField("TEL_NO")
    private String telNo;

    /**
     * 作业要求
     */
    @TableField("WORK_DEMAND")
    private String workDemand;

    /**
     * 流向
     */
    @TableField("FLOW")
    private String flow;

    /**
     * 结算要求
     */
    @TableField("CHARGE_DESC")
    private String chargeDesc;

    @TableField("VESSEL_NAME")
    private String vesselName;

    @TableField("VOYAGE")
    private String voyage;

    /**
     * 装卸货港
     */
    @TableField("UNLOAD_PORT")
    private String unloadPort;

    /**
     * 运输公司
     */
    @TableField("TRAILING_TEAM")
    private String trailingTeam;

    /**
     * 车牌号码
     */
    @TableField("TRACTOR_NO")
    private String tractorNo;

    /**
     * 运输方式
     */
    @TableField("DELIVERY_TYPE")
    private String deliveryType;

    /**
     * 上架和拣货策略号
     */
    @TableField("CONFIG_CODE")
    private String configCode;

    /**
     * 控制字
     */
    @TableField("CONTROL_WORD")
    private String controlWord;

    /**
     * 状态：Active - 有效； Cancel - 作废
     */
    @TableField("TRANSACTION_STATUS")
    private String transactionStatus;

    /**
     * 操作类型：SIN - 进库委托单；SOT - 出库委托单；SSP-销售委托单
     */
    @TableField("TRANSACTION_TYPE")
    private String transactionType;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 自定义字段1
     */
    @TableField("AUX1")
    private String aux1;

    /**
     * 自定义字段2
     */
    @TableField("AUX2")
    private String aux2;

    /**
     * 自定义字段3
     */
    @TableField("AUX3")
    private String aux3;

    /**
     * 自定义字段4
     */
    @TableField("AUX4")
    private String aux4;

    /**
     * 自定义字段5
     */
    @TableField("AUX5")
    private String aux5;

    /**
     * 公司（仓库）代码
     */
    @TableField("OFFICE_CODE")
    private String officeCode;

    /**
     * 并发访问控制
     */
    @TableField("REC_VER")
    private Long recVer;

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

    /**
     * 应急收、发货单号
     */
    @TableField("URGENT_ORDER_NO")
    private String urgentOrderNo;

    /**
     * 国家编码
     */
    @TableField("COUNTRY_CODE")
    private String countryCode;

    /**
     * 目标客户代码
     */
    @TableField("TARGET_CUSTOMER_CODE")
    private String targetCustomerCode;

    /**
     * 车型
     */
    @TableField("TRACTOR_TYPE")
    private String tractorType;

    /**
     * 去向
     */
    @TableField("DIRECTION")
    private String direction;

    @TableField("TRACTOR_UUID")
    private String tractorUuid;


}
