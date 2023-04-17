package org.mcartagena.certification.beyondclasses;

public class Weather {
    enum Seasons {
        WINTER, SPRING, SUMMER, FALL
    }

    public static void main(String[] args) {
        Seasons v = Seasons.FALL;
        switch (v){
            case SPRING -> System.out.println("s");
            case WINTER -> System.out.println("w");
            case SUMMER -> System.out.println("m");
            default -> System.out.println("missing data");
        }
    }
}
