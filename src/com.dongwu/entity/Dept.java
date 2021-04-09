package com.dongwu.entity;

/**
 * @author liudw
 * @date 2021/4/9 15:20
 * @effect
 */
public class Dept {
    private Integer id;
    private String name;

    public Dept() {
        super();
    }

    public Dept(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Dept[" + "id = " + id + ", name = " + name + "]";
    }
}
