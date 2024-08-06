package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>=3);
        Predicate<Student> studentGPAPredicate = (student -> student.getGpa()>=3.9);

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
                        .stream()
                        .filter(studentPredicate)
                        .filter(studentGPAPredicate)
                        .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentMap);

        System.out.println();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

    }
}
