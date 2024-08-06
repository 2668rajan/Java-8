package com.learnJava.FunctionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){
        BiConsumer<String, List> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            biConsumer.accept(student.getName(), student.getActivities());
        });
    }

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a,b)->{
          System.out.println("a : " + a + ", b : " + b);
        };
        biConsumer.accept("Hi", "Rajan");

        //operations
        BiConsumer<Integer, Integer> add = (a, b)->{
          System.out.println("Addition is : "+(a+b));
        };

        BiConsumer<Integer, Integer> subtract = (a,b)->{
            System.out.println("Substraction is : " + (a-b));
        };

        BiConsumer<Integer, Integer> multiply = (a,b)->{
            System.out.println("Multiplication is : " + (a*b));
        };

        BiConsumer<Integer, Integer> divide = (a,b)->{
          System.out.println("Division is : " + (a/b));
        };

        add.andThen(subtract).andThen(multiply).andThen(divide).accept(12,3);

        nameAndActivities();
    }
}
