package org.mcartagena.certification.classdesign;

class Speedster {
    int numSpots;
}

public class Cheetah extends Speedster{
    int numSpots;

    public Cheetah(int numSpots){
        super.numSpots = numSpots;
    }

    public static void main(String[] args) {
        Speedster s = new Cheetah(50);
        System.out.println(s.numSpots);
    }
}
