package org.mcartagena.certification.streams;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class UsingCommonTerminalOperations {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = stream.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println);

        Optional<?> minEmpty = Stream.empty()
                .min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent());

        Stream<String> s1 = Stream.of("monkey", "gorilla", "bonobo");
        s1.findAny().ifPresent(System.out::println);  // monkey (usually)

        Stream<String> infinite = Stream.generate(() -> "chimp");
        infinite.findAny().ifPresent(System.out::println);

        var list = List.of("monkey", "2", "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(pred));  // true
        System.out.println(list.stream().allMatch(pred));  // false
        System.out.println(list.stream().noneMatch(pred));  // false

        Stream<String> infinite1 = Stream.generate(() -> "chimp");

        System.out.println(infinite1.anyMatch(pred));  // true

        Stream<String> s2 = Stream.of("monkey", "gorilla", "bonobo");
        s2.forEach(System.out::print);  // monkeygorillabonobo
        // s2.findFirst();  // IllegalStateException: stream has already been operated upon or closed

        // Reducing
        System.out.println("\nReducing");
        var array = new String[]{"w", "o", "l", "f"};
        var result = "";

        for (var str : array)
            result = result + str;

        System.out.println(result);

        Stream<String> stream1 = Stream.of("w", "o", "l", "f");
        // String word = stream.reduce("", (s3, c) -> s3 + c);
        String word = stream1.reduce("", String::concat);
        System.out.println(word);

        Stream<Integer> stream2 = Stream.of(1, 3, 5);
        int numberMagic = stream2.reduce(1, (a, b) -> a * b);
        System.out.println(numberMagic);

        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);

        empty.reduce(op).ifPresent(System.out::println);  // no output
        oneElement.reduce(op).ifPresent(System.out::println);  // 3
        threeElements.reduce(op).ifPresent(System.out::println);  // 90

        Stream<String> stream3 = Stream.of("w", "o", "l", "f!");
        int length = stream3.reduce(0, (i, s4) -> i + s4.length(), (a, b) -> a + b);
        System.out.println(length);  // 5

        // Collecting
        Stream<String> stream4 = Stream.of("w", "o", "l", "f");
        StringBuilder word1 = stream4.collect(StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append);
        System.out.println(word1);  // wolf

        Stream<String> stream5 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream5.collect(TreeSet::new,TreeSet::add,TreeSet::addAll);
        System.out.println(set);  // [f, l, o, w]

        Stream<String> stream6 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set1 = stream6.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set1);  // [f, l, o, w]

        Stream<String> stream7 = Stream.of("w", "o", "l", "f");
        Set<String> set2 = stream7.collect(Collectors.toSet());
        System.out.println(set2);  // [f, w, l, o]
    }
}
