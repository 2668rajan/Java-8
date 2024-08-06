package com.learnJava.lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {
        //prior to java 8

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable 1");
            }
        };
        new Thread(runnable).start();

        //after Java 8 using lambda
        Runnable runnableLamda = ()->{
            System.out.println("Inside runnable 2");
        };
        new Thread(runnableLamda).start();

        //
        Runnable runnableLambda1 = ()-> System.out.println("Inside runnable 3");
        new Thread(runnableLambda1).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable 3.1");
            }
        }).start();

        //
        new Thread(()-> System.out.println("Inside runnable 4")).start();
    }

}
