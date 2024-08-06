package com.learnJava.FunctionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> name.toUpperCase();

    static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat(" jha");

    public static void main(String[] args) {
        System.out.println("Result is : " + function.apply("rajan"));
        System.out.println("Result of andThen is : " + function.andThen(addSomeString).apply("rajan"));
        System.out.println("Result of compose is : "+ function.compose(addSomeString).apply("rajan"));
    }
}
