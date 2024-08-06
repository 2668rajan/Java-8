package com.learnJava.FunctionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Student> supplier = ()->{
          return new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
        };

        System.out.println(supplier.get());

        Supplier<List<Student>> listSupplier = ()->{
            return StudentDataBase.getAllStudents();
        };

        System.out.println(listSupplier.get());
    }
}
