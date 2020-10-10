package com.phn.myplus.controller;

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
        List<Book> books = bookService.selectBookAll(book);
        Map<String,Object> maps = new HashMap<>();
        maps.put("data",books);
        maps.put("message",1);
        maps.put("success",true);
        maps.put("total",3);
        return maps;
    }


    @ResponseBody
    @RequestMapping("/delBook")
    public Map<String,Object> delBook(Integer bookid){
        int i = bookService.deletBook(bookid);
        Map<String,Object> maps = new HashMap<>();
        if(i>0){
            maps.put("msg","删除成功");
            maps.put("flag",true);
            maps.put("code",1);
        }else {
            maps.put("msg","删除失败");
            maps.put("flag",false);
            maps.put("code",0);
        }
        return maps;
    }


}
