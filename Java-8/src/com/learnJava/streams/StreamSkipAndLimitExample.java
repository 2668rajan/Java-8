package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamSkipAndLimitExample {

    public static Optional<Integer> limit(List<Integer> list){
        return list.stream()
                .limit(3)
                .reduce((x,y)->x+y);
    }

    public static Optional<Integer> skip(List<Integer> list){
        return list.stream()
                .skip(3)
                .reduce((x,y)->x+y);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,7,8,9,10);

        Optional<Integer> limitResult = limit(list);
        if (limitResult.isPresent()) {
            System.out.println("The limit result is : " + limitResult.get());
        }else{
            System.out.println("Empty list found " );
        }

        Optional<Integer> skipResult = skip(list);
        if (skipResult.isPresent()) {
            System.out.println("The skip result is : " + skipResult.get());
        }else{
            System.out.println("Empty list found " );
        }
    }
}
