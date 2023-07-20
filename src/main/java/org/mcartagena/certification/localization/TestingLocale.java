package org.mcartagena.certification.localization;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class TestingLocale {
    void loadPod() {
        new Locale.Builder()
                .setLanguage("en")
                .setRegion("US").build();
        var rb = ResourceBundle.getBundle("container");
        String name = rb.getString("name");
        String type = rb.getString("type");
        System.out.print(name + " " + type);
    }

    public static void main(String[] args) {
        var x = LocalDate.of(2022, 3, 1);
        var y = LocalDateTime.of(2022, 1, 1, 2, 55);
        var f = DateTimeFormatter.ofPattern("'yyyy-MM'");
        System.out.print(f.format(x) + " " + f.format(y));

        var d = LocalDateTime.parse("2022-01-21T12:00:00",
                DateTimeFormatter.ISO_LOCAL_DATE);  // DateTimeParseException: Text '2022-01-21T12:00:00' could not be parsed, unparsed text found at index 10
        System.out.print(d.format(DateTimeFormatter.ISO_LOCAL_TIME));
    }
}
