package com.phn.myplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phn.myplus.mapper.SystemMenuMapper;
import com.phn.myplus.model.SystemMenu;
import com.phn.myplus.service.MenuService;
import com.phn.myplus.utils.MenuTreeUtil;
import com.phn.myplus.vo.SystemMenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author PengHenan
 * @create  2020-10-15 14:44:08
 */
@Service
public class MenuServiceImpl extends ServiceImpl<SystemMenuMapper,SystemMenu> implements MenuService {


    @Autowired
    private SystemMenuMapper menuMapper;


    @Override
    public Map<String, Object> getLeftMenu() {
        Map<String,Object> map = new HashMap<>();
        Map<String,Object> home = new HashMap<>();
        Map<String,Object> logo = new HashMap<>();
        LambdaQueryWrapper<SystemMenu> menuQueryWrapper = Wrappers.lambdaQuery();
        menuQueryWrapper.eq(SystemMenu::getStatus,1).orderByAsc(SystemMenu::getSort);
        List<SystemMenu> systemMenus = menuMapper.selectList(menuQueryWrapper);

        List<SystemMenuVo> menuVoList = new ArrayList<>();
        systemMenus.forEach(menu->{
            SystemMenuVo menuVo = new SystemMenuVo();
            menuVo.setId(menu.getId());
            menuVo.setPid(menu.getPid());
            menuVo.setHref(menu.getHref());
            menuVo.setTitle(menu.getTitle());
            menuVo.setIcon(menu.getIcon());
            menuVo.setTarget(menu.getTarget());
            menuVoList.add(menuVo);
        });
        map.put("menuInfo", MenuTreeUtil.toTree(menuVoList,0));
        home.put("title","首页");
        home.put("href","page/welcome-1");// 控制器路由，自定义
        logo.put("title","后台管理系统");
        logo.put("image","images/logo.png");//静态资源文件路径,可使用默认的logo.png
        map.put("homeInfo", home);
        map.put("logoInfo", logo);

//        List<SystemMenu> menuByStatusAndSort = menuMapper.getMenuByStatusAndSort();
        return map;
    }
}
