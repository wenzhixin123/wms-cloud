package com.xc.wms.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
public class BaseEntity implements Serializable {

    /**
     * 公司(仓库)代码
     */
    @TableField(value = "OFFICE_CODE",fill = FieldFill.INSERT_UPDATE)
    protected String officeCode;

    /**
     * 并发访问控制
     */
    @TableField(value = "REC_VER",fill = FieldFill.INSERT_UPDATE)
    @Version
    protected Long recVer;

    /**
     * 创建人
     */
    @TableField(value = "CREATOR",fill = FieldFill.INSERT)
    protected String creator;

    /**
     * 创建时间
     */
    @TableField(value = "CREATE_TIME",fill = FieldFill.INSERT)
    protected Date createTime;

    /**
     * 修改人
     */
    @TableField(value = "MODIFIER",fill = FieldFill.UPDATE)
    protected String modifier;

    /**
     * 修改时间
     */
    @TableField(value = "MODIFY_TIME",fill = FieldFill.UPDATE)
    protected Date modifyTime;

}
