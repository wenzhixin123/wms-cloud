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
 * 托盘信息
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BasPanel implements Serializable {

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


}
