package com.sda.io.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtils {

    //        2019-08-4
    public static String convertLocalDateToString(LocalDate localDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
        String dateString = localDate.format(formatter);
        return dateString;
    }

    //        2019-08-04
    public static String convertLocalDateToString2(LocalDate localDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateString = localDate.format(formatter);
        return dateString;
    }

    public static Date convertToDateViaInstant(LocalDate dateToConvert) {
        return Date.from(dateToConvert.atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant());
    }
}
