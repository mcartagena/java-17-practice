package org.mcartagena.certification.streams;

import java.util.List;
import java.util.stream.Stream;

public class CreatingStreamSources {
    public static void main(String[] args) {
        // Creating Finite Streams
        Stream<String> empty = Stream.empty();
        System.out.println(empty.count());  // count = 0

        Stream<Integer> singleElement = Stream.of(1);
        System.out.println(singleElement.count());  // count = 1

        Stream<Integer> fromArray = Stream.of(1, 2, 3);
        System.out.println(fromArray.count());  // count = 3

        var list = List.of("a", "b", "c");
        Stream<String> fromList = list.stream();
        System.out.println(fromList.count()); // count = 3

        Stream<String> fromListParallel = list.parallelStream();
        System.out.println(fromListParallel.count());  // count = 3

        // Creating infinite Streams
        Stream<Double> randoms = Stream.generate(Math::random);
        randoms.limit(5).forEach(System.out::println);

        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        oddNumbers.limit(5).forEach(System.out::println);

        Stream<Integer> oddNumbersUnder10 = Stream.iterate(1, n -> n < 10, n -> n + 2);
        oddNumbersUnder10.forEach(System.out::println);
    }
}
