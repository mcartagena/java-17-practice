package org.mcartagena.certification.lambdasfuncionalinterfaces;

interface Converter {
    long round(double num);
}

public class StaticMethodReference {
    public static void main(String[] args) {
        Converter methodRef = Math::round;
        Converter lambda = x -> Math.round(x);

        System.out.println(methodRef.round(100.1));
    }
}
