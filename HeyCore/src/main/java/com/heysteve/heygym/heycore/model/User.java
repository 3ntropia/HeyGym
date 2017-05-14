package com.heysteve.heygym.heycore.model;

import javax.persistence.*;

/**
 * Created by marti on 1/5/2017.
 */
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn( name="tipo", discriminatorType= DiscriminatorType.STRING)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    private String userName;

    private String email;

    public User(String name, String email) {
        this.userName = name;
        this.email = email;
    }

    public User() { }

    public User (Integer id){
        this.userId = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
