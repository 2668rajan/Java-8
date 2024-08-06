package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamComparator {

    public static List<Student> sortStudentByName(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
    }

    public static List<Student> sortStudentByGpa(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());
    }

    public static List<Student> sortStudentByGpaDesc(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println("sortStudentByName : ");
        sortStudentByName().forEach(System.out::println);

        System.out.println("\nsortStudentByGpa : ");
        sortStudentByGpa().forEach(System.out::println);

        System.out.println("\nsortStudentByGpaDesc : ");
        sortStudentByGpaDesc().forEach(System.out::println);
    }
}
