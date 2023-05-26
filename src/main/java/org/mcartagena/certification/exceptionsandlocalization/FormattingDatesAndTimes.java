package org.mcartagena.certification.exceptionsandlocalization;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class FormattingDatesAndTimes {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, Month.OCTOBER, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dt = LocalDateTime.of(date, time);

        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));  // 2022-10-20
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));  // 11:12:34
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));  // 2022-10-20T11:12:34

        // date.format(DateTimeFormatter.ISO_LOCAL_TIME);  // UnsupportedTemporalTypeException: Unsupported field: HourOfDay
        // time.format(DateTimeFormatter.ISO_LOCAL_DATE);  // UnsupportedTemporalTypeException: Unsupported field: Year

        // Customizing the Date/Time format
        var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
        System.out.println(dt.format(f));  // octubre 20, 2022 at 11:12

    }
}
