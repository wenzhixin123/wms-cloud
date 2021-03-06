package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

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
public class OptionControlProperties extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableId(value = "OC_PROPERTIES_UUID", type = IdType.UUID)
    private String ocPropertiesUuid;

    @TableField("OPTION_CONTROL_UUID")
    private String optionControlUuid;

    @TableField("SEQ_NO")
    private Double seqNo;

    @TableField("OC_PR_CODE")
    private String ocPrCode;

    @TableField("OC_PR_NAME")
    private String ocPrName;

    @TableField("OC_PR_VALUE")
    private String ocPrValue;

    @TableField("OC_PR_NUMBER")
    private Double ocPrNumber;

    @TableField("OC_PR_DATE")
    private Date ocPrDate;

    @TableField("IS_CONTROL")
    private String isControl;

    @TableField("IS_HELP")
    private String isHelp;

    @TableField("HELP_VALUE")
    private String helpValue;

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
