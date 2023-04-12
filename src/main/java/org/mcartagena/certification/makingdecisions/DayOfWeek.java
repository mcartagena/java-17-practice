package org.mcartagena.certification.makingdecisions;

enum Season {WINTER, SPRING, SUMMER, FALL}

public class DayOfWeek {
    public static void printDayOfWeek(int day) {
        var result = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Value";
        };
        System.out.println(result);
    }

    public static void printSeason(int month) {
        switch (month) {
            case 1, 2, 3 -> System.out.println("Winter");
            case 4, 5, 6 -> System.out.println("Spring");
            case 7, 8, 9 -> System.out.println("Summer");
            case 10, 11, 12 -> System.out.println("Fall");
        }
        ;
    }
    public static String getWeather(Season value){
        return switch (value){
            case WINTER -> "Cold";
            case SPRING -> "Rainy";
            case SUMMER -> "Hot";
            case FALL -> "Warm";
        };
    }

    public static void main(String[] args) {
        System.out.println("Days of the week");
        printDayOfWeek(3);
        printDayOfWeek(7);
        printDayOfWeek(0);
        System.out.println("\nSeasons");
        printSeason(2);
        System.out.println(getWeather(Season.WINTER));
    }
}
