package org.mcartagena.certification.exceptionsandlocalization;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalizingDates {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        var italy = new Locale("it","IT");

        var dt = LocalDateTime.of(2022, Month.OCTOBER, 20, 15,12,34);

        print(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT), dt, italy);  // 10/20/22 --- 20/10/22
        print(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT), dt, italy);  // 3:12 PM --- 15:12
        print(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT), dt, italy);  // 10/20/22, 3:12 PM --- 20/10/22, 15:12
    }

    public static void print(DateTimeFormatter dtf, LocalDateTime dateTime, Locale locale){
        System.out.println(dtf.format(dateTime) + " --- " + dtf.withLocale(locale).format(dateTime));
    }
}
