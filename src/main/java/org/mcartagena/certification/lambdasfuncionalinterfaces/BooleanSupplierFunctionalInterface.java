package org.mcartagena.certification.lambdasfuncionalinterfaces;

import java.util.function.BooleanSupplier;

public class BooleanSupplierFunctionalInterface {
    public static void main(String[] args) {
        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random() > .5;

        double x = .5;
        BooleanSupplier b3 = () -> Math.random() > x;

        System.out.println(b1.getAsBoolean());  // true
        System.out.println(b2.getAsBoolean());
        System.out.println(b3.getAsBoolean());
    }
}
