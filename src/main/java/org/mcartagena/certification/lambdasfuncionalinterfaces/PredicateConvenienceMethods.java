package org.mcartagena.certification.lambdasfuncionalinterfaces;

import java.util.function.Predicate;

public class PredicateConvenienceMethods {
    public static void main(String[] args) {
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        Predicate<String> browEggs = egg.and(brown);
        Predicate<String> otherEggs = egg.and(brown.negate());

        String phrase = "there are brown eggs";

        System.out.println(phrase);
        System.out.println("Egg: " + egg.test(phrase));
        System.out.println("Brown: " + brown.test(phrase));
        System.out.println("Brown eggs: " + browEggs.test(phrase));
        System.out.println("Other eggs: " + otherEggs.test(phrase));
    }
}
