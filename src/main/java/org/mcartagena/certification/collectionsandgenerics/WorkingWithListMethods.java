package org.mcartagena.certification.collectionsandgenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class WorkingWithListMethods {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("SD");
        list.add(0, "NY");

        System.out.println(list);  // [NY, SD]

        list.set(1, "FL");
        System.out.println(list);  // [NY, FL]
        System.out.println(list.get(0));  // NY

        list.remove("NY");
        System.out.println(list);   // [FL]

        list.remove(0);
        System.out.println(list);   // []

        // list.set(0,"?");  // IndexOutOfBoundsException: Index 0 out of bounds for length 0

        var numbers = Arrays.asList(1, 2, 3);
        numbers.replaceAll(x -> x * 2);
        System.out.println(numbers);  // [2, 4, 6]

        var newList = new LinkedList<Integer>();
        newList.add(3);
        newList.add(2);
        newList.add(1);

        newList.remove(2);
        System.out.println(newList); // [3, 2]
        newList.remove(Integer.valueOf(2));
        System.out.println(newList); // [3]
    }
}
