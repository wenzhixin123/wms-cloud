package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 城市维护
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BasCity extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * Phisical Primary Key
     */
    @TableId(value = "BAS_CITY_UUID", type = IdType.UUID)
    private String basCityUuid;

    /**
     * 城市代码
     */
    @TableField("CITY_CODE")
    private String cityCode;

    /**
     * 城市中文名称
     */
    @TableField("CITY_NAME")
    private String cityName;

    /**
     * 城市英文名称
     */
    @TableField("CITY_NAME_EN")
    private String cityNameEn;

    /**
     * 所属省份：省份编码
     */
    @TableField("PROVINCE_CODE")
    private String provinceCode;

    /**
     * 所属省份：省份名称
     */
    @TableField("PROVINCE_NAME")
    private String provinceName;

    /**
     * 所属国家：国家编码
     */
    @TableField("COUNTRY_CODE")
    private String countryCode;

    /**
     * 所属国家：国家名称
     */
    @TableField("COUNTRY_NAME")
    private String countryName;

    /**
     * 邮政编码
     */
    @TableField("ZIPCODE")
    private String zipcode;

    /**
     * 电话区号
     */
    @TableField("DISTRICT_NUM")
    private String districtNum;

    /**
     * 经度
     */
    @TableField("LONGITUDE")
    private String longitude;

    /**
     * 纬度
     */
    @TableField("LATITUDE")
    private String latitude;

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
