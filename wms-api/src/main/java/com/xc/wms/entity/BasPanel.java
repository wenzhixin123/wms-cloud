package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 托盘信息
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BasPanel extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 托盘UUID
     */
    @TableId(value = "BAS_PANEL_UUID", type = IdType.UUID)
    private String basPanelUuid;

    /**
     * 托盘类型CODE
     */
    @TableField("BAS_PANEL_TYPE_CODE")
    private String basPanelTypeCode;

    /**
     * 托盘号
     */
    @TableField("PANEL_PACKAGE_NO")
    private String panelPackageNo;

    /**
     * 货盘描述
     */
    @TableField("PANEL_PACKAGE_DESC")
    private String panelPackageDesc;

    /**
     * 客户代码
     */
    @TableField("CUSTOMER_CODE")
    private String customerCode;

    /**
     * 客户名称
     */
    @TableField("CUSTOMER_NAME")
    private String customerName;

    /**
     * 作业状态
     */
    @TableField("TRANSACTION_STATUS")
    private String transactionStatus;

    /**
     * 控制字
     */
    @TableField("CONTROL_WORD")
    private String controlWord;

    /**
     * 操作状态
     */
    @TableField("STATUS")
    private String status;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;


}
