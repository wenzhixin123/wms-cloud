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
 * 省份维护
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BasProvince implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 省份表UUID
     */
    @TableId(value = "BAS_PROVINCE_UUID", type = IdType.UUID)
    private String basProvinceUuid;

    /**
     * 省份代码
     */
    @TableField("PROVINCE_CODE")
    private String provinceCode;

    /**
     * 省份中文名称
     */
    @TableField("PROVINCE_NAME")
    private String provinceName;

    /**
     * 省份英文名称
     */
    @TableField("PROVINCE_NAME_EN")
    private String provinceNameEn;

    /**
     * 省会：存名称
     */
    @TableField("PROVINCE_CAPITAL")
    private String provinceCapital;

    /**
     * 国家编码
     */
    @TableField("COUNTRY_CODE")
    private String countryCode;

    /**
     * 国家名称
     */
    @TableField("COUNTRY_CODE_NAME")
    private String countryCodeName;

    /**
     * 经度1
     */
    @TableField("LONGITUDE1")
    private String longitude1;

    /**
     * 纬度1
     */
    @TableField("LATITUDE1")
    private String latitude1;

    /**
     * 经度2
     */
    @TableField("LONGITUDE2")
    private String longitude2;

    /**
     * 纬度2
     */
    @TableField("LATITUDE2")
    private String latitude2;

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
     * 中心代码
     */
    @TableField("CENTER_CODE")
    private String centerCode;

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


}
