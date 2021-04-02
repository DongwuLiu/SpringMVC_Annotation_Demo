package com.dongwu.entity;

import java.io.Serializable;

/**
 * @author liudw
 * @date 2021/3/25 11:01
 * @effect
 */
public class Book implements Serializable {
    private Integer id;     //编号
    private String name;    //书名
    private String author;  //作者

    public Book() {
        super();
    }

    public Book(Integer id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
    }
}
