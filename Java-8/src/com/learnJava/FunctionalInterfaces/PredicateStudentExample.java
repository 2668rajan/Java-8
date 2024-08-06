package com.learnJava.FunctionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (student)-> student.getGradeLevel()>=3;
    static Predicate<Student> p2 = (student)-> student.getGpa()>=3.9;

    public static void filterStudentByGradelevel(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((s)->{
            if (p1.test(s)){
                System.out.println(s);
            }
        });
    }

    public static void filterStudentByGpa(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(p2.test(student)){
                System.out.println(student);
            }
        }));
    }

    public static void filterStudents(){
        System.out.println("\nfiler students : ");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(p1.or(p2).negate().test(student)){
                System.out.println(student);
            }
            else {
                System.out.println(student);
            }
        }));
    }

    public static void main(String[] args) {

        filterStudentByGradelevel();
        System.out.println("\n");
        filterStudentByGpa();
        filterStudents();
    }
}
