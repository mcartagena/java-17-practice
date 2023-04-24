package org.mcartagena.certification.lambdasfuncionalinterfaces;

interface Climb {
    boolean isTooHigh(int height, int limit);
}

public class Climber {
    public static void check(Climb climb, int height) {
        if (climb.isTooHigh(height, 10))
            System.out.println("Too high");
        else
            System.out.println("ok");
    }

    public static void main(String[] args) {
        check((h, m) -> h > m, 5);
    }
}
