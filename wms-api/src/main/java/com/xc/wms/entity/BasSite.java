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
 * 
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BasSite implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "BAS_SITE_UUID", type = IdType.UUID)
    private String basSiteUuid;

    @TableField("PRE_BAS_SITE_UUID")
    private String preBasSiteUuid;

    @TableField("SITE_CODE")
    private String siteCode;

    @TableField("SITE_SEARCH_CODE")
    private String siteSearchCode;

    @TableField("SITE_NAME")
    private String siteName;

    @TableField("SITE_SHORT_NAME")
    private String siteShortName;

    @TableField("SITE_NAME_EN")
    private String siteNameEn;

    @TableField("SITE_TYPE")
    private String siteType;

    @TableField("OTHER_UUID")
    private String otherUuid;

    @TableField("ZIPCODE")
    private String zipcode;

    @TableField("DISTRICT_NUM")
    private String districtNum;

    @TableField("ADDRESS")
    private String address;

    @TableField("LONGITUDE")
    private String longitude;

    @TableField("LATITUDE")
    private String latitude;

    @TableField("SEQ_NO")
    private Long seqNo;

    @TableField("IS_AUTO")
    private String isAuto;

    @TableField("REMARK")
    private String remark;

    @TableField("STATUS")
    private String status;

    @TableField("CENTER_CODE")
    private String centerCode;

    @TableField("CONTROL_WORD")
    private String controlWord;

    @TableField("OFFICE_CODE")
    private String officeCode;

    @TableField("REC_VER")
    private Long recVer;

    @TableField("CREATOR")
    private String creator;

    @TableField("CREATE_TIME")
    private Date createTime;

    @TableField("MODIFIER")
    private String modifier;

    @TableField("MODIFY_TIME")
    private Date modifyTime;


}
