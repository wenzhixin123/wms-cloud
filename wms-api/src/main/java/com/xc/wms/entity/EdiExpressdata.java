package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.sql.Blob;
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
public class EdiExpressdata implements Serializable {

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
