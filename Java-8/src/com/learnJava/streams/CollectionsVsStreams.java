package com.learnJava.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rajan");
        names.add("John");
        names.add("Ram");

        for(String name : names){
            System.out.print(name + " ");
        }
        System.out.println();
        for(String name : names){
            System.out.print(name + " ");
        }

        System.out.println("\n\nprinting stream...");

        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
        //nameStream.forEach(System.out::println);
    }
}
