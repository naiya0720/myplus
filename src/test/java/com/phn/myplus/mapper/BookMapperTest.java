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

}