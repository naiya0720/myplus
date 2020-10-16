package com.phn.myplus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.phn.myplus.model.SystemMenu;

import java.util.Map;

/**
 * @author PengHenan
 * @create  2020-10-15 14:42:40
 */
public interface MenuService extends IService<SystemMenu> {

    Map<String,Object> getLeftMenu();
}
