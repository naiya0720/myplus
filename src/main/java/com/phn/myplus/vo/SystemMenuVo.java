package com.phn.myplus.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

/**
 * @author PengHenan
 * @create  2020-10-15 11:08:16
 */

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SystemMenuVo {


    private Integer id;
    private Integer pid;
    private String title;
    private String icon;
    private String href;
    private String target;

    private List<SystemMenuVo> child;

}
