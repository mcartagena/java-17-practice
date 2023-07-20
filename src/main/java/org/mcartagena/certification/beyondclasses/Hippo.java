package org.mcartagena.certification.beyondclasses;

public class Hippo {
    private static void hippo(short num1, short num2) {
        System.out.println("shorts");
    }

    private static void hippo(int... nums) {
        System.out.println("varargs");
    }

    private static void hippo(Integer num1, Integer num2) {
        System.out.println("Integers");
    }

    private static void hippo(long num1, long num2) {
        System.out.println("longs");
    }

    public static void main(String... args) {
        hippo(1, 5);  // longs
    }
}
