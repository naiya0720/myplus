package com.phn.myplus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.phn.myplus.model.Book;

import java.util.List;

/**
 * @author PengHenan
 * @create  2020-01-06 11:15:06
 */

public interface IBookService extends IService<Book> {
    List<Book> selectBookAll(Book book);

    int deletBook(Integer bookid);


}
