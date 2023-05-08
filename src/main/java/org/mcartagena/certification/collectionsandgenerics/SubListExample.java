package org.mcartagena.certification.collectionsandgenerics;

import java.util.ArrayList;
import java.util.List;

/*
Java Program to demostrate sublist() method for string value
 */
public class SubListExample {
    public static void main(String[] args) {
        try{
            // Creating object of ArrayList<Integer>
            List<String> arrList = new ArrayList<>();

            // Populating arrList
            arrList.add("A");
            arrList.add("B");
            arrList.add("C");
            arrList.add("D");
            arrList.add("E");

            // print arrlist
            System.out.println("Original arrList: " + arrList);

            // getting the sublist
            // using subList() method
            List<String> arrList2 = arrList.subList(2, 4);

            // print the sublist
            System.out.println("Sublist of arrList: " + arrList2);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Exception thrown: " + e);
        } catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }
    }
}
