package com.learnJava.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

    public static void main(String[] args) {
        //sort the list of names in alphabetical order

        List<String> namesList = Arrays.asList("Adam", "Jenny", "Alex", "Dan", "Mike", "Eric");

        //prior to java 8
//        Collections.sort(namesList);
//        System.out.println("Sorted List using Collections.sort() : "+namesList );

        //Using Java 8
        namesList.sort(Comparator.naturalOrder());
        System.out.println("Sorted list using List.sort() : "+namesList);
        namesList.sort(Comparator.reverseOrder());
        System.out.println("Sorted list using List.sort() reverse : "+namesList);
    }
}
