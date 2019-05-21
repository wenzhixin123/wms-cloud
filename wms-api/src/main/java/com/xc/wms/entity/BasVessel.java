package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

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
public class BasVessel extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableId(value = "VESSEL_ID", type = IdType.UUID)
    private String vesselId;

    @TableField("LINER_CODE")
    private String linerCode;

    @TableField("LINE_CODE")
    private String lineCode;

    @TableField("VESSEL_CODE")
    private String vesselCode;

    @TableField("VESSEL_NAME")
    private String vesselName;

    @TableField("VESSEL_NAME_EN")
    private String vesselNameEn;

    @TableField("VESSEL_TYPE")
    private String vesselType;

    @TableField("COUNTRY_ID")
    private String countryId;

    @TableField("VESSEL_NO")
    private String vesselNo;

    @TableField("REGISTER_PORT")
    private String registerPort;

    @TableField("NET_RT")
    private Integer netRt;

    @TableField("GRS_RT")
    private Integer grsRt;

    @TableField("LOAD_WT")
    private Integer loadWt;

    @TableField("TOTAL_LENGTH")
    private BigDecimal totalLength;

    @TableField("LOAD_TEU")
    private Integer loadTeu;

    @TableField("LOAD_TEU_E")
    private Integer loadTeuE;

    @TableField("CUSTOMS_LICENSE_NO")
    private String customsLicenseNo;

    @TableField("BOUNDARY_NO")
    private String boundaryNo;

    @TableField("VESSEL_LICENSE_ID")
    private String vesselLicenseId;

    @TableField("IMO_LICENSE_NO")
    private String imoLicenseNo;

    @TableField("VESSEL_PIC")
    private String vesselPic;

    @TableField("CONTACT_USER")
    private String contactUser;

    @TableField("CONTACT_MOBILE")
    private String contactMobile;

    @TableField("REMARKS")
    private String remarks;

    @TableField("VESSEL_CONTROL_WORD")
    private String vesselControlWord;

    @TableField("STATUS")
    private String status;

    @TableField("MNEMONIC_CODE")
    private String mnemonicCode;

    @TableField("IMO_MMSI_CODE")
    private String imoMmsiCode;


}
