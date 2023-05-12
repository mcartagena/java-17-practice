package org.mcartagena.certification.streams;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreatingPrimitiveStreams {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.mapToInt(x -> x).sum());

        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();

        System.out.println(avg.getAsDouble());

        DoubleStream empty = DoubleStream.empty();

        DoubleStream oneValue = DoubleStream.of(3.14);
        oneValue.forEach(System.out::println);

        var random = DoubleStream.generate(Math::random);
        var fractions = DoubleStream.iterate(.5, d -> d / 2);
        random.limit(3).forEach(System.out::println);
        fractions.limit(3).forEach(System.out::println);

        IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);
        count.forEach(System.out::print); // 12345

        IntStream range = IntStream.range(1, 6);
        range.forEach(System.out::print); // 12345

        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::print); // 12345

        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStreamOfLength = objStream.mapToInt(s -> s.length());

        // Using flatMap

        var integerList = new ArrayList<Integer>();
        IntStream ints = integerList.stream()
                .flatMapToInt(x -> IntStream.of(x));

        DoubleStream doubles = integerList.stream()
                .flatMapToDouble(x -> DoubleStream.of(x));

        LongStream longs = integerList.stream()
                .flatMapToLong(x -> LongStream.of(x));


    }
}
