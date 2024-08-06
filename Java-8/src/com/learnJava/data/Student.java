package com.learnJava.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    List<String> activities = new ArrayList<>();
    private int notebook;
    private Optional<Bike> bike = Optional.empty();

    //getters setters

    public Optional<Bike> getBike() {
        return bike;
    }

    public void setBike(Optional<Bike> bike) {
        this.bike = bike;
    }

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities, int notebook) {
        this.name = name;
        this.activities = activities;
        this.gender = gender;
        this.gpa = gpa;
        this.gradeLevel = gradeLevel;
        this.notebook = notebook;
    }

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
    }

    public Student() {

    }

    public int getNotebook() {
        return notebook;
    }

    public void setNotebook(int notebook) {
        this.notebook = notebook;
    }

    public Student(String s) {
        this.name=s;
    }

    public void printActivities(){
        System.out.println(activities);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", gpa=" + gpa +
                ", gender='" + gender + '\'' +
                ", activities=" + activities +
                ", notebook=" + notebook +
                ", bike=" + bike +
                '}';
    }
}
