package org.mcartagena.certification.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record Separations(String spaceSeparated, String commaSeparated) {}

public class GroupingPartitioningAndMapping {
    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length));
        System.out.println(map);

        var ohMy1 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map1 = ohMy1.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(map1);

        var ohMy2 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, Set<String>> treeMap = ohMy2.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
        System.out.println(treeMap);

        var ohMy3 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, List<String>> treeMap1 = ohMy3.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
        System.out.println(treeMap1);

        var ohMy4 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> partition = ohMy4.collect(Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(partition);

        var ohMy5 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> partition1 = ohMy5.collect(
                Collectors.partitioningBy(s -> s.length() <= 7));
        System.out.println(partition1);    // {false=[], true=[lions, tigers, bears]}

        var ohMy6 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, Set<String>> partition2 = ohMy6.collect(Collectors.partitioningBy(s -> s.length() <= 5, Collectors.toSet()));
        System.out.println(partition2);

        var ohMy7 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map3 = ohMy7.collect(Collectors.groupingBy(String::length,Collectors.counting()));
        System.out.println(map3);

        var ohMy8 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Optional<Character>> map4 = ohMy8.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(s -> s.charAt(0), Collectors.minBy((a,b) -> a - b))));
        System.out.println(map4);    // {5=Optional[b], 6=Optional[t]}

        // Teeing Collectors
        var list = List.of("x", "y", "z");
        Separations result = list.stream()
                .collect(Collectors.teeing(
                        Collectors.joining(" "),
                        Collectors.joining(","),
                        (s, c) -> new Separations(s, c)));
        System.out.println(result);

    }
}
