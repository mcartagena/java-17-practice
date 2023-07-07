package org.mcartagena.certification.makingdecisions;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TestingInstaceofPattern {
    public static void main(String[] args) {

    }

    public void p(Object obj) {
        if (!(obj instanceof LocalDate date))
            return;
        else
            System.out.println(date);
    }

    public void m(Object obj) {
        if (obj instanceof LocalDate date)
            System.out.println(date);
        // else
        // System.out.println(date);  // date is out of scope
    }

    public void meow(Collection<String> kitties) {
        if (kitties instanceof List c) {
            System.out.println("L " + c.size());
        } else if (kitties instanceof Map c) {
            c = new TreeMap<>();                  // x1
            System.out.println("M " + c.size());
        } else {
            // System.out.println("E " + c.size());  // c is not the scope
        }
    }

    public void magic() {
        do {
            int trick = 0;
            LOOP:
            do {
                trick++;
            } while (trick < 2); //  2--); // operator -- can't applied in a value only in a variable
            // continue LOOP; // LOOP is out of the scope
        } while (1 > 2);
        // System.out.println(trick);  // trick is out of the scope
    }
}
