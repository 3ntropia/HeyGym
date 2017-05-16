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
    private Integer idWorkout;

    private String name;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="idExercise")
    private List<Exercise> exerciseList;

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

    public List<Exercise> getExerciseList() {
        return exerciseList;
    }

    public void setExerciseList(List<Exercise> exerciseList) {
        this.exerciseList = exerciseList;
    }
}
