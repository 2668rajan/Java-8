package com.learnJava.streams;

import com.learnJava.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;

public class StreamMatchExample {

    public static boolean allMatchAnimal(List<String> animals){
        return animals.stream().allMatch(animal -> animal.length() >= 3);
    }

    public static boolean allMatch(){
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa()>=3.5);
    }

    public static boolean anyMatch(){
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa()>=4.0);
    }
    public static boolean noneMatch(){
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()<=4.5);
    }

    public static void main(String[] args) {
        List<String> animals = Arrays.asList("Lion", "Rabbit", "Dog", "Elephant","Horse", "Leopard");
        System.out.println(allMatchAnimal(animals));

        System.out.println("Result of all match Student : "+allMatch());

        System.out.println("Result of any match Student : "+anyMatch());

        System.out.println("Result of none match Student : "+noneMatch());
    }
}
