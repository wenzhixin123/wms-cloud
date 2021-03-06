package com.xc.wms.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.wms.common.util.CommonUtils;
import com.xc.wms.common.util.TreeNode;
import com.xc.wms.entity.SysMenuGroup;
import com.xc.wms.entity.SysMenuItem;
import com.xc.wms.entity.SysViewButton;
import com.xc.wms.mapper.SysMenuGroupMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xc.wms.service.ISysMenuGroupService;
import com.xc.wms.service.ISysMenuItemService;
import com.xc.wms.service.ISysViewButtonService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 菜单分组 服务实现类
 * </p>
 *
 * @author wenzhixin
 * @since 2019-04-28
 */
@Service
public class SysMenuGroupServiceImpl extends ServiceImpl<SysMenuGroupMapper, SysMenuGroup> implements ISysMenuGroupService{

    @Autowired
    private ISysMenuItemService sysMenuItemService;

    @Autowired
    private ISysViewButtonService sysViewButtonService;


    @Override
    public List<SysMenuGroup> getMenuByUser(String userId) {

        return this.baseMapper.getMenuByUser(userId);
    }

    @Override
    public JSONArray getMenuJsonList() {

//        LambdaQueryWrapper<SysMenuGroup> queryWrapper = Wrappers.<SysMenuGroup>lambdaQuery();
        //获取到所有菜单组
        List<SysMenuGroup> sysMenuGroups = this.baseMapper.selectList(null);


        //1. 筛选所有顶级菜单组
        List<SysMenuGroup> topMenuGrp = sysMenuGroups.stream().filter(sg -> StringUtils.isEmpty(sg.getPreSysMenuGroupUuid())).collect(Collectors.toList());
        //2. 排除所有顶级菜单组 , 剩下的是次级菜单组
        sysMenuGroups.removeAll(topMenuGrp);
        //3. 根据顶级组查找次级菜单组和次级菜单
        topMenuGrp.sort(Comparator.comparing(SysMenuGroup::getMenuGrpName));
        //4. 迭代获取当前顶级菜单的节点树
        JSONArray jsonArr = new JSONArray();
        int i = 0;
        for(SysMenuGroup sysMenuGroup : topMenuGrp){

            //4.1 拼接菜单树
            TreeNode treeNode = childMenuGrp(sysMenuGroup,sysMenuGroups);


            jsonArr.add(treeNode);
            ++i;

//            //4.2 添加次级菜单
//            SysMenuItem sysMenuItem = childMenuItem();
//            sysMenuGroup.addChild();
        }


        return jsonArr;
    }

    @Override
    public boolean addMenuGrpAndItemBtn(TreeNode treeNode) {
        //1.根据当前节点类型判断，0 菜单组，1，菜单项，2 按钮 进行分别保存菜单组，菜单项，按钮
        if(StringUtils.isEmpty(treeNode.getMenuType())) throw new IllegalArgumentException("请选择菜单类型");
        SysMenuGroup sysMenuGroup = null;
        SysMenuItem sysMenuItem = null;
        SysViewButton sysViewButton = null;

        switch (treeNode.getMenuType()){
            case CommonUtils.SYS_MENU_GRP_TYPE : sysMenuGroup = converTreeNode2MenuGrp(new SysMenuGroup(),treeNode); break;
            case CommonUtils.SYS_MENU_ITEM_TYPE : sysMenuItem = converTreeNode2MenuItem(new SysMenuItem(),treeNode); break;
            case CommonUtils.SYS_MENU_BTN_TYPE : sysViewButton = converTreeNode2Btn(new SysViewButton(),treeNode); break;
        }
        if(sysMenuGroup != null){
           return this.save(sysMenuGroup);
        }
        if(sysMenuItem != null){
           return sysMenuItemService.save(sysMenuItem);
        }
        if(sysViewButton != null){
            return sysViewButtonService.save(sysViewButton);
        }
        return false;
    }

