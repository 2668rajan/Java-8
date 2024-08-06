package com.learnJava.optional;

import com.learnJava.data.Bike;
import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    //filter
    public static void optionalFilter(){

        Optional<Student> optionalStudent =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        optionalStudent.filter(student -> student.getGpa()>=3.5)
                .ifPresent(student -> System.out.println(student));
    }

    //map
    public static void optionalMap(){
        Optional<Student> optionalStudentMap =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if (optionalStudentMap.isPresent()){
            Optional<String> optionalString = optionalStudentMap
                    .filter(student -> student.getGpa()>=3.5)
                    .map(Student::getName);
            System.out.println(optionalString.get());
        }
    }
//flatMap
    public static void optionalFlatMap(){
        Optional<Student> optionalStudentFlatMap =
                Optional.of(StudentDataBase.studentSupplier.get());

        Optional<String> name = optionalStudentFlatMap
                .filter(student -> student.getGpa()>=3.5)
                .flatMap(Student::getBike)
                .map(Bike::getName);

        name.ifPresent(s -> System.out.println(s));
    }

    public static void main(String[] args) {

        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
