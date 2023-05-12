package org.mcartagena.certification.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkingWithAdvancedStreamPipelineConcepts {
    public static void main(String[] args) {
        var cats = new ArrayList<String>();
        cats.add("Annie");
        cats.add("Ripley");
        var stream = cats.stream();
        cats.add("KC");
        System.out.println(stream.count());  // 3 lazzy load

        // Chaining Optionals
        Optional<Integer> optional = Optional.of(1);
        if (optional.isPresent()) {
            var num = optional.get();
            var string = "" + num;
            if (string.length() == 3) // inner if
                System.out.println(string);
        }

        optional.map(n -> "" + n)            // part 1
                .filter(s -> s.length() == 3)     // part 2
                .ifPresent(System.out::println);  // part 3

        // using a spliterator
        var stream1 = List.of("bird-", "bunny-", "cat-", "dog-", "fish-", "lamb-",
                "mouse-");
        Spliterator<String> originalBagOfFood = stream1.spliterator();
        Spliterator<String> emmasBag = originalBagOfFood.trySplit();
        emmasBag.forEachRemaining(System.out::println);  // bird-bunny-cat-

        Spliterator<String> jillsBag = originalBagOfFood.trySplit();
        jillsBag.tryAdvance(System.out::println);        // dog-
        jillsBag.forEachRemaining(System.out::println);  // fish-

        originalBagOfFood.forEachRemaining(System.out::println); // lamb-mouse-

        // another example with stream
        var originalBag = Stream.iterate(1, n -> ++n)
                .spliterator();

        Spliterator<Integer> newBag = originalBag.trySplit();

        newBag.tryAdvance(System.out::println); // 1
        newBag.tryAdvance(System.out::println); // 2
        newBag.tryAdvance(System.out::println); // 3

        // Collecting results
        var ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println(result); // lions, tigers, bears

        var ohMy1 = Stream.of("lions", "tigers", "bears");
        Double result1 = ohMy1.collect(Collectors.averagingInt(String::length));
        System.out.println(result1); // 5.333333333333333

        var ohMy2 = Stream.of("lions", "tigers", "bears");
        TreeSet<String> result2 = ohMy2
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result2); // [tigers]

        // Collecting into Maps
        var ohMy3 = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = ohMy3.collect(
                Collectors.toMap(s -> s, String::length));
        System.out.println(map); // {lions=5, bears=5, tigers=6}

        var ohMy4 = Stream.of("lions", "tigers", "bears");
        // Map<Integer, String> map1 = ohMy4.collect(Collectors.toMap(
        //        String::length,
        //        k -> k)); // BAD Duplicate key 5 (attempted merging values lions and bears)

        var ohMy5 = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map2 = ohMy5.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + "," + s2));
        System.out.println(map2);            // {5=lions,bears, 6=tigers}
        System.out.println(map2.getClass()); // class java.util.HashMap

        var ohMy6 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, String> map3 = ohMy6.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + "," + s2,
                TreeMap::new));
        System.out.println(map3); //         // {5=lions,bears, 6=tigers}
        System.out.println(map3.getClass()); // class java.util.TreeMap

    }
}
