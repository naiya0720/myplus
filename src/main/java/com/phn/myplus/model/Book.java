package com.phn.myplus.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Penghenan
 * @create 2019-12-22 20:59:57
 */
@TableName("t_book")
public class Book implements Serializable {
    @TableId
    private Integer bookid;
    private String bookname;
    private Float bookprice;
    private String bookbrief;
    private String bookimage;

    public Book() {
    }


    public Book(Integer bookid, String bookname, Float bookprice, String bookbrief, String bookimage) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.bookprice = bookprice;
        this.bookbrief = bookbrief;
        this.bookimage = bookimage;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Float getBookprice() {
        return bookprice;
    }

    public void setBookprice(Float bookprice) {
        this.bookprice = bookprice;
    }

    public String getBookbrief() {
        return bookbrief;
    }

    public void setBookbrief(String bookbrief) {
        this.bookbrief = bookbrief;
    }

    public String getBookimage() {
        return bookimage;
    }

    public void setBookimage(String bookimage) {
        this.bookimage = bookimage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", bookprice=" + bookprice +
                ", bookbrief='" + bookbrief + '\'' +
                ", bookimage='" + bookimage + '\'' +
                '}';
    }
}
