package org.mcartagena.certification.collectionsandgenerics;

import java.util.ArrayList;
import java.util.List;

public class CreatingUpperBoundedWildcards {
    public static void main(String[] args) {
        // ArrayList<Number> list = new ArrayList<Integer>();  // incompatible types: java.util.ArrayList<java.lang.Integer> cannot be converted to java.util.ArrayList<java.lang.Number>
        // List<? extends Number> list = new ArrayList<Integer>(); // OK
        // list.add(1);  // incompatible types: int cannot be converted to capture#1 of ? extends java.lang.Number

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        System.out.println(total(list));  // 3
    }
    public static long total(List<? extends Number> list){
        long count = 0;
        for (Number number: list)
            count += number.longValue();
        return count;
    }
}
