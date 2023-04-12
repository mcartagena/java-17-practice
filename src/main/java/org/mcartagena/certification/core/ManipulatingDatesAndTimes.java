package org.mcartagena.certification.core;

import java.time.*;

public class ManipulatingDatesAndTimes {
    public static void main(String[] args) {
        var date = LocalDate.of(2022, Month.JANUARY, 20);
        System.out.println(date);  // 2022-01-20

        date = date.plusDays(2);
        System.out.println(date);  // 2022-01-22

        date = date.plusWeeks(1);
        System.out.println(date);  // 2022-01-29

        date = date.plusMonths(1);
        System.out.println(date);  // 2022-02-28

        date = date.plusYears(5);
        System.out.println(date);  // 2027-02-28

        date = LocalDate.of(2024, Month.JANUARY, 20);
        var time = LocalTime.of(5, 15);
        var dateTime = LocalDateTime.of(date, time);

        System.out.println("Backward in time...");
        System.out.println(dateTime);

        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime);

        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime);

        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime);

        date = LocalDate.of(2024, Month.JANUARY, 20);
        time = LocalTime.of(5, 15);
        dateTime = LocalDateTime.of(date, time)
                .minusDays(1)
                .minusHours(10)
                .minusSeconds(30);

        System.out.println(dateTime);
    }
}
