package com.learnJava.defaults;

import java.util.List;

public interface Multiply {

    int multiply(List<Integer> integerList);

    default int size(List<Integer> integerList){
        System.out.println("Inside Multiply interface : ");
        return integerList.size();
    }

    static boolean isEmpty(List<Integer> integerList){
        System.out.println("Inside Multiply interface : ");
        return integerList!=null && integerList.size()>0;
    }
}
