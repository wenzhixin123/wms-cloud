package com.xc.wms.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
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
public class AddressChange implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "ADDRESS_UUID", type = IdType.UUID)
    private String addressUuid;

    @TableField("ORDER_NAME")
    private String orderName;

    @TableField("PRIVINCE")
    private BigDecimal privince;

    @TableField("CITY")
    private String city;

    @TableField("COUNTY")
    private String county;

    @TableField("ADDRESS")
    private String address;


}
