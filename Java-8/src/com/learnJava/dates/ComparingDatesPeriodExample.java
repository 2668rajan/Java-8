package com.learnJava.dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 01, 01);
        LocalDate localDate1 = LocalDate.of(2024, 12, 31);

        Period period = localDate.until(localDate1);
        System.out.println("getDays : "+period.getDays());
        System.out.println("getMonths : " + period.getMonths());
        System.out.println("getYears : " + period.getYears());

        System.out.println();

        Period period1 = Period.ofDays(10);
        System.out.println("period1.getDays : "+period1.getDays());
        Period period2 = Period.ofYears(10);
        System.out.println("get Years : " + period2.getYears());
        System.out.println("total months : "+period2.toTotalMonths());

        Period period3 = Period.between(localDate, localDate1);
        System.out.println("Period : " + period3.getDays() + ":" + period3.getMonths()+":"+period3.getYears());
    }
}
