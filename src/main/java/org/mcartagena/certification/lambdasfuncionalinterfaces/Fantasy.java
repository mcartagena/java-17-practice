package org.mcartagena.certification.lambdasfuncionalinterfaces;

import java.util.function.Function;
import java.util.function.Predicate;

public class Fantasy {
    public static void scary(String animal) {
        // var dino = s -> "dino".equals(animal);  // DOES NOT COMPILE error: cannot infer type for local variable dino
        Predicate<String> dino = s -> "dino".equals(animal);
        // var dragon = s -> "dragon".equals(animal);  // DOES NOT COMPILE error: cannot infer type for local variable dino
        Predicate<String> dragon = s -> "dragon".equals(animal);
        var combined = dino.or(dragon);

        System.out.println(combined.test(animal));
    }

    public static void main(String[] args) {
        scary("dino");
        scary("dragon");
        scary("unicorn");

        Function<Integer, Integer> s = a -> a + 4;
        Function<Integer, Integer> t = a -> a + 3;
        Function<Integer, Integer> c = s.compose(t);

        System.out.println(c.apply(1));
    }
}
