package org.mcartagena.certification.core;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestingZonedDateTime {
    public static void main(String[] args) {
        var localDate = LocalDate.of(2022, 10, 6);
        var localTime = LocalTime.of(1, 0);
        var zone = ZoneId.of("America/New_York");
        var z = ZonedDateTime.of(localDate, localTime, zone);
        var offset = z.getOffset();

        for (int i = 0; i < 6; i++)
            z = z.plusHours(1);

        System.out.println(z.getHour() + " "
                + offset.equals(z.getOffset()));
    }
}
