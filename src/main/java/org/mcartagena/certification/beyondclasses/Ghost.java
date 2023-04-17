package org.mcartagena.certification.beyondclasses;

public class Ghost {
    public static void boo(){
        System.out.println("Not scared");
    }
    protected final class Spirit {
        public void boo(){
            System.out.println("Booo!!!");
        }
    }

    public static void main(String[] args) {
        var g = new Ghost().new Spirit();
        // new Ghost().boo();
        Ghost.boo();
    }
}
