package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAny(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }
    public static Optional<Student> findFirst(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=4.1)
                .findFirst();
    }


    public static void main(String[] args) {
        Optional<Student> optional = findAny();
        if (optional.isPresent()){
            System.out.println(optional.get());
        }else {
            System.out.println("Not found");
        }

        Optional<Student> optionalFirst = findFirst();
        if (optionalFirst.isPresent()){
            System.out.println(optionalFirst.get());
        }else {
            System.out.println("Not found");
        }
    }
}
