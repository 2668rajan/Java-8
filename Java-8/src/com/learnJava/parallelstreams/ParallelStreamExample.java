package com.learnJava.parallelstreams;

import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static int sum_sequential_stream(){
        return IntStream.rangeClosed(1,1000)
                .sum();
    }

    public static int sum_parallel_stream(){
        return IntStream.rangeClosed(1,1000)
                .parallel()
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(sum_sequential_stream());
        System.out.println(sum_parallel_stream());
    }
}
