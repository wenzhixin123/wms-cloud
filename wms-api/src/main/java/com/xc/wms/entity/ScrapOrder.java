package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class ScrapOrder implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 报废单表主键
     */
    @TableId(value = "scrap_order_uuid", type = IdType.UUID)
    private String scrapOrderUuid;

    /**
     * 报废单单号
     */
    private String scrapOrderNo;

    /**
     * 报废单类型(0  正常报废，1  异常报废)
     */
    private String scrapType;

    /**
     * 出库作业单号
     */
    private String logisticsOrderNo;

    /**
     * 状态
     */
    private String status;

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
     * 并发访问控制
     */
    private Long recVer;

    /**
     * 控制位
     */
    private String controlWord;

    /**
     * 公司别
     */
    private String companyId;


}
