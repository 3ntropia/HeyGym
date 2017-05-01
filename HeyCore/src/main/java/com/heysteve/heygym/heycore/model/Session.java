package com.heysteve.heygym.heycore.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sessions")
public class Session implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sessionId;

    private String email;

    private String password;

    private String descriptionPrueba;
    /*private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }*/

    public Session(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public Session(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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
