package com.phn.myplus.utils;

import com.phn.myplus.vo.SystemMenuVo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PengHenan
 * @create  2020-10-15 11:37:24
 */
public class MenuTreeUtil {

    public static List<SystemMenuVo> toTree(List<SystemMenuVo> treeList,Integer pid){
        List<SystemMenuVo> menuVos = new ArrayList<>();
        treeList.forEach(parent->{
            if (pid.equals(parent.getPid())) {
                menuVos.add(findChildren(parent,treeList));
            }
        });
        return menuVos;
    }

    public static SystemMenuVo findChildren(SystemMenuVo parent,List<SystemMenuVo> treeList){
        treeList.forEach(child->{
            if (parent.getId().equals(child.getPid())){
                if (parent.getChild()==null){
                    parent.setChild(new ArrayList<>());
                }
                parent.getChild().add(findChildren(child,treeList));
            }
        });
        return parent;
    }

}
