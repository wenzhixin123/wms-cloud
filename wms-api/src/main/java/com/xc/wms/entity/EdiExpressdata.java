package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.sql.Blob;
import java.util.Date;

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
public class EdiExpressdata extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableId(value = "EDI_EXPRESSDATA_UUID", type = IdType.UUID)
    private String ediExpressdataUuid;

    @TableField("WAREHOUSECODE")
    private String warehousecode;

    @TableField("LOGISTICPROVIDERCODE")
    private String logisticprovidercode;

    @TableField("ORDERDATE")
    private Date orderdate;

    @TableField("ORDERCONTENTXML")
    private Blob ordercontentxml;

    @TableField("TYPE")
    private String type;


}
