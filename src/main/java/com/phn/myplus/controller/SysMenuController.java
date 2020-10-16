package com.phn.myplus.controller;

import com.phn.myplus.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author PengHenan
 * @create  2020-10-15 15:11:10
 */
@Controller
@RequestMapping("/menu")
public class SysMenuController {


    @Autowired
    private MenuService menuService;

    @RequestMapping("/menu")
    @ResponseBody
    public Map<String,Object> menu(){
        return menuService.getLeftMenu();
    }



}
