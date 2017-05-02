package com.heysteve.heygym.heycore.model;

import javax.persistence.*;

/**
 * Created by martinh on 25/3/2017.
 */
@Entity
@Table(name = "gyms")
public class Gym {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idGym;
    private String name;
    private String address;

    public Integer getIdGym() {
        return idGym;
    }

    public void setIdGym(Integer idGym) {
        this.idGym = idGym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
