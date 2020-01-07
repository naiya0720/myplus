package com.phn.myplus.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.phn.myplus.model.Book;

import java.util.List;

/**
 * @author PengHenan
 * @create  2020-01-06 11:15:06
 */

public interface IBookService {
    List<Book> selectBookAll(Wrapper<Book> queryWrapper);
}
