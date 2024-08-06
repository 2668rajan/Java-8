package com.learnJava.parallelstreams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.LinkedHashMap;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ParallelStreamExample1 {

    public static List<String> sequqentialPrintStudentActivities(){

        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());

        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute pipeline is sequential : "+(endTime-startTime));
        return studentActivities;
    }

    public static List<String> parallelPrintStudentActivities(){
        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());

        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute pipeline in parallel : " + (endTime-startTime));

        return studentActivities;
    }

    public static void main(String[] args) {
        sequqentialPrintStudentActivities();
        parallelPrintStudentActivities();
    }
}
