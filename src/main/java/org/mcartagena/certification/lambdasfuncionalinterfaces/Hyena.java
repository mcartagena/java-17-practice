package org.mcartagena.certification.lambdasfuncionalinterfaces;

import java.util.List;
import java.util.function.Predicate;

public class Hyena {
    private int age = 1;

    public static void main(String[] args) {
        var p = new Hyena();
        double height = 10;
        int age = 1;

        testLaugh(p, h -> h.age < 5);
        age = 2;
    }

    static void testLaugh(Hyena panda, Predicate<Hyena> joke) {
        var r = joke.test(panda) ? "hahaha" : "silence";
        System.out.print(r);
    }

    public void remove(List<Character> chars) {
        char end = 'r';

        chars = null;

        Predicate<Character> predicate = c -> {
            char start = 'a';
            return start <= c && c <= end;
        };
    }
}
