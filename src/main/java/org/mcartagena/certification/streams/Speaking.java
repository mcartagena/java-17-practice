package org.mcartagena.certification.streams;

import static java.util.stream.Collectors.*;

import java.util.stream.Stream;

public class Speaking {
    record Ballot(String name, int judgeNumber, int score) {
    }

    public static void main(String[] args) {
        Stream<Ballot> ballots = Stream.of(
                new Ballot("Mario", 1, 10),
                new Ballot("Christina", 1, 8),
                new Ballot("Mario", 2, 9),
                new Ballot("Christina", 2, 8)
        );

        var scores = ballots.collect(
                groupingBy(Ballot::name,
                        summingInt(Ballot::score)));
        System.out.println(scores.get("Mario"));  // 19
    }
}
