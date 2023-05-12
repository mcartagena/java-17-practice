package org.mcartagena.certification.streams;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class SummarizingStatistics {
    public static void main(String[] args) {
        IntStream intStream = IntStream.iterate(1, n -> n <= 10, n -> n + 2);
        IntSummaryStatistics stats = intStream.summaryStatistics();

        System.out.println(stats.getCount());
        System.out.println(stats.getAverage());
        System.out.println(stats.getSum());
        System.out.println(stats.getMin());
        System.out.println(stats.getMax());

    }
}
