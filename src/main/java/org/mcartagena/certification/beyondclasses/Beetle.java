package org.mcartagena.certification.beyondclasses;

interface HasExoskeleton {
    double size = 2.0f;
    abstract int getNumberOfSections();
}
abstract class Insect implements HasExoskeleton{
    abstract int getNumberOfLegs();
}
public class Beetle extends Insect {
    int getNumberOfLegs(){
        return 6;
    }
    int getNumberOfSections(int count){  // this method does not implement HasExoskeleton abstract method
        return 1;
    }

    @Override
    public int getNumberOfSections() {
        return 0;
    }
}
