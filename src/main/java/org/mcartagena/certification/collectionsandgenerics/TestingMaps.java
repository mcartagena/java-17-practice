package org.mcartagena.certification.collectionsandgenerics;

import java.util.HashMap;

public class TestingMaps {
    public static void main(String[] args) {
        var names = new HashMap<String, String>();
        names.put("peter", "pan");
        names.put("wendy", "darling");

        // String w = names.getOrDefault("peter");  // does not compile expected 2 arguments
        String x = names.getOrDefault("peter", "x");
        String y = names.getOrDefault("john", "x");

        System.out.println("x " + x + " y " + y);
    }
}
