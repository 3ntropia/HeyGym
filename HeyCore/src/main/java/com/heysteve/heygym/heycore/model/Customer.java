package com.heysteve.heygym.heycore.model;

/**
 * Created by martinh on 25/3/2017.
 */
public class Customer extends User{
    private Integer id;
    private String name;
    private Integer doc;

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

    public Integer getDoc() {
        return doc;
    }

    public void setDoc(Integer doc) {
        this.doc = doc;
    }
}
