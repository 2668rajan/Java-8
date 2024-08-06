package com.learnJava.lambdas;

import java.util.Comparator;
import java.util.concurrent.ConcurrentMap;

public class ComparatorLambaExample {
    public static void main(String[] args) {

        //prior to Java 8
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Result of the comparator is : "+comparator.compare(12,3));

        //using lamda
        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Result of the Lambda comparator is : " + comparatorLambda.compare(2,3));

        Comparator<Integer> comparatorLambda1 = (a, b) -> a.compareTo(b);
        System.out.println("Result of the Lambda comparator is : " + comparatorLambda1.compare(2,3));


    }

}
