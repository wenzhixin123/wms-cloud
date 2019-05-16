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
 * 客户表
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BasCustomer implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "BAS_CUSTOMER_UUID", type = IdType.UUID)
    private String basCustomerUuid;

    /**
     * 客户代码
     */
    @TableField("CUSTOMER_CODE")
    private String customerCode;

    /**
     * 中文名称
     */
    @TableField("CUSTOMER_NAME")
    private String customerName;

    /**
     * 客户名称
     */
    @TableField("CUSTOMER_NAME_EN")
    private String customerNameEn;

    /**
     * 地址1
     */
    @TableField("ADDRESS1")
    private String address1;

    /**
     * 地址1
     */
    @TableField("ADDRESS2")
    private String address2;

    /**
     * 地址3
     */
    @TableField("ADDRESS4")
    private String address4;

    /**
     * 地址2
     */
    @TableField("ADDRESS3")
    private String address3;

    /**
     * 邮政编码
     */
    @TableField("POSTAL_CODE")
    private Long postalCode;

    /**
     * 电话号码1
     */
    @TableField("TEL_NO_1")
    private String telNo1;

    /**
     * 电话号码2
     */
    @TableField("TEL_NO_2")
    private String telNo2;

    /**
     * 传真1
     */
    @TableField("FAX_NO_1")
    private String faxNo1;

    /**
     * 传真2
     */
    @TableField("FAX_NO_2")
    private String faxNo2;

    /**
     * 电子邮件
     */
    @TableField("EMAIL")
    private String email;

    /**
     * 国家代码
     */
    @TableField("COUNTRY_CODE")
    private String countryCode;

    /**
     * 省份代码
     */
    @TableField("PROVINCE_CODE")
    private String provinceCode;

    /**
     * 城市代码
     */
    @TableField("CITY_CODE")
    private String cityCode;

    /**
     * 地点代码
     */
    @TableField("SITE_CODE")
    private String siteCode;

    /**
     * 状态：Active - 有效； Cancel - 作废
     */
    @TableField("STATUS")
    private String status;

    /**
     * 中心代码
     */
    @TableField("CENTER_CODE")
    private String centerCode;

    /**
     * 控制字：默认0
     */
    @TableField("CONTROL_WORD")
    private String controlWord;

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

    @TableField("CUSTOMER_TYPE")
    private String customerType;

    @TableField("MNEMONIC_CODE")
    private String mnemonicCode;

    /**
     * 结算代码
     */
    @TableField("STATEMENT_ACCOUNT_CODE")
    private String statementAccountCode;


}
