package com.learnJava.parallelstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ParallelStreamBoxedExample {

    public static int   sequentialSum(List<Integer> intgerList){
        long startTime = System.currentTimeMillis();
        int sum = intgerList.stream().
                reduce(0,(x,y)->x+y);

        System.out.println("Duration in sequential sum : "+(System.currentTimeMillis() - startTime));
        return sum;
    }

    public static int parallelSum(List<Integer> intgerList){
        long startTime= System.currentTimeMillis();
       int sum = intgerList.parallelStream()
               .reduce(0,(x,y)->x+y);

       long endTime = System.currentTimeMillis();

       System.out.println("Duration in parallel sum : " + (endTime-startTime));
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1,10000)
                .boxed()
                .collect(toList());

        System.out.println("sequential sum is : "+sequentialSum(integerList));
        System.out.println("Parallel sum is : "+parallelSum(integerList));
    }
}
