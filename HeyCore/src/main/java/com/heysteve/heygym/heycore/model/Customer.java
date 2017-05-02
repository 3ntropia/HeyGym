package com.heysteve.heygym.heycore.model;


public class Customer extends User{

    private String name;
    private Integer doc;

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
