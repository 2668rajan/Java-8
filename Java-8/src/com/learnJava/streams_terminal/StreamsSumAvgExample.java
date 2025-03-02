package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumAvgExample {

    public static int sum(){
        return StudentDataBase.getAllStudents().stream()
                .collect(summingInt(Student::getNotebook));
    }
    public static double average(){
        return StudentDataBase.getAllStudents().stream()
                .collect(averagingInt(Student::getNotebook));
    }
    public static void main(String[] args) {
        System.out.println("Total no of notebooks : "+sum());
        System.out.println("Average no of notebooks : "+average());
    }
}
