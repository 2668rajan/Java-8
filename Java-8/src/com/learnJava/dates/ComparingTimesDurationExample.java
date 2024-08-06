package com.learnJava.dates;

import javax.xml.transform.Source;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(7, 10);
        LocalTime localTime1 = LocalTime.of(8, 20);

        long diff = localTime.until(localTime1, ChronoUnit.MINUTES);
        System.out.println("diff : "+diff);

        Duration duration = Duration.between(localTime, localTime1);
        System.out.println(duration.toMinutes());

        Duration duration1 = Duration.ofHours(3);
        System.out.println("toMinutes " + duration1.toMinutes());

        Duration duration2 = Duration.ofDays(3);
        System.out.println("toHours : "+duration2.toHours());
        System.out.println("toMinutes : "+duration2.toMinutes());

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.now().plusDays(10);


    }
}
