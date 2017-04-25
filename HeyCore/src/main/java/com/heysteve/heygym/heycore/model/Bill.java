package com.heysteve.heygym.heycore.model;

import java.util.Calendar;
import java.util.List;

/**
 * Created by martinh on 26/3/2017.
 */
public class Bill {
    private Integer number;
    private List<ItemBill> items;
    private Customer customer;
    private Calendar dateTime;

}
