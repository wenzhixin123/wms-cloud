package com.xc.wms.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@ToString
@EqualsAndHashCode
@Accessors(chain = true)
public class TreeNode {

    private String id;
    private String name;
    private String pId;
    private String url;
    private Integer orderNum;
    /**
     * 图标
     */
    private String icon;

    /**
     * 权限
     */
    private String permission;
    private String menuType;

    private int num;

//    private List<SysRole> roleList;

    private static final long serialVersionUID = 1L;

    private List<TreeNode> children=new ArrayList<TreeNode>();

    public void addChild(TreeNode treeNode){
        children.add(treeNode);
    }
}