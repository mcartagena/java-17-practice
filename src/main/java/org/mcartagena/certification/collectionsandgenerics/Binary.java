package org.mcartagena.certification.collectionsandgenerics;

import java.util.*;

public class Binary {

    // called without any command-line arguments
    public static void main(String... args) {
        Arrays.sort(args);
        System.out.println(Arrays.toString(args));
        System.out.println(args[0]);  // runtime exception ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
    }
}
