package org.mcartagena.certification.beyondclasses;

interface Aquatic{
    int getNumOfGills(int p);
}
public class ClowFish implements Aquatic{
    String getNumOfGills(){
        return "14";
    }
    public int getNumOfGills(int input){  // attempting to assign weaker access privileges without public access modifier
        return 15;
    }

    public static void main(String[] args) {
        System.out.println(new ClowFish().getNumOfGills(-1));
    }
}
