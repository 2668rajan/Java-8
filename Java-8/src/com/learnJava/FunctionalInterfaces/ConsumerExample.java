package com.learnJava.FunctionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c2 = (student)-> System.out.println(student);
    static Consumer<Student> c3 = (student) -> System.out.println(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

    static Consumer<Student> c5 = (student) -> {
        System.out.println(student.getName() +" - " + student.getActivities());
    };

    public static void printName(){

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }

    public static void printNameAndActivity(){
        System.out.println("\n.....printNameAndActivity : \n");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c3.andThen(c4));
        System.out.println();
        studentList.forEach(c5);
        System.out.println();
    }

    public static void printNameAndActivityUsingCondition(){
        System.out.println("\n.....printNameAndActivityUsingCondition : \n");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(student.getGradeLevel()>=3){
                c3.andThen(c4).accept(student);
            }
        }));
    }

    public static void main(String[] args) {

        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("java8");

       // printName();
        System.out.println("\n.................\n");
        printNameAndActivity();

        printNameAndActivityUsingCondition();
    }
}
