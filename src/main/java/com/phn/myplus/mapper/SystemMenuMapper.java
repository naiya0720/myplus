package com.phn.myplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.phn.myplus.model.SystemMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author PengHenan
 * @create  2020-10-15 10:46:38
 */
@Mapper
public interface SystemMenuMapper extends BaseMapper<SystemMenu> {

    List<SystemMenu> getMenuByStatusAndSort();



}
