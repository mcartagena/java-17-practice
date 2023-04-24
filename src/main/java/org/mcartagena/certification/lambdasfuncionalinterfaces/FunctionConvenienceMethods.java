package org.mcartagena.certification.lambdasfuncionalinterfaces;

import java.util.function.Function;

public class FunctionConvenienceMethods {
    public static void main(String[] args) {
        Function<Integer, Integer> before = x -> x + 1;
        Function<Integer, Integer> after = x -> x * 2;

        Function<Integer, Integer> combined = after.compose(before);

        System.out.println(combined.apply(3));
    }
}
