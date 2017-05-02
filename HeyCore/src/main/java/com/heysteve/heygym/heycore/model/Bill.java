package com.heysteve.heygym.heycore.model;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

/**
 * Created by martinh on 26/3/2017.
 */
@Entity
@Table(name = "bills")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idBill;
    private Integer number;
    @OneToMany
    @JoinColumn(name="itemId")
    private List<ItemBill> items;
    @OneToOne
    @JoinColumn(name="id")
    private Customer customer;
    private Calendar dateTime;

    public Integer getIdBill() {
        return idBill;
    }

    public void setIdBill(Integer idBill) {
        this.idBill = idBill;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<ItemBill> getItems() {
        return items;
    }

    public void setItems(List<ItemBill> items) {
        this.items = items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Calendar getDateTime() {
        return dateTime;
    }

    public void setDateTime(Calendar dateTime) {
        this.dateTime = dateTime;
    }
}
