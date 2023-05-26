package org.mcartagena.certification.exceptionsandlocalization;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.stream.Stream;

public class FormattingWithCompactNumberFormat {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);  // es_CL

        var formatters = Stream.of(
                NumberFormat.getCompactNumberInstance(),
                NumberFormat.getCompactNumberInstance(Locale.getDefault(), NumberFormat.Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.getDefault(), NumberFormat.Style.LONG),
                NumberFormat.getCompactNumberInstance(Locale.GERMAN, NumberFormat.Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.GERMAN, NumberFormat.Style.LONG)
        );

        /*
        formatters.map(s -> s.format(7_123_456))
                .forEach(System.out::println);

        7 M
        7 M
        7 millones
        7 Mio.
        7 Millionen
        */

        formatters.map(s -> s.format(314_900_000))
                .forEach(System.out::println);

        /*
        315 M
        315 M
        315 millones
        315 Mio.
        315 Millionen
         */
    }
}
