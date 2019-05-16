package com.xc.wms.entity;

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
public class Domefunction implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.UUID)
    private Long id;

    @TableField("CHANNELID")
    private Long channelid;

    @TableField("TYPE")
    private Long type;

    @TableField("NAME")
    private String name;

    @TableField("BSAVED")
    private String bsaved;

    @TableField("GROUPIDX")
    private Long groupidx;

    @TableField("ITEMIDX")
    private Long itemidx;

    @TableField("IORDER")
    private Long iorder;

    @TableField("SPEED")
    private Long speed;

    @TableField("STAYTIME")
    private Long staytime;


}
