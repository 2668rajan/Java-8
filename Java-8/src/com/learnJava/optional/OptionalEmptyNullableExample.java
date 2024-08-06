package com.learnJava.optional;

import java.util.Optional;

public class OptionalEmptyNullableExample {

    public static Optional<String> ofNullable(){
        Optional<String> optionalString = Optional.ofNullable(null);
        return optionalString;
    }

    public static Optional<String> of(){
        Optional<String> optionalString = Optional.of("Hello");
        return optionalString;
    }

    public static Optional<String> empty(){
        Optional<String> optionalString = Optional.empty();
        return optionalString;
    }

    public static void main(String[] args) {
        System.out.println("ofNullable : "+ofNullable().isPresent());
        System.out.println("of : "+of().get());
        System.out.println("empty : "+empty().isEmpty());
    }
}
