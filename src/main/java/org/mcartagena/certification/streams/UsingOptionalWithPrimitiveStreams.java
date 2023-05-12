package org.mcartagena.certification.streams;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class UsingOptionalWithPrimitiveStreams {
    public static void main(String[] args) {
        var stream = IntStream.rangeClosed(1,10);
        OptionalDouble optional = stream.average();

        optional.ifPresent(System.out::println); // 5.5
        System.out.println(optional.getAsDouble()); // 5.5
        System.out.println(optional.orElseGet(() -> Double.NaN)); // 5.5

        LongStream longs = LongStream.of(5, 10);
        long sum = longs.sum();
        System.out.println(sum);     // 15

        DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
        // OptionalDouble min = doubles.min(); // runs infinitely
    }
}
