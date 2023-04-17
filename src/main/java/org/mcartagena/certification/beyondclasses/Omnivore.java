package org.mcartagena.certification.beyondclasses;

public interface Omnivore {
    int amount = 10;
    static boolean gather = true;
    static void eatGrass(){}
    // int findMore() { return 2;}  // DOES NOT COMPILE abstract methods cannot have body
    default float rest() { return 2; }
    // protected int chew() { return 13; } // DOES NOT COMPILE Modifier 'protected' not allowed here
    private static void eatLeaves(){}
}
