package com.learnJava.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.summarizingDouble;
import static java.util.stream.Collectors.toList;

public class NumericStreamBoxingUnboxingExample {

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10)
                .boxed()
                .collect(toList());
    }

    public static int unboxing(List<Integer> list){
        return list.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,10);
        System.out.println("Boxing : "+boxing());

        System.out.println("Unboxing : "+unboxing(list));
    }
}
