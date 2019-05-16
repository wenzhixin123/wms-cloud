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
 * 信息发布表
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysNews implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "SYS_NEWS_UUID", type = IdType.UUID)
    private String sysNewsUuid;

    /**
     * 序号
     */
    @TableField("SEQ_NO")
    private Long seqNo;

    /**
     * 发布日期
     */
    @TableField("DATE_WORK")
    private Date dateWork;

    /**
     * 标题
     */
    @TableField("TITLE")
    private String title;

    /**
     * 内容
     */
    @TableField("CONTENT")
    private Blob content;

    /**
     * 类型
     */
    @TableField("NEWS_TYPE")
    private String newsType;

    /**
     * 是否有附件
     */
    @TableField("IF_FILES")
    private String ifFiles;

    /**
     * 经手人
     */
    @TableField("FUNCTIONARY")
    private String functionary;

    /**
     * 连接地址
     */
    @TableField("URL_ADDRESS")
    private String urlAddress;

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
     * 控制字：默认0
     */
    @TableField("CONTROL_WORD")
    private String controlWord;

    /**
     * 公司（仓库）代码
     */
    @TableField("OFFICE_CODE")
    private String officeCode;

    /**
     * 并发访问控制
     */
    @TableField("REC_VER")
    private Long recVer;

    /**
     * 创建人
     */
    @TableField("CREATOR")
    private String creator;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private Date createTime;

    /**
     * 修改人
     */
    @TableField("MODIFIER")
    private String modifier;

    /**
     * 修改时间
     */
    @TableField("MODIFY_TIME")
    private Date modifyTime;


}
