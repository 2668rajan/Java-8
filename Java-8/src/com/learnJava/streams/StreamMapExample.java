package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static List<String> nameStream(){
        return StudentDataBase.getAllStudents()
                .stream()//stream<Student>
                .map(Student::getName)//Student name
                .collect(Collectors.toList());//Stream<String>
    }

    public static List<Integer> gradeLevelStream(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getGradeLevel)
                .collect(Collectors.toList());
    }

    public static List<Double> gpaStream(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getGpa)
                .collect(Collectors.toList());
    }

    public static List<String> genderStream(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getGender)
                .collect(Collectors.toList());
    }

    public static List<List<String>> activitiesStream(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(nameStream());
        System.out.println(gradeLevelStream());
        System.out.println(gpaStream());
        System.out.println(genderStream());
        System.out.println(activitiesStream());
    }
}
