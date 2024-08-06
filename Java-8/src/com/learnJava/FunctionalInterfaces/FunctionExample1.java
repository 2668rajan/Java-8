package com.learnJava.FunctionalInterfaces;

import java.util.function.Function;

public class FunctionExample1 {

    public static String performConcat(String s){
        return FunctionExample.addSomeString.apply(s);
    }

    public static void main(String[] args) {
        String result = performConcat("hello");
        System.out.println(result);
    }
}
