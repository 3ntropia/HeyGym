package com.heysteve.heygym.heycore.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by martinh on 25/3/2017.
 */
@Entity
@Table(name = "workouts")
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idworkout")
    private Integer idWorkout;
    private String name;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="idexercise")
    private List<Exercise> exercise;

    public Integer getIdWorkout() {
        return idWorkout;
    }

    public void setIdWorkout(Integer idWorkout) {
        this.idWorkout = idWorkout;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Exercise> getExercise() {
        return exercise;
    }

    public void setExercise(List<Exercise> exercise) {
        this.exercise = exercise;
    }
}
