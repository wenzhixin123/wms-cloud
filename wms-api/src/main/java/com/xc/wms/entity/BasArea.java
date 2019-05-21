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
public class BasArea extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableId(value = "BAS_AREA_UUID", type = IdType.UUID)
    private String basAreaUuid;

    @TableField("AREA_CODE")
    private String areaCode;

    @TableField("AREA_NAME")
    private String areaName;

    @TableField("AREA_NAME_EN")
    private String areaNameEn;

    @TableField("CITY_CODE")
    private String cityCode;

    @TableField("CITY_NAME")
    private String cityName;

    @TableField("CITY_NAME_EN")
    private String cityNameEn;

    @TableField("PROVINCE_CODE")
    private String provinceCode;

    @TableField("PROVINCE_NAME")
    private String provinceName;

    @TableField("COUNTRY_CODE")
    private String countryCode;

    @TableField("COUNTRY_NAME")
    private String countryName;

    @TableField("ZIPCODE")
    private String zipcode;

    @TableField("DISTRICT_NUM")
    private String districtNum;

    @TableField("LONGITUDE")
    private String longitude;

    @TableField("LATITUDE")
    private String latitude;

    @TableField("REMARK")
    private String remark;

    @TableField("STATUS")
    private String status;

    @TableField("CENTER_CODE")
    private String centerCode;

    @TableField("CONTROL_WORD")
    private String controlWord;


}
