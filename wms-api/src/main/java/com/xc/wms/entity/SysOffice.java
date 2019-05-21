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
 * 组织、公司或办事处
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SysOffice extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * UUID
     */
    @TableId(value = "OFFICE_UUID", type = IdType.UUID)
    private String officeUuid;

    /**
     * 组织类型
     */
    @TableField("OFFICE_TYPE")
    private String officeType;

    /**
     * 组织全称
     */
    @TableField("OFFICE_NAME")
    private String officeName;

    /**
     * 组织英文名
     */
    @TableField("OFFICE_NAME_EN")
    private String officeNameEn;

    /**
     * 上一级组织UUID
     */
    @TableField("PRE_OFFICE_UUID")
    private String preOfficeUuid;

    /**
     * 组织简称
     */
    @TableField("ABBREV")
    private String abbrev;

    /**
     * 工商登记号
     */
    @TableField("BUSINESS_REGISTER_NO")
    private String businessRegisterNo;

    /**
     * 税务登记号
     */
    @TableField("TAX_REGISTER_NO")
    private String taxRegisterNo;

    /**
     * 联系人
     */
    @TableField("CONTACT")
    private String contact;

    /**
     * 邮件地址
     */
    @TableField("EMAIL")
    private String email;

    /**
     * 电话
     */
    @TableField("TEL")
    private String tel;

    /**
     * 传真
     */
    @TableField("FAX")
    private String fax;

    /**
     * 地址
     */
    @TableField("ADDRESS")
    private String address;

    /**
     * 为内部办事处
     */
    @TableField("IS_INTERNAL")
    private Integer isInternal;

    /**
     * 作为客户
     */
    @TableField("IS_CUSTOMER")
    private Integer isCustomer;

    /**
     * 作为结算公司
     */
    @TableField("IS_DEPT")
    private Integer isDept;

    /**
     * 汇率体系
     */
    @TableField("XCHGR_NAME")
    private String xchgrName;

    /**
     * 所属公司代码
     */
    @TableField("CUSTOMER_CODE")
    private String customerCode;

    /**
     * 语言
     */
    @TableField("LANGUAGE")
    private String language;

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
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 状态：Active - 有效； Cancel - 作废
     */
    @TableField("STATUS")
    private String status;

    /**
     * 作废日期
     */
    @TableField("CANCEL_DATE")
    private Date cancelDate;

    /**
     * 控制字：默认0
     */
    @TableField("CONTROL_WORD")
    private String controlWord;


}
