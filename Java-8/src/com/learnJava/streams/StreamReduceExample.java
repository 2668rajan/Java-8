package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList){
        return integerList.stream().reduce(1,(a,b)->a*b);
    }

    //performing operation without identity
    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){
        return integerList.stream().reduce((a,b)->a*b);
    }

    //get student with highest gpa
    public static Optional<Student> getHighestGpa(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)->{
                   if (s1.getGpa()>= s2.getGpa()){
                       return s1;
                   }else{
                       return s2;
                   }
                });
    }

    //Student with highest GradeLevel
    public static Optional<Student> getHighestGrade(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)->{
                    if(s1.getGradeLevel()>=s2.getGradeLevel()){
                        return s1;
                    }else{
                        return s2;
                    }
                });
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,5,7);
        System.out.println("result is : "+ performMultiplication(integers));

        System.out.println("\nperformMultiplicationWithoutIdentity : ");
        Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
        System.out.println(result.isPresent());
        System.out.println(result.get());

        //Student with highest Gpa
        Optional<Student> optionalStudent = getHighestGpa();
        if (optionalStudent.isPresent()){
            System.out.println("\nStudent with highest Gpa is : " + optionalStudent.get());
        }

        //Student with highest GradeLevel
        Optional<Student> optionalStudent1 = getHighestGrade();
        if (optionalStudent1.isPresent()){
            System.out.println("\nStudent with highest GradeLevel is : " + optionalStudent1.get());
        }

        List<String> animals = Arrays.asList("Lion", "Rabbit", "Dog", "Elephant","Horse", "Leopard");
        System.out.println("\n");
        Optional<String> animal = getAnimal(animals);
        if (animal.isPresent()){
            System.out.println(animal.get());
        }else {
            System.out.println("not found");
        }
    }

    public static Optional<String> getAnimal(List<String> animals){
        return animals.stream()
                .reduce((s1, s2)->{
                   if (s1.length()>=s2.length()){
                       return s1;
                   }else{
                       return s2;
                   }
                });
    }
}
