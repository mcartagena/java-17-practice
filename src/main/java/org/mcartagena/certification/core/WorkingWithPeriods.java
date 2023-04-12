package org.mcartagena.certification.core;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class WorkingWithPeriods {
    public static void main(String[] args) {
        var start = LocalDate.of(2022, Month.JANUARY, 1);
        var end = LocalDate.of(2022, Month.MARCH, 30);

        performAnimalEnrichment(start, end);

        var period = Period.ofMonths(1);  // create a period

        performAnimalEnrichmentWithPeriod(start, end, period);
    }

    private static void performAnimalEnrichmentWithPeriod(LocalDate start, LocalDate end, Period period) {
        var upTo = start;

        while (upTo.isBefore(end)) {  // check if still before end
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period);   // adds the period
        }
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        var upTo = start;

        while (upTo.isBefore(end)) {  // check if still before end

            System.out.println("give new toy: " + upTo);

            upTo = upTo.plusMonths(1);  // add a month
        }
    }
}
