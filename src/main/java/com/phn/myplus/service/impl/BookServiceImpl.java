package com.phn.myplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.phn.myplus.mapper.BookMapper;
import com.phn.myplus.model.Book;
import com.phn.myplus.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author PengHenan
 * @create  2020-01-06 11:16:58
 */
@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> selectBookAll(Wrapper<Book> queryWrapper) {
        return bookMapper.selectList(queryWrapper);
    }
}
