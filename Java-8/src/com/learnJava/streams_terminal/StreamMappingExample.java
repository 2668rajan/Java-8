package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamMappingExample {

    public static List<String> getNames(){
        return StudentDataBase.getAllStudents().stream()
                .collect(mapping(Student::getName, toList()));
    }

    public static Set<String> setNames(){
        return StudentDataBase.getAllStudents().stream()
                .collect(mapping(Student::getName, toSet()));
    }

    public static void main(String[] args) {
        System.out.println("name list : "+getNames());
        System.out.println("name Set : "+setNames());
    }
}
