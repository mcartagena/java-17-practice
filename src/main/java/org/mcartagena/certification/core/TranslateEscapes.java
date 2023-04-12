package org.mcartagena.certification.core;

public class TranslateEscapes {
    public static void main(String[] args) {
        var str = "1\\t2";
        System.out.println(str);  // prints 1\t2
        System.out.println(str.translateEscapes()); // prints 1	2

        // Checking for Empty or Blank Strings
        System.out.println(" ".isEmpty());  //false
        System.out.println("".isEmpty());  // true
        System.out.println(" ".isBlank());  // true
        System.out.println("".isBlank());  // true

    }
}
