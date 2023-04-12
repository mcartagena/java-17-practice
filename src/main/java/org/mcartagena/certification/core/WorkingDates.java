package org.mcartagena.certification.core;

import java.time.*;

public class WorkingDates {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        // Using factories
        var date1 = LocalDate.of(2022, Month.JANUARY, 20);
        var date2 = LocalDate.of(2022, 1, 20);

        System.out.println("Using factories");
        System.out.println(date1);
        System.out.println(date2);

        var time1 = LocalTime.of(6, 15);  // hours and minute
        var time2 = LocalTime.of(6, 15, 30);  // + seconds
        var time3 = LocalTime.of(6, 15, 30, 200);  // + nanoseconds

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

        var dateTime1 = LocalDateTime.of(2022, Month.JANUARY, 20, 6, 15, 30);
        var dateTime2 = LocalDateTime.of(date1, time1);

        System.out.println(dateTime1);
        System.out.println(dateTime2);

    }
}
