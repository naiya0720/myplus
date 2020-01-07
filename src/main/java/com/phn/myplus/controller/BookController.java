package com.phn.myplus.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.phn.myplus.model.Book;
import com.phn.myplus.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author PengHenan
 * @create  2020-01-06 11:11:59
 */
@Controller
public class BookController {

    @Autowired
    private IBookService bookService;

    @RequestMapping("/")
    public String toBookList(){
        return "book/bookList";
    }

    @ResponseBody
    @RequestMapping("/queryAll")
    public Map<String,Object> queryBookAll(Book book){
        if("".equals(book.getBookname()))
            book.setBookname(null);
            Wrapper<Book> bookWrapper = new Wrapper<Book>() {
                @Override
                public Book getEntity() {
                    return book;
                }

                @Override
                public MergeSegments getExpression() {
                    return null;
                }

                @Override
                public String getSqlSegment() {
                    return null;
                }
            };
            List<Book> books = bookService.selectBookAll(bookWrapper);
            Map<String,Object> maps = new HashMap<>();
            maps.put("data",books);
            maps.put("message",1);
            maps.put("success",true);
            maps.put("total",3);
            return maps;
    }

}
