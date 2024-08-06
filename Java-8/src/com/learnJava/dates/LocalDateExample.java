package com.learnJava.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate : "+localDate);

        LocalDate localDate1 = LocalDate.of(2024, 07,26);
        System.out.println("LocalDate Of : "+localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2023, 365);
        System.out.println("LocalDate OfYearDay : "+localDate2);

        //get
        System.out.println("getMonth : "+localDate.getMonth());
        System.out.println("getMonthValue : "+localDate.getMonthValue());
        System.out.println("getDayOfWeek : "+localDate.getDayOfWeek());
        System.out.println("getDayOfYear : "+localDate.getDayOfYear());
        System.out.println("Day of month using get : "+localDate.get(ChronoField.DAY_OF_MONTH));

        //Modifying LocalDate
        System.out.println();
        System.out.println("PlusDate : "+localDate.plusDays(2));
        System.out.println("PlusMonths : "+localDate.plusMonths(2));
        System.out.println("minusDays : "+localDate.minusDays(2));
        System.out.println("minusMonths : "+localDate.minusMonths(2));
        System.out.println("minusDays : "+localDate.withYear(2023));
        System.out.println("with ChronoFields : " + localDate.with(ChronoField.YEAR, 2023));
        System.out.println("With ChronoField : "+ localDate.with(TemporalAdjusters.firstDayOfMonth()));

        System.out.println("With ChronoField : "+
                localDate.plusMonths(1)
                        .with(TemporalAdjusters.firstDayOfMonth())
                        .getDayOfWeek());

        System.out.println("chronounit minus : " + localDate.minus(1, ChronoUnit.ERAS));

        //Unsupported
        System.out.println("\nUnsupported");
        try{
            System.out.println("chronounit minus : " + localDate.minus(1, ChronoUnit.MINUTES));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("isSupported minutes: " + localDate.isSupported(ChronoUnit.MINUTES));
        System.out.println("isSupported days: " + localDate.isSupported(ChronoUnit.DAYS));
        System.out.println("isSupported years: " + localDate.isSupported(ChronoUnit.YEARS));


        //Additional Support Methods
        System.out.println("\nAdditional Support Methods");
        System.out.println("LeapYear : " + LocalDate.ofYearDay(2024, 1).isLeapYear());
        System.out.println("isEqual : " + localDate.isEqual(localDate1));
        System.out.println("isBefore : " + localDate.isBefore(localDate1));
        System.out.println("isAfter : " + localDate1.isAfter(localDate));
    }
}
