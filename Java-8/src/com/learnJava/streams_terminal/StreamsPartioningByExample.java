package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartioningByExample {

    public static void partitioning_1(){
        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.9;

        Map<Boolean, List<Student>>  partitioningMap= StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate));

        System.out.println(partitioningMap);
    }

    public static void partitioning_2(){
        Predicate<Student> gpaPrediacte = student -> student.getGpa()>=3.9;
       Map<Boolean, Set<Student>> setStudent =  StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPrediacte,
                        toSet()));

       System.out.println(setStudent);
    }

    public static void main(String[] args) {
//        partitioning_1();
        partitioning_2();
    }
}
