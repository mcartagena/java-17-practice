package org.mcartagena.certification.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class UsingCommonIntermediateOperations {
    public static void main(String[] args) {
        // filtering
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x-> x.startsWith("m"))
                .forEach(System.out::println);  // monkey

        // removing duplicates
        Stream<String> s1 = Stream.of("duck","duck","duck","goose");
        s1.distinct()
                .forEach(System.out::print);   // duckgoose

        // restricting by position
        Stream<Integer> s2 = Stream.iterate(1, n -> n+1);
        s2.skip(5)
                .limit(2)
                .forEach(System.out::print);   // 67

        // Mapping
        Stream<String> s3 = Stream.of("monkey", "gorilla", "bonobo");
        s3.map(String::length)
                .forEach(System.out::print);  // 676

        // flatMap
        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");

        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.flatMap(m -> m.stream())
                .forEach(System.out::println);

        // concatenating Streams
        var oneStream = Stream.of("Bonobo");
        var twoStream = Stream.of("Mama Gorilla", "Baby Gorilla");

        Stream.concat(oneStream, twoStream)
                .forEach(System.out::println);

        // sorting
        Stream<String> streamSort = Stream.of("brown-","bear-");
        streamSort.sorted()
                .forEach(System.out::print);  // bear-brown-

        Stream<String> streamSortReverse = Stream.of("brown bear-","grizzly-");
        streamSortReverse.sorted(Comparator.reverseOrder())
                .forEach(System.out::print);   // grizzly-brown bear-

        // Taking a Peek
        var streamPeek = Stream.of("black bear", "brown bear", "grizzly");
        long count = streamPeek.filter(str -> str.startsWith("g"))
                .peek(System.out::print)  // grizzly
                .count();
        System.out.println(count);  // 1

    }
}
