package org.mcartagena.certification.exceptionsandlocalization;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class TestingFormattingValues {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        double t = 100_102.2d;

        System.out.println(NumberFormat.getCompactNumberInstance()
                .format(t));  // 100K

        System.out.println(NumberFormat
                .getCompactNumberInstance(Locale.getDefault(),
                        NumberFormat.Style.SHORT).format(t));  // 100k

        System.out.println(NumberFormat.getCurrencyInstance().format(t));  // $100,102.20

        // LocalDate date = LocalDate.parse("2022-04-30", DateTimeFormatter.ISO_LOCAL_DATE_TIME);  // DateTimeParseException: Text '2022-04-30' could not be parsed at index 10
        LocalDate date = LocalDate.parse("2022-04-30T10:15:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());  // 2022 APRIL 30

        String pattern = "#,###,000.0#";

        var message = DoubleStream.of(5.21, 8.49, 1234)
                .mapToObj(v -> new DecimalFormat(pattern).format(v))
                .collect(Collectors.joining("> <"));

        System.out.println("<" + message + ">");  // <005.21> <008.49> <1,234.0>

    }
}
