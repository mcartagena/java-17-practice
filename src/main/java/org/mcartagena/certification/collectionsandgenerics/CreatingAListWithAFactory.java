package org.mcartagena.certification.collectionsandgenerics;

import java.util.Arrays;
import java.util.List;

public class CreatingAListWithAFactory {
    public static void main(String[] args) {
        String[] array = new String[]{"a", "b", "c"};
        List<String> asList = Arrays.asList(array);  // [a, b, c]
        List<String> of = List.of(array);  // [a, b, c]
        List<String> copy = List.copyOf(asList); // [a, b, c]

        array[0] = "z";

        System.out.println(asList);  // [z, b, c]
        System.out.println(of);  // [a, b, c]
        System.out.println(copy);  // [a, b, c]

        asList.set(0, "x");
        System.out.println(Arrays.toString(array)); // [x, b, c]

        // copy.add("y");  // UnsupportedOperationException
        // asList.add("y");  // UnsupportedOperationException
    }
}
