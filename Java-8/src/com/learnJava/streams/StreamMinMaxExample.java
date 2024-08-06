package com.learnJava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

    public static int findMaxValue(List<Integer> list){
        return list.stream()
                .reduce(0,(x,y)->x>y?x:y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> list){
        return list.stream()
                .reduce((x,y)->x>y?x:y);
    }

    //below method doesn't give the min value. use optional class

//    public static int findMinValue(List<Integer> list){
//        return list.stream()
//                .reduce(0,(x,y)->x<y?x:y);
//    }

    public static Optional<Integer> findMinValueOptional(List<Integer> list){
        return list.stream()
                .reduce((x,y)->x<y?x:y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);

        //List<Integer> integerList = new ArrayList<>();

        System.out.println("Max Value is : " + findMaxValue(integerList));

        Optional<Integer> maxValueOptional = findMaxValueOptional(integerList);
        if (maxValueOptional.isPresent()){
            System.out.println("Max Value using optional : " + maxValueOptional.get());
        }
        else {
            System.out.println("Empty list found");
        }
        //min

        //System.out.println("Min Value is : " + findMinValue(integerList));

        Optional<Integer> minValueOptional = findMinValueOptional(integerList);
        if (maxValueOptional.isPresent()){
            System.out.println("Min Value using optional : " + minValueOptional.get());
        }
        else {
            System.out.println("Empty list found");
        }
    }
}
