package org.mcartagena.certification.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PuttingTogetherThePipeline {
    public static void main(String[] args) {

        // old school don't do it
        var list = List.of("Toby", "Anna", "Leroy", "Alex");
        List<String> filtered = new ArrayList<>();
        for(String name: list)
            if(name.length() == 4)
                filtered.add(name);

        Collections.sort(filtered);
        var iter = filtered.iterator();
        if(iter.hasNext())
            System.out.println(iter.next());
        if(iter.hasNext())
            System.out.println(iter.next());

        // new school do it
        list.stream()
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);

        // few more examples
        /*
        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .sorted()   // INFINITE
                .limit(2)
                .forEach(System.out::println);
         */

        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);

        /*
        Stream.generate(() -> "Olaf Lazisson")
                .filter(n -> n.length() == 4)  // INFINITE
                .limit(2)
                .sorted()
                .forEach(System.out::println);
         */

        long count = Stream.of("goldfish", "finch")
                .filter(s -> s.length()>5)
                .collect(Collectors.toList())
                .stream().count();

        System.out.println(count);  // 1

    }
}
