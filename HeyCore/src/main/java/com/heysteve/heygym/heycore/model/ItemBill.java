package com.heysteve.heygym.heycore.model;

import javax.persistence.*;

/**
 * Created by martinh on 26/3/2017.
 */
@Entity
@Table(name = "itemsbill")
public class ItemBill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idItem;

    public Integer getIdItem() {
        return idItem;
    }

    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }
}
