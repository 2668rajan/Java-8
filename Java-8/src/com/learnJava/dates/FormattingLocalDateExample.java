package com.learnJava.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {

    public static void parseLocalDate(){
        String date = "2024-07-25";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println("localDate : " + localDate);

        LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("localdate1 : " + localDate1);

        String date1 = "20240725";//yyyymmdd
        LocalDate localDate2 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("localDate2 : " +localDate2);

        //custome defined DateFormatter
        String date2 = "2024|07|25";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate3 = LocalDate.parse(date2, dateTimeFormatter);
        System.out.println("localDate3 : " + localDate3);

        String date3 = "2024*07*25";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy*MM*dd");
        LocalDate localDate4 = LocalDate.parse(date3, dateTimeFormatter1);
        System.out.println("localDate4 : " + localDate4);
    }
    public static void formatLocalDate(){

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate = LocalDate.now();
        String formattedDate = localDate.format(dateTimeFormatter);
        System.out.println("formattedDate : " + formattedDate);
    }

    public static void main(String[] args) {
        parseLocalDate();
        formatLocalDate();
    }
}
