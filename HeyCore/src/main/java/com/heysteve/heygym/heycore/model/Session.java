package com.heysteve.heygym.heycore.model;

import java.io.Serializable;

/**
 * Created by martinh on 25/3/2017.
 */
public class Session implements Serializable{

    private Integer sessionId;

    private String descriptionPrueba;
    /*private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }*/

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }


    public String getDescriptionPrueba() {
        return descriptionPrueba;
    }

    public void setDescriptionPrueba(String descriptionPrueba) {
        this.descriptionPrueba = descriptionPrueba;
    }
}
