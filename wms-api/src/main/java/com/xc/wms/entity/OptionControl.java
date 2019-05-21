package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class OptionControl extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableId(value = "OPTION_CONTROL_UUID", type = IdType.UUID)
    private String optionControlUuid;

    @TableField("OC_TYPE_UUID")
    private String ocTypeUuid;

    @TableField("SEQ_NO")
    private Double seqNo;

    @TableField("OC_CODE")
    private String ocCode;

    @TableField("OC_NAME")
    private String ocName;

    @TableField("OC_NAME_EN")
    private String ocNameEn;

    @TableField("PRE_OPTION_CONTROL_UUID")
    private String preOptionControlUuid;

    @TableField("CUSTOMER_CODE")
    private String customerCode;

    @TableField("CUSTOMER_NAME")
    private String customerName;

    @TableField("IS_CONTROL")
    private String isControl;

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


}
