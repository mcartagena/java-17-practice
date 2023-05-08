package org.mcartagena.certification.collectionsandgenerics;

import java.util.ArrayList;
import java.util.List;

public class CreatingUnbondedWildcards {
    // public static void printList(List<Object> list){
    public static void printList(List<?> list){
        for(Object x: list)
            System.out.println(x);
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("java");
        printList(words);  //  incompatible types: java.util.List<java.lang.String> cannot be converted to java.util.List<java.lang.Object>
    }
}