    private TreeNode childMenuGrp(SysMenuGroup sysMenuGrp,List<SysMenuGroup> allSysMenuGrps) {

//        TreeNode treeNode = new TreeNode();
//
//        treeNode.setId(sysMenuGrp.getSysMenuGroupUuid())
//                .setIcon("")
//                .setName(sysMenuGrp.getMenuGrpName())
//                .setMenuType(CommonUtils.SYS_MENU_GRP_TYPE)
//                .setNum(0)
//                .setOrderNum(sysMenuGrp.getMenuGrpSeq() != null ? sysMenuGrp.getMenuGrpSeq().intValue() : 0)
//                .setPId(sysMenuGrp.getPreSysMenuGroupUuid());

        TreeNode treeNode = converMenuGrp2TreeNode(sysMenuGrp,new TreeNode());

        //1. 筛选当前菜单组节点下面，所有的子菜单组
        List<SysMenuGroup> childMenuGrps = allSysMenuGrps.stream().filter(s -> s.getPreSysMenuGroupUuid().equals(sysMenuGrp.getSysMenuGroupUuid())).collect(Collectors.toList());

        //2.查询当前菜单组节点的次级菜单
//        String sysMenuUuid = sysMenuGrp.getSysMenuGroupUuid();
        LambdaQueryWrapper<SysMenuItem> itemQuery = Wrappers.<SysMenuItem>lambdaQuery().eq(SysMenuItem::getSysMenuGroupUuid, sysMenuGrp.getSysMenuGroupUuid());
        List<SysMenuItem> sysMenuItems = sysMenuItemService.list(itemQuery);

        //3.设置当前菜单组下的所有菜单节点
        if(CollectionUtils.isNotEmpty(sysMenuItems)){
            for(SysMenuItem var : sysMenuItems){
//
//                TreeNode itemNode = new TreeNode();
//
//                itemNode.setId(var.getSysMenuItemUuid())
//                        .setIcon("")
//                        .setName(var.getMenuItemName())
//                        .setMenuType(CommonUtils.SYS_MENU_ITEM_TYPE)
//                        .setNum(0)
//                        .setOrderNum(var.getMenuItemSeq() != null ? var.getMenuItemSeq().intValue() : 0)
//                        .setPId(var.getSysMenuGroupUuid())
//                        .setUrl(var.getMenuItemUrl());

                TreeNode itemNode = converMenuItem2TreeNode(var,new TreeNode());



                //4.查询当前菜单节点下的按钮
                LambdaQueryWrapper<SysViewButton> buttonQuery = Wrappers.<SysViewButton>lambdaQuery().eq(SysViewButton::getSysMenuItemUuid, var.getSysMenuItemUuid());
                List<SysViewButton> sysMenuBtns = sysViewButtonService.list(buttonQuery);

                //菜单节点添加多个按钮节点
                if(CollectionUtils.isNotEmpty(sysMenuBtns)){
                    for(SysViewButton buttnVar : sysMenuBtns){

//                        TreeNode btNode = new TreeNode();
//
//                        btNode.setId(buttnVar.getSysViewButtonUuid())
//                                .setIcon("")
//                                .setName(buttnVar.getBtnName())
//                                .setMenuType(CommonUtils.SYS_MENU_BTN_TYPE)
//                                .setNum(0)
////                                .setOrderNum(buttnVar.get)
//                                .setPId(buttnVar.getSysMenuItemUuid())
//                                .setPermission(buttnVar.getBtnAction());

                        TreeNode btNode = converBtn2TreeNode(buttnVar,new TreeNode());


//                        var.addChild(buttnVar);
                        itemNode.addChild(btNode);
                    }
                }
                //菜单组节点添加多个菜单节点
//                sysMenuGrp.addChild(var);
                treeNode.addChild(itemNode);
            }
        }

        //2.筛选所有菜单分组中不包含该子菜单分组的菜单分组
        allSysMenuGrps.removeAll(childMenuGrps);
        for(SysMenuGroup var : childMenuGrps){
            TreeNode childTreeNode = childMenuGrp(var,allSysMenuGrps);
//            sysMenuGrp.addChild(childMenuGrp);
            treeNode.addChild(childTreeNode);
        }

        return treeNode;
    }



