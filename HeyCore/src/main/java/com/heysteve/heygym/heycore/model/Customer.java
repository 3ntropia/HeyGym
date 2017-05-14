package com.heysteve.heygym.heycore.model;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("usuario")
public class Customer extends User{

    private String name;

    @Column(name="lastname")
    private String lastName;

    private Integer doc;
    @OneToMany
    @JoinColumn(name="idbills")
    @Column(name="bills")
    private List <Bill> billsList;

    @OneToMany
    @JoinColumn(name="idworkouts")
    @Column(name="workouts")
    private List <Workout> workoutsList;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
