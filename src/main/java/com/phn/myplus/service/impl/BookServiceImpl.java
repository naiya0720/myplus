package com.phn.myplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class BookServiceImpl extends ServiceImpl<BookMapper,Book> implements IBookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> selectBookAll(Book book) {
        LambdaQueryWrapper<Book> lambdaQuery = Wrappers.<Book>lambdaQuery();
        lambdaQuery.like(Book::getBookname,book.getBookname());
        return bookMapper.selectList(lambdaQuery);
    }

    @Override
    public int deletBook(Integer bookid) {
        LambdaQueryWrapper<Book> queryWrapper = Wrappers.<Book>lambdaQuery();
        queryWrapper.eq(Book::getBookid,bookid);
        return  bookMapper.delete(queryWrapper);
    }

}
