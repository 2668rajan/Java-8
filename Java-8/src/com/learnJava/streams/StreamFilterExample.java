package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamFilterExample {

    //filtering students whose gender is female
    public static List<Student> filterStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGender().equals("female")))
                .collect(toList());
    }

    //filtering students whose gender is female and gpa>=3.9
    public static List<Student> filterStudentByGenderAndGpa(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("female"))
                .filter(student -> student.getGpa()>=3.9)
                .collect(toList());
    }

    public static List<Student> filterStudentByGenderAndGpa1(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("male"))
                .filter(student -> student.getGpa()>=3.9)
                .collect(toList());
    }

    public static List<Student> filteringStudentBySwimming(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getActivities().contains("swimming"))
                .collect(toList());
    }

    public static void main(String[] args) {

        filterStudent().forEach(System.out::println);
        System.out.println("\nfiltering students whose gender is female and gpa>=3.9  : ");
        filterStudentByGenderAndGpa().forEach(System.out::println);

        System.out.println("\nfiltering students whose gender is female and gpa>=3.9  : ");
        filterStudentByGenderAndGpa1().forEach(System.out::println);

        System.out.println("\nFiltering students whose activities is swimming : ");
        filteringStudentBySwimming().forEach(System.out::println);
    }
}
