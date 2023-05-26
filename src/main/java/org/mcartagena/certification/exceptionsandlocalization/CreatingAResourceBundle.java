package org.mcartagena.certification.exceptionsandlocalization;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class CreatingAResourceBundle {
    public static void printWelcomeMessage(Locale locale) {
        var rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hello") + ", " + rb.getString("open"));
    }

    public static void main(String[] args) {
        var us = new Locale("en", "US");
        var france = new Locale("fr", "FR");

        printWelcomeMessage(us);
        printWelcomeMessage(france);

        String format = ResourceBundle.getBundle("Zoo", us).getString("helloByName");
        System.out.println(MessageFormat.format(format, "Tamy", "Henry"));

    }
}
