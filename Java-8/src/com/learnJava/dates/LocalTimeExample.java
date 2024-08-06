package com.learnJava.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime : "+localTime);

        LocalTime localTime1 = LocalTime.of(23,33);
        System.out.println("LocalTime1 : "+localTime1);

        LocalTime localTime2 = LocalTime.of(23,33,45);
        System.out.println("LocalTime2 : "+localTime2);

        LocalTime localTime3 = LocalTime.of(23,33,45,98237623);
        System.out.println("LocalTime3 : "+localTime3);

        //getting the values from local time instance
        System.out.println("\nGet methods---");
        System.out.println("LocalTime-getHour : "+localTime.getHour());
        System.out.println("LocalTime-getMinutes : "+localTime.getMinute());
        System.out.println("LocalTime-getSeconds : "+localTime.getSecond());
        System.out.println("LocalTime-getNano : "+localTime.getNano());
        System.out.println("ChronoField.CLOCK_HOUR_OF_DAY : "+
                localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println("ChronoField.CLOCK_HOUR_OF_AMPM : "+
                localTime.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println("toSecondOfDay : "+
                localTime.toSecondOfDay());

        //modify valules of local time
        System.out.println("\nModify value of local time : ");
        System.out.println("minusHours : " + localTime.minusHours(2));
        System.out.println("minusHours ChronoUnit : " + localTime.minus(2, ChronoUnit.HOURS));
        System.out.println("HOUR_OF_DAY : " + localTime.with(ChronoField.HOUR_OF_DAY, 22));
        System.out.println("MIDNIGHT : " + localTime.with(LocalTime.MIDNIGHT));
        System.out.println("MIDNIGHT : " + localTime.with(LocalTime.MIDNIGHT));
        System.out.println("plusMinutes : " + localTime.plusMinutes(13));
        System.out.println("plusHour : " + localTime.plusHours(2));
        System.out.println("withHour : " + localTime.withHour(13));


    }
}
