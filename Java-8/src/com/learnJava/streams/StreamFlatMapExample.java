package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamFlatMapExample {

    public static List<String> printStudentActivities(){

        List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());

        return studentActivities;
    }

    public static long getNoOfStudentActivities(){
        long c = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
        return c;
    }

    public static void main(String[] args) {
        System.out.println("printStudentActivities : "+printStudentActivities());
        System.out.println("NoOfStudentActivities : "+ getNoOfStudentActivities());
    }
}
