package org.mcartagena.certification.collectionsandgenerics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestingList {
    public static void main(String[] args) {
        var pennies = new ArrayList<>();  // List of Objects
        pennies.add(1);
        pennies.add(2);
        pennies.add(Integer.valueOf(3));
        pennies.add(Integer.valueOf(4));
        pennies.remove(2);
        pennies.remove(Integer.valueOf(1));
        System.out.println(pennies);  // [2, 4]

        Set penniesSet = Set.copyOf(pennies);
        System.out.println(penniesSet);

        List<String> list = List.of(
                "Mary", "had", "a", "little", "lamb");
        Set<String> set = new HashSet<>(list);
        set.addAll(list);
        for (String sheep : set)  // ConcurrentModificationException
            if (sheep.length() > 1)
                set.remove(sheep);   // when trying to remove an element of the set throws an exception
        System.out.println(set);
    }
}
