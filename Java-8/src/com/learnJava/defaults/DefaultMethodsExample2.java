package com.learnJava.defaults;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    public static Consumer<Student> studentConsumer = student -> System.out.println(student);
    static  Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static  Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);

    public static void sortByName(List<Student> studentList){
        System.out.println("After Sort : ");

        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    public static void sortByGpa(List<Student> studentList){
        System.out.println("After sorting by Gpa : ");
        Comparator<Student> studentComparator = Comparator.comparingDouble(Student::getGpa);

        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }

    public static void comparatorChaining(List<Student> studentList){
        System.out.println("After comparatorChaining : ");
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);
    }

    public static void sortWithNull(List<Student> studentList){
        System.out.println("After sort with null : ");
        Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Before sort : ");
        studentList.forEach(studentConsumer);

//        sortByName(studentList);
//        sortByGpa(studentList);
   //       comparatorChaining(studentList);
        sortWithNull(studentList);
    }
}
