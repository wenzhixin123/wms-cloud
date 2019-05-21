package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
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
public class ScrapOrderDetail extends BaseEntity {

private static final long serialVersionUID=1L;

    /**
     * 报废单明细主键
     */
    @TableId(value = "scrap_order_detail_uuid", type = IdType.UUID)
    private String scrapOrderDetailUuid;

    /**
     * 报废单主键
     */
    private String scrapOrderUuid;

    /**
     * 报废单号
     */
    private String scrapOrderNo;

    /**
     * 物料编码
     */
    private String itemCode;

    /**
     * 物料名称
     */
    private String goodsDesc;

    /**
     * 型号
     */
    private String model;

    /**
     * 规格
     */
    private String spec;

    /**
     * 包装单位代码
     */
    private String qtyUnitCode;

    /**
     * 包装单位描述
     */
    private String qtyUnitDesc;

    /**
     * 数量
     */
    private BigDecimal qty;

    /**
     * 来源作业单明细UUID
     */
    private String inLogisticsOrderDetailUuid;

    /**
     * 来源作业单号
     */
    private String inLogisticsOrderNo;

    /**
     * 备注
     */
    private String remark;

    /**
     * 自定义字段1
     */
    private String aux1;

    /**
     * 自定义字段2
     */
    private String aux2;

    /**
     * 自定义字段3
     */
    private String aux3;

    /**
     * 自定义字段4
     */
    private String aux4;

    /**
     * 自定义字段5
     */
    private String aux5;

    /**
     * 公司（仓库）代码
     */
    private String officeCode;

    /**
     * 并发访问控制
     */
    private Long recVer;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 状态
     */
    private String status;

    /**
     * 类型
     */
    private String transactionType;


}
