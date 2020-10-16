package com.phn.myplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author PengHenan
 * @create  2020-10-14 9:48:53
 */
@Controller
@RequestMapping("/page")
public class PagesController {


    private static final String  PAGE_BASE_PATH = "layuimini/page/";


    @RequestMapping("/welcome-1")
    public String toWelcome1(){
        return PAGE_BASE_PATH+"welcome-1";
    }

    @RequestMapping("/welcome-2")
    public String toWelcome2(){
        return PAGE_BASE_PATH+"welcome-2";
    }

    @RequestMapping("/welcome-3")
    public String toWelcome3(){
        return PAGE_BASE_PATH+"welcome-3";
    }

    @RequestMapping("/menu")
    public String toMenu(){
        return PAGE_BASE_PATH+"menu";
    }

    @RequestMapping("/setting")
    public String toSetting(){
        return PAGE_BASE_PATH+"setting";
    }

    @RequestMapping("/table")
    public String toTable(){
        return PAGE_BASE_PATH+"table";
    }


    @RequestMapping("/table/add")
    public String toAdd(){
        return PAGE_BASE_PATH+"table/add";
    }

    /**
     *  普通表单
     * @return
     */
    @RequestMapping("/form")
    public String toForm(){
        return PAGE_BASE_PATH+"form";
    }


    /**
     *  分布表单
     * @return
     */
    @RequestMapping("/form-step")
    public String toFormStep(){
        return PAGE_BASE_PATH+"form-step";
    }


    @RequestMapping("/not-found")
    public String toNotFound(){
        return PAGE_BASE_PATH+"not-found";
    }


    @RequestMapping("/table-select")
    public String toTableSelect(){
        return PAGE_BASE_PATH+"table-select";
    }

    @RequestMapping("/icon")
    public String toIcon(){
        return PAGE_BASE_PATH+"icon";
    }

    @RequestMapping("/button")
    public String toButton(){
        return PAGE_BASE_PATH+"button";
    }

    @RequestMapping("/editor")
    public String toEditor(){
        return PAGE_BASE_PATH+"editor";
    }


    @RequestMapping("/upload")
    public String toUpload(){
        return PAGE_BASE_PATH+"upload";
    }


    @RequestMapping("/icon-picker")
    public String toIconPicker(){
        return PAGE_BASE_PATH+"icon-picker";
    }


    @RequestMapping("/color-select")
    public String toColorSelect(){
        return PAGE_BASE_PATH+"color-select";
    }


    @RequestMapping("/area")
    public String toArea(){
        return PAGE_BASE_PATH+"area";
    }

    @RequestMapping("/layer")
    public String toLayer(){
        return PAGE_BASE_PATH+"layer";
    }


    @RequestMapping("/login-1")
    public String toLogin1(){
        return PAGE_BASE_PATH+"login-1";
    }

    @RequestMapping("/login")
    public String toLogin2(){
        return PAGE_BASE_PATH+"login-2";
    }


    @RequestMapping("/login-3")
    public String toLogin3(){
        return PAGE_BASE_PATH+"login-3";
    }


    @RequestMapping("/user-setting")
    public String toUserSetting(){
        return PAGE_BASE_PATH+"user-setting";
    }


    @RequestMapping("/user-password")
    public String toUserPassword(){
        return PAGE_BASE_PATH+"user-password";
    }




}
