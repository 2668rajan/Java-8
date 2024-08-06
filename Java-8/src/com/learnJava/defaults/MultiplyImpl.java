package com.learnJava.defaults;

import java.util.List;

public class MultiplyImpl implements Multiply{

    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1,(x,y)->x*y);
    }

    public int size(List<Integer> integerList){
        System.out.println("Inside MultiplyImpl implementation class : ");
        return integerList.size();
    }
    
}
