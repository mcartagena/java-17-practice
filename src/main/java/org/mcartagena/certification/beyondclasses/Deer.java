package org.mcartagena.certification.beyondclasses;

public class Deer {
    enum Food { APPLES, BERRIES, GRASS }
    protected class Diet {
        private Food getFavorite(){
            return Food.BERRIES;
        }
    }

    public static void main(String[] args) {
        System.out.println(
                switch (new Deer().new Diet().getFavorite()){
                    case APPLES -> "a";
                    case BERRIES -> "b";
                    default -> "c";
                }
        );
    }
}
