package com.phn.myplus.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author PengHenan
 * @create  2020-10-15 10:42:00
 */
@Data
@TableName("system_menu")
public class SystemMenu implements Serializable {

    @TableId
    private Integer id;
    private Integer pid;
    private String title;
    private String icon;
    private String href; // 链接
    private String target; //链接打开方式
    private Integer sort; // 菜单排序
    private Integer status; // 状态（0：禁用，1：启用）
    private String remark;// 备注信息
    private Date createAt; // 创建时间
    private Date updateAt; // 更新时间
    private Date deleteAt; // 删除时间

}
