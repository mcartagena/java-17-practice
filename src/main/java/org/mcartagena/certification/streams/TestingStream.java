package org.mcartagena.certification.streams;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.*;

public class TestingStream {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.length() > 3;
        var stream = Stream.iterate("-", s -> !s.isEmpty(), (s) -> s + s);

        var b1 = stream.peek(System.out::println).noneMatch(predicate);

        // var b2 = stream.anyMatch(predicate); // IllegalStateException: stream has already been operated upon or closed

        System.out.println(b1);
        // System.out.println(b2);  // true

        double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));

        System.out.println(result);

        var stream1 = LongStream.of(1, 2, 3);
        var opt = stream1.map(n -> n * 10)
                .filter(n -> n < 5)
                .findFirst();

        if (opt.isPresent()) {
            System.out.println("optIsPresent: " + opt.getAsLong());
        }
        opt.ifPresent(System.out::println);

        Stream.generate(() -> "1")
                // .filter(x -> x.length() > 1)
                .limit(10)
                //.peek(System.out::println)
                .forEach(System.out::println);

        System.out.println(
                Stream.iterate(1, x -> ++x)
                        .limit(5)
                        .map(x -> "" + x)
                        .collect(Collectors.joining())
        );

        Set<String> birds = Set.of("oriole", "flamingo");
        Stream.concat(birds.stream(), birds.stream())
                .sorted()  // Line X
                .distinct()
                .findAny()
                .ifPresent(System.out::println);

        List<Integer> x1 = List.of(1, 2, 3);
        List<Integer> x2 = List.of(4, 5, 6);
        List<Integer> x3 = List.of();

        Stream.of(x1, x2, x3)
                .flatMap(x -> x.stream())
                .map(x -> x + 1)
                .forEach(System.out::println);

        Stream<Integer> s = Stream.of(1);
        // IntStream is = s.boxed();  // boxed exists only in primitive stream IntStream LongStream and DoubleStream
        // IntStream is = s.mapToInt(x -> x);
        DoubleStream ds = s.mapToDouble(x -> x);
        // Stream<Integer> s2 = ds.mapToInt(x -> (int) x); // incompatible types: IntStream cannot be converted to Stream<Integer>

        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();

        var result1 = Stream.generate(() -> "")
                .limit(10)
                .filter(notEmpty)
                .collect(Collectors.groupingBy(k -> k))
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                //.collect(Collectors.partitioningBy(notEmpty));
                .collect(Collectors.groupingBy(n -> n));

        System.out.println(result1);

        var s1 = DoubleStream.of(1.2, 2.4);
        s1.peek(System.out::println)
                .filter(x -> x > 2)
                .count();

        var spliterator = Stream.generate(() -> "x")
                .spliterator();

        spliterator.tryAdvance(System.out::println);

        var split = spliterator.trySplit();
        split.tryAdvance(System.out::println);

        var list = List.of('c', 'b', 'a');

        list.stream()
                .sorted()
                .findAny()
                .ifPresent(System.out::println);

        System.out.println(list.stream().sorted().findFirst());  // Optional[a], Optional[b], or Optional[c]

        var s2 = Stream.of("speak", "bark", "meow", "growl");
        BinaryOperator<String> merge = (a, b) -> a;
        var map = s2.collect(Collectors.toMap(
                String::length, k -> k, merge));
        System.out.println(map.size() + " " + map.get(4));  // 2 bark

        Set<String> set = new HashSet<>();
        set.add("tire-");
         List<String> list1 = new LinkedList<>();
         Deque<String> queue = new ArrayDeque<>();
         queue.push("wheel-");
         Stream.of(set.stream(), list1.stream(), queue.stream()) // does not compile if set list and queue without stream()
           .flatMap(x -> x)
           .forEach(System.out::print);  // tire-wheel-

    }
}
