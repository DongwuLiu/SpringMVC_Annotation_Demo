package com.dongwu.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @author liudw
 * @date 2021/4/8 11:08
 * @effect
 */

@XmlRootElement
public class XMLBook implements Serializable {
    private Integer id;
    private String name;
    private String author;

    public XMLBook() {
        super();
    }

    public XMLBook(Integer id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    @XmlElement
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    @XmlElement
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "XMLBook[id = " + id + ", name = " + name + ", author = " + author + "]";
    }
}
