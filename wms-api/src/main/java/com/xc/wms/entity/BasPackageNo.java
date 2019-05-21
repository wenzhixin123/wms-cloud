package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 箱名信息表
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BasPackageNo extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 箱名号UUID
     */
    @TableId(value = "PACKAGE_UUID", type = IdType.UUID)
    private String packageUuid;

    /**
     * 箱名号
     */
    @TableField("PACKAGE_NO")
    private String packageNo;

    /**
     * 箱名描述
     */
    @TableField("PACKAGE_DESC")
    private String packageDesc;

    /**
     * 客户代码
     */
    @TableField("CUSTOMER_CODE")
    private String customerCode;

    @TableField("TRANSACTION_STATUS")
    private String transactionStatus;

    /**
     * 客户名称
     */
    @TableField("CUSTOMER_NAME")
    private String customerName;

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
