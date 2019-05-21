package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 委托订单
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SubmitOrder extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 委托单UUID号
     */
    @TableId(value = "SUBMIT_ORDER_UUID", type = IdType.UUID)
    private String submitOrderUuid;

    /**
     * 委托单号
     */
    @TableField("SUBMIT_ORDER_NO")
    private String submitOrderNo;

    /**
     * 客户委托单号
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
     * 结算单位代码
     */
    @TableField("PAYER_CODE")
    private String payerCode;

    /**
     * 结算单位名称
     */
    @TableField("PAYER_DESC")
    private String payerDesc;

    /**
     * 下委托日期
     */
    @TableField("SUBMIT_DATE")
    private Date submitDate;

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

    /**
     * 船只名称
     */
    @TableField("VESSEL_NAME")
    private String vesselName;

    /**
     * 航线
     */
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
     * UUID
     */
    @TableField("CFR_UUID")
    private String cfrUuid;

    /**
     * 状态：Active - 有效； Cancel - 作废；Pending － 草稿
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
     * 审核人
     */
    @TableField("CUT_OFF_NAME")
    private String cutOffName;

    /**
     * 作废人
     */
    @TableField("CANCEL_NAME")
    private String cancelName;

    /**
     * 包装方案
     */
    @TableField("PACKAGE_PLAN")
    private String packagePlan;

    /**
     * 订单单次下发ITEM数量 本消息的order_item数量
当distribute_type为1时为必选
WLB
     */
    @TableField("ORDER_ITEM_COUNT")
    private Long orderItemCount;

    /**
     * 订单总共ITEM数量 总共ITEM数量
当distribute_type为1时为必选
WLB
     */
    @TableField("TOTAL_ORDER_ITEM_COUNT")
    private Long totalOrderItemCount;

    /**
     * 包裹数量 WLB
     */
    @TableField("PACKAGE_COUNT")
    private Long packageCount;

    /**
     * 预期送达开始时间  入库单常用
YYYY-MM-DD hh:mm:ss
WLB
     */
    @TableField("EXPECT_START_TIME")
    private Date expectStartTime;

    /**
     * 预期送达结束时间  入库单常用
YYYY-MM-DD hh:mm:ss
WLB
     */
    @TableField("EXPECT_END_TIME")
    private Date expectEndTime;

    /**
     * 预计开始入库时间 WLB
     */
    @TableField("EXPECT_TIME")
    private Date expectTime;

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
     * 国家
     */
    @TableField("COUNTRY_CODE")
    private String countryCode;

    /**
     * 截重时间
     */
    @TableField("CUT_DATE")
    private Date cutDate;

    /**
     * 车型
     */
    @TableField("TRACTOR_TYPE")
    private String tractorType;

    /**
     * 合计重量
     */
    @TableField("TOTAL_WEIGHT")
    private BigDecimal totalWeight;

    /**
     * 去向
     */
    @TableField("DIRECTION")
    private String direction;

    /**
     * 验证码
     */
    @TableField("VERIFY_CODE")
    private String verifyCode;

    /**
     * 关务类型
     */
    @TableField("CUSTOMS_TYPE")
    private String customsType;

    /**
     * 业务类型
     */
    @TableField("BUSINESS_TYPE")
    private String businessType;

    @TableField("DRIVER")
    private String driver;


}
