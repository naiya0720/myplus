package com.phn.myplus.mapper;

import com.phn.myplus.model.Book;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * @author Penghenan
 * @create 2019-12-22 21:09:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookMapperTest {

    @Autowired
    private BookMapper bookMapper;


    @Before
    public void setUp() throws Exception {
    }

    /**
     *   查询所有不分页
     */
    @Test
    public void selectAllTest(){
        List<Book> books = bookMapper.selectList(null);
        books.forEach(System.out::println);
    }

    /**
     *   删除单个
     */
    @Test
    public void deleteTest(){
        int i = bookMapper.deleteById(7);
        System.out.println("i   >>>>>>:   "+i);
    }

    /**
     *   新增
     */
    @Test
    public void insertTest(){
        Book book = new Book(7,"金庸",100f,"哈哈哈哈","jushf");
        int insert = bookMapper.insert(book);
        System.out.println("insert  >>>>>>:   "+insert);
    }


    /**
     *   修改单个
     */
    @Test
    public void updateTest(){
        //查询单个
        Book book1 = bookMapper.selectById(7);
        System.out.println("修改前：》》》》》》  "+book1);
        Book book = new Book();
        book.setBookid(7);
        book.setBookname("神雕侠侣");
        book.setBookimage("45456");
        //  修改单个，会自动根据标识列去修改相应字段
        bookMapper.updateById(book);
        Book book2 = bookMapper.selectById(7);
        System.out.println("修改后：》》》》》》  "+book2);
    }


}