package com.heysteve.heygym.heycore.model;

import java.util.List;

/**
 * Created by martinh on 25/3/2017.
 */
public class Workout {
    private String name;
    private List<Exercise> exercise;

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
