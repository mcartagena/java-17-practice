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
    }
}
