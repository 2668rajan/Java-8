package com.learnJava.FunctionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    static Predicate<Student> p1 = (student)-> student.getGradeLevel()>=3;
    static Predicate<Student> p2 = (student) -> student.getGpa()>=3.9;

    BiConsumer<String, List<String>> biConsumer = (name, activities)-> System.out.println(name + " : " + activities);

    //Bipredicate
    BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel>=3 && gpa>=3.9;

    Consumer<Student> studentConsumer = (student -> {
//       if (p1.and(p2).test(student)){
        if(biPredicate.test(student.getGradeLevel(), student.getGpa())){
            biConsumer.accept(student.getName(),student.getActivities());
       }
    });

    public void printNameAndActivities(List<Student> studentList){
        studentList.forEach(studentConsumer); //consumer example

    }

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();
       new PredicateAndConsumerExample().printNameAndActivities(studentList);
    }
}
