package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {

    public static String joining1(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joining2(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining(" "));
    }
    public static String joining3(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining(" ", "(", ")"));
    }

    public static void main(String[] args) {
        System.out.println("joining 1 : "+joining1());
        System.out.println("joining 2 : "+joining2());
        System.out.println("joining 3 : "+joining3());
    }
}
