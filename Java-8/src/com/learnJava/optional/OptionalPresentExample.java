package com.learnJava.optional;

import com.learnJava.data.Student;

import java.util.Optional;


public class OptionalPresentExample {

    public static void main(String[] args) {

        //isPresent
        Optional<String> optional = Optional.ofNullable("Hello");
        System.out.println(optional.isPresent());
        if (optional.isPresent()){
            System.out.println(optional.get());
        }
        //ifPresent
        optional.ifPresent(s->System.out.println(s));

        Optional<String> optional1 = Optional.ofNullable(null);
        System.out.println(optional1.isPresent());

    }
}
