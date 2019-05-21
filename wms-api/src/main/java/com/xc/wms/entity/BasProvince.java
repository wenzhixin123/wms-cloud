package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 省份维护
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BasProvince extends BaseEntity {

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


}
