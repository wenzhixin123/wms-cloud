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
 * 用户信息表
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUser implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * UUID
     */
    @TableId(value = "USER_UUID", type = IdType.UUID)
    private String userUuid;

    /**
     * 上级用户UUID
     */
    @TableField("PRE_USER_UUID")
    private String preUserUuid;

    /**
     * 用户编码
     */
    @TableField("USER_CODE")
    private String userCode;

    /**
     * 用户名称
     */
    @TableField("USER_NAME")
    private String userName;

    /**
     * 用户英文名称
     */
    @TableField("USER_NAME_EN")
    private String userNameEn;

    /**
     * 职位描述
     */
    @TableField("POSITION")
    private String position;

    /**
     * 名字
     */
    @TableField("FIRST_NAME")
    private String firstName;

    /**
     * 中间名字
     */
    @TableField("MIDDLE_NAME")
    private String middleName;

    /**
     * 姓
     */
    @TableField("LAST_NAME")
    private String lastName;

    /**
     * 用户类型
     */
    @TableField("USER_TYPE")
    private String userType;

    /**
     * 所属部门
     */
    @TableField("DEPARTMENT_CODE")
    private String departmentCode;

    /**
     * 性别
     */
    @TableField("SEX")
    private String sex;

    /**
     * 个人签名
     */
    @TableField("PERSONAL_INFO")
    private String personalInfo;

    /**
     * 个人头像
     */
    @TableField("PERSONAL_PIC")
    private String personalPic;

    /**
     * 身份证号
     */
    @TableField("ID_CARD")
    private String idCard;

    /**
     * 婚姻状况
     */
    @TableField("MARITAL")
    private String marital;

    /**
     * 联系地址
     */
    @TableField("CONTACT_ADDRESS")
    private String contactAddress;

    /**
     * 本地名字
     */
    @TableField("NATIVE_ADDRESS")
    private String nativeAddress;

    /**
     * 联系地址
     */
    @TableField("HOME_ADDRESS")
    private String homeAddress;

    /**
     * 教育程度
     */
    @TableField("EDUCATION")
    private String education;

    /**
     * 联系电话
     */
    @TableField("TELEPHONE1")
    private String telephone1;

    /**
     * 联系电话2
     */
    @TableField("TELEPHONE2")
    private String telephone2;

    /**
     * 传真
     */
    @TableField("FAX")
    private String fax;

    /**
     * 传呼
     */
    @TableField("BPCALL")
    private String bpcall;

    /**
     * 移动电话
     */
    @TableField("MOBILE")
    private String mobile;

    /**
     * 邮编
     */
    @TableField("ZIP_CODE")
    private String zipCode;

    /**
     * 雇佣日期
     */
    @TableField("HIRE_DATE")
    private Date hireDate;

    /**
     * 离职日期
     */
    @TableField("FIRE_DATE")
    private Date fireDate;

    /**
     * 家庭电话
     */
    @TableField("HOME_TELPHONE")
    private String homeTelphone;

    /**
     * 生日
     */
    @TableField("BIRTH_DAY")
    private Date birthDay;

    /**
     * 电子邮件
     */
    @TableField("EMAIL")
    private String email;

    /**
     * 密码
     */
    @TableField("PASSWORD")
    private String password;

    /**
     * 所属公司代码
     */
    @TableField("CUSTOMER_CODE")
    private String customerCode;

    /**
     * 缺省语言
     */
    @TableField("DEFAULT_LANG")
    private String defaultLang;

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
     * 控制字：默认0
     */
    @TableField("CONTROL_WORD")
    private String controlWord;

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
     * 打包台编号
     */
    @TableField("STATION_NUMBER")
    private String stationNumber;


}