    private SysViewButton converTreeNode2Btn(SysViewButton sysViewButton, TreeNode treeNode) {
        sysViewButton.setSysViewButtonUuid(treeNode.getId())
                .setIcon(treeNode.getIcon())
                .setBtnName(treeNode.getName())
                .setSysMenuItemUuid(treeNode.getPId())
                .setViewBtnSeq(treeNode.getOrderNum().doubleValue())
                .setBtnAction(treeNode.getPermission());
        return sysViewButton;
    }

    private SysMenuItem converTreeNode2MenuItem(SysMenuItem sysMenuItem, TreeNode treeNode) {
        sysMenuItem.setSysMenuItemUuid(treeNode.getId())
                .setIcon(treeNode.getIcon())
                .setMenuItemName(treeNode.getName())
                .setMenuItemSeq(treeNode.getOrderNum().doubleValue())
                .setSysMenuGroupUuid(treeNode.getPId())
                .setMenuItemUrl(treeNode.getUrl());
        return sysMenuItem;
    }

    private SysMenuGroup converTreeNode2MenuGrp(SysMenuGroup sysMenuGrp,TreeNode treeNode){
        sysMenuGrp.setSysMenuGroupUuid(treeNode.getId())
                .setIcon(treeNode.getIcon())
                .setMenuGrpName(treeNode.getName())
                .setMenuGrpSeq(treeNode.getOrderNum().doubleValue())
                .setPreSysMenuGroupUuid(treeNode.getPId());
        return sysMenuGrp;
    }

    private TreeNode converMenuGrp2TreeNode(SysMenuGroup sysMenuGrp,TreeNode treeNode){

        treeNode.setId(sysMenuGrp.getSysMenuGroupUuid())
                .setIcon("")
                .setName(sysMenuGrp.getMenuGrpName())
                .setMenuType(CommonUtils.SYS_MENU_GRP_TYPE)
                .setNum(0)
                .setOrderNum(sysMenuGrp.getMenuGrpSeq() != null ? sysMenuGrp.getMenuGrpSeq().intValue() : 0)
                .setPId(sysMenuGrp.getPreSysMenuGroupUuid());
        return  treeNode;
    }

    private TreeNode converMenuItem2TreeNode(SysMenuItem sysMenuItem,TreeNode treeNode){

        treeNode.setId(sysMenuItem.getSysMenuItemUuid())
                .setIcon("")
                .setName(sysMenuItem.getMenuItemName())
                .setMenuType(CommonUtils.SYS_MENU_ITEM_TYPE)
                .setNum(0)
                .setOrderNum(sysMenuItem.getMenuItemSeq() != null ? sysMenuItem.getMenuItemSeq().intValue() : 0)
                .setPId(sysMenuItem.getSysMenuGroupUuid())
                .setUrl(sysMenuItem.getMenuItemUrl());
        return treeNode;
    }

    private TreeNode converBtn2TreeNode(SysViewButton sysViewButton, TreeNode treeNode){
        treeNode.setId(sysViewButton.getSysViewButtonUuid())
                .setIcon("")
                .setName(sysViewButton.getBtnName())
                .setOrderNum(sysViewButton.getViewBtnSeq() != null ? sysViewButton.getViewBtnSeq().intValue() : 0)
                .setMenuType(CommonUtils.SYS_MENU_BTN_TYPE)
                .setNum(0)
                .setPId(sysViewButton.getSysMenuItemUuid())
                .setPermission(sysViewButton.getBtnAction());
        return treeNode;
    }

}
