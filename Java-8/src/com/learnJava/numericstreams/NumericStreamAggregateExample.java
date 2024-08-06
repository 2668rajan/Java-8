package com.learnJava.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 50).sum();
        System.out.println("Sum is " + sum);

        OptionalInt optionalMax = IntStream.rangeClosed(1, 50).max();
        System.out.println("Max is " + optionalMax.getAsInt());

        OptionalLong optionalLong = LongStream.rangeClosed(51, 100).min();
        System.out.println(optionalLong.isPresent());
        System.out.println(optionalLong.getAsLong());

        OptionalDouble optionalAverage = IntStream.rangeClosed(1,50).average();
        System.out.println(optionalAverage.isPresent());
        System.out.println(optionalAverage.getAsDouble());
    }
}
