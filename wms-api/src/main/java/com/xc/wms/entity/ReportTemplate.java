package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.sql.Blob;

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
public class ReportTemplate extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableId(value = "REPORT_TEMPLATE_UUID", type = IdType.UUID)
    private String reportTemplateUuid;

    @TableField("TEMPLATE_CODE")
    private String templateCode;

    @TableField("TEMPLATE_TYPE")
    private String templateType;

    @TableField("TEMPLATE_NAME")
    private String templateName;

    @TableField("TEMPLATE_NAME_EN")
    private String templateNameEn;

    @TableField("FILE_NAME")
    private String fileName;

    @TableField("FILE_VERSION")
    private String fileVersion;

    @TableField("TEMPLATE_CONTENT")
    private Blob templateContent;

    @TableField("REMARK")
    private String remark;

    @TableField("STATUS")
    private String status;

    @TableField("CONTROL_WORD")
    private String controlWord;

    @TableField("CUSTOMER_CODE")
    private String customerCode;

    @TableField("TEMPLATE_CATEGORY")
    private String templateCategory;

    @TableField("COMPILE_TEMPLATE")
    private Blob compileTemplate;

    @TableField("SUB_TYPE")
    private String subType;

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

    @TableField("PRINT_CONTROL")
    private String printControl;


}
