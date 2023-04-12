package org.mcartagena.certification.makingdecisions;

public class PatternMatching {
    public static void compareIntegers(Number number){
        if(number instanceof Integer data && data.compareTo(5)>0){
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        compareIntegers(8);
        compareIntegers(3);
        compareIntegers(4L);
    }
}
