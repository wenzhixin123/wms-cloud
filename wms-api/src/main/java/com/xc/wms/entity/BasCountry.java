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
 * 国家信息维护
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BasCountry implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 国家表UUID
     */
    @TableId(value = "BAS_COUNTRY_UUID", type = IdType.UUID)
    private String basCountryUuid;

    /**
     * 国家代码
     */
    @TableField("COUNTRY_CODE")
    private String countryCode;

    /**
     * 国家中文名称
     */
    @TableField("COUNTRY_NAME")
    private String countryName;

    /**
     * 国家英文名称
     */
    @TableField("COUNTRY_NAME_EN")
    private String countryNameEn;

    /**
     * 首都
     */
    @TableField("COUNTRY_CAPITAL")
    private String countryCapital;

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
     * 中心代码
     */
    @TableField("CENTER_CODE")
    private String centerCode;

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


}
