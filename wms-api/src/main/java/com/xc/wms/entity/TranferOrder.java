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
public class TranferOrder implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 在途仓出库表主键
     */
    @TableId(value = "TRANFER_ORDER_UUID", type = IdType.UUID)
    private String tranferOrderUuid;

    /**
     * 在途仓出库单号
     */
    @TableField("TRANFER_ORDER_NO")
    private String tranferOrderNo;

    /**
     * 公司别
     */
    @TableField("COMPANY_ID")
    private String companyId;

    /**
     * 快递公司
     */
    @TableField("EXPRESS_COMPANY")
    private String expressCompany;

    /**
     * 快递单号
     */
    @TableField("EXPRESS_LIST_NO")
    private String expressListNo;

    /**
     * 经销商名称
     */
    @TableField("DEALER_NAME")
    private String dealerName;

    /**
     * 手机号
     */
    @TableField("TELEPHONE")
    private String telephone;

    /**
     * 0为京东，1为唯品会
     */
    @TableField("TYPE")
    private String type;

    /**
     * 出库（0）或入库（1）
     */
    @TableField("TRANFER_TYPE")
    private String tranferType;

    /**
     * 收件人
     */
    @TableField("SENDEE")
    private String sendee;

    /**
     * 状态
     */
    @TableField("STATUS")
    private String status;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 自定义字段1
     */
    @TableField("AUX1")
    private String aux1;

    /**
     * 自定义字段2
     */
    @TableField("AUX2")
    private String aux2;

    /**
     * 自定义字段3
     */
    @TableField("AUX3")
    private String aux3;

    /**
     * 自定义字段4
     */
    @TableField("AUX4")
    private String aux4;

    /**
     * 自定义字段5
     */
    @TableField("AUX5")
    private String aux5;

    /**
     * 仓库代码
     */
    @TableField("OFFICE_CODE")
    private String officeCode;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private Date createTime;

    /**
     * 创建人
     */
    @TableField("CREATOR")
    private String creator;

    /**
     * 修改时间
     */
    @TableField("Modify_Time")
    private Date modifyTime;

    @TableField("Modifier")
    private String Modifier;

    /**
     * 并发控制
     */
    @TableField("Rec_Ver")
    private Long recVer;

    /**
     * 控制字
     */
    @TableField("Control_Word")
    private String controlWord;


}
