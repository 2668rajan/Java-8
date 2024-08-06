package com.learnJava.methodReference;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReference {

    //static Consumer<Student> c1 = p-> System.out.println(p);
        static Consumer<Student>  c2 = System.out::println;

        //className::instanceMethodName
    static Consumer<Student> c3 = Student::printActivities;

    public static void main(String[] args) {

        StudentDataBase.getAllStudents().forEach(c2);
        System.out.println();
        StudentDataBase.getAllStudents().forEach(c3);

    }
}
