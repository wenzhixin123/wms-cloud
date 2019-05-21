package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 危险品参数
 * </p>
 *
 * @author wenzhixin
 * @since 2019-05-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BasDanger extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableId(value = "BAS_DANGER_UUID", type = IdType.UUID)
    private String basDangerUuid;

    /**
     * 危险品国际编号
     */
    @TableField("UN_CODE")
    private String unCode;

    /**
     * 国内危险品编码
     */
    @TableField("CN_CODE")
    private String cnCode;

    /**
     * 危险品中文名称
     */
    @TableField("UN_NAME")
    private String unName;

    /**
     * 英文名称
     */
    @TableField("UN_NAME_EN")
    private String unNameEn;

    /**
     * 危品类别
     */
    @TableField("CLASS_NO")
    private String classNo;

    /**
     * IMDG规则页码
     */
    @TableField("IMDG_NO")
    private String imdgNo;

    /**
     * 医疗急救指南号
     */
    @TableField("MFAG_NO")
    private String mfagNo;

    /**
     * 危险品应急措施号
     */
    @TableField("EMS_NO")
    private String emsNo;

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
     * 中心代码
     */
    @TableField("CENTER_CODE")
    private String centerCode;

    /**
     * 控制字：默认0
     */
    @TableField("CONTROL_WORD")
    private String controlWord;


}
