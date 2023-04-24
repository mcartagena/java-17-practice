package org.mcartagena.certification.lambdasfuncionalinterfaces;

import java.util.function.Consumer;

public class Crow {
    private String color = "blue";
    public static String form = "circle";

    public void caw(String name) {
        String volume = "loudly";
        color = "black";
        form = "rectangle";

        // nane = "Caty";  // DOES NOT COMPILE

        Consumer<String> consumer = s -> System.out.println(name +
                " says " + volume + " that she is " + color + " and " + form);

        // volume = "softly";  // DOES NOT COMPILE

        consumer.accept("blue");

    }

    public static void main(String[] args) {
        var crow = new Crow();
        crow.caw("Marcelo");
    }
}
