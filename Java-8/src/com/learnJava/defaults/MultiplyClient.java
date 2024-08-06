package com.learnJava.defaults;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplyClient {

    public static void main(String[] args) {

        MultiplyImpl multiply = new MultiplyImpl();
        List<Integer> integerList = Arrays.asList(1,3,5);
        int ans = multiply.multiply(integerList);
        System.out.println("Multiplication of the entire list is : "+ans);

        System.out.println("Size of the entire list is - Default Method: "+multiply.size(integerList));
        System.out.println("Static method - is list empty : "+Multiply.isEmpty(integerList));
    }
}
