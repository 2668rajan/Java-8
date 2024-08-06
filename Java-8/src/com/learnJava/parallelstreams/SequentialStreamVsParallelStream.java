package com.learnJava.parallelstreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SequentialStreamVsParallelStream {


    private static long checkPerformanceResult(Supplier<Integer> supplier, int numberOfTimes) {
        long start = System.currentTimeMillis();
        for (int i = 0; i <numberOfTimes ; i++) {
            supplier.get();
        }
        long end = System.currentTimeMillis();
        return end-start;
    }


    public static int sum_sequential_stream(){
        return IntStream.rangeClosed(1,100000).sum();
    }

    public static int sum_parallel_stream(){
        return IntStream.rangeClosed(1,100000).parallel().sum();
    }

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println(checkPerformanceResult( ParallelStreamExample::sum_sequential_stream,20));

        System.out.println(checkPerformanceResult(ParallelStreamExample::sum_parallel_stream,20));
    }

}
