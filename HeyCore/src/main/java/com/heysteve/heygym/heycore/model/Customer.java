package com.heysteve.heygym.heycore.model;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("usuario")
public class Customer extends User{

    private String name;

    private String lastName;

    private Integer doc;
    @OneToMany
    @JoinColumn(name="idBills")
    private List <Bill> billsList;

    @OneToMany
    @JoinColumn(name="idWorkouts")
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

    public List<Workout> getWorkoutsList() {
        return workoutsList;
    }

    public void setWorkoutsList(List<Workout> workoutsList) {
        this.workoutsList = workoutsList;
    }

    public List<Bill> getBillsList() {
        return billsList;
    }

    public void setBillsList(List<Bill> billsList) {
        this.billsList = billsList;
    }
}
