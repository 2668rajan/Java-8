package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collector;

import static com.learnJava.data.StudentDataBase.getAllStudents;
import static com.learnJava.data.StudentDataBase.studentSupplier;
import static java.util.stream.Collectors.*;

public class StreamsGroupingByExample {

    public static void groupStudentByGender(){

        Map<String, List<Student>> studentMap = getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));

        System.out.println(studentMap);
    }

    public static void customizedGroupBy(){
        Map<String, List<Student>> customisedStudentMap = getAllStudents()
                .stream()
                .collect(groupingBy(student -> student.getGpa()>=3.8 ? "OUTSTANDING" : "AVERAGE"));
        System.out.println(customisedStudentMap);
    }

    public static void twoLevelGrouping1(){
        Map<Integer, Map<String, List<Student>>> studentMap = getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student-> student.getGpa()>=3.8 ? "OUTSTANDING":"AVERAGE")));

        System.out.println(studentMap);

    }

    public static void twoLevelGrouoing2(){
        Map<Integer, Integer> studentMap = getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        summingInt(Student::getNotebook)));

        System.out.println(studentMap);
    }

    public static void twoLevelGrouping3(){
       Map<String, Integer> studentMap = getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender,
                        summingInt(Student::getNotebook)));

       System.out.println(studentMap);
    }

    public static void threeArgumentGroupBy(){
        LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));
        System.out.println(studentLinkedHashMap);
    }

    //calculateTopGpa
    public static void calculateTopGpa(){
        //below will return optional student
        Map<Integer, Optional<Student>> optionalStudentMap= StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))));

        System.out.println(optionalStudentMap);

        //let us convert the optional student into student

       Map<Integer, Student> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),
                        Optional::get)));

       System.out.println(studentMap);
    }

    public static void calculateLeastGpa(){
        // below will return optional student
        Map<Integer, Optional<Student>> minGpaStudentOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        minBy(Comparator.comparing(Student::getGpa))));

        System.out.println(minGpaStudentOptional);

        //below will convert the optional student into student


       Map<Integer, Student> minStudentGpa =  StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(minBy(Comparator.comparing(Student::getGpa)),
                                Optional::get)));

       System.out.println(minStudentGpa);
    }

    public static void main(String[] args) {
        //groupStudentByGender();
       // customizedGroupBy();
        //twoLevelGrouping1();
//        twoLevelGrouoing2();
//        twoLevelGrouping3();

       // threeArgumentGroupBy();
        //calculateTopGpa();
        calculateLeastGpa();

    }
}
