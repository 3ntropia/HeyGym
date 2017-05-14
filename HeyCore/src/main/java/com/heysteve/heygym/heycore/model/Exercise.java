package com.heysteve.heygym.heycore.model;

import javax.persistence.*;

/**
 * Created by martinh on 25/3/2017.
 */
@Entity
@Table(name = "excercises")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idexercise")
    private Integer idExercise;
    private String name;
    private String description;
    private String repetition;
    private Integer effort;
    private Integer rest;
    private Integer weight;
    private Integer time;
    private Integer set;

    public Exercise() {
    }

    public Integer getIdExercise() {
        return idExercise;
    }

    public void setIdExercise(Integer idExercise) {
        this.idExercise = idExercise;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getRest() {
        return rest;
    }

    public void setRest(Integer rest) {
        this.rest = rest;
    }

    public Integer getEffort() {
        return effort;
    }

    public void setEffort(Integer effort) {
        this.effort = effort;
    }

    public String getRepetition() {
        return repetition;
    }

    public void setRepetition(String repetition) {
        this.repetition = repetition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getSet() {
        return set;
    }

    public void setSet(Integer set) {
        this.set = set;
    }
}
