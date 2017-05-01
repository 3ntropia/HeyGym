package com.heysteve.heygym.heycore.model;

import javax.persistence.*;

/**
 * Created by marti on 1/5/2017.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

}
