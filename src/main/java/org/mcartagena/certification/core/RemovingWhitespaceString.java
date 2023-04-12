package org.mcartagena.certification.core;

public class RemovingWhitespaceString {
    public static void main(String[] args) {
        // We will work with string methods to remove whitespace

        System.out.println("abc".strip());
        // prints the original string because there are not whitespace characters at the beginning or end.

        System.out.println("New Line ...");

        System.out.println("\t   a b c\n".strip());
        // gets rid of the leading tab, subsequent spaces, and the trailing newline.  It leaves the spaces
        // that are in the middle of the string

        System.out.println("New Line ...");

        String text = " abc\t ";
        System.out.println(text.trim().length());
        System.out.println(text.strip().length());
        // print the number of characters remaining.  You can see that trim() and strip() leave the same
        // three characters "abc" because the remove both the leading and trailing whitespace.

        System.out.println(text.stripLeading().length());
        // The stripLeading() method only removes the one whitespace character at the beginning of the string.
        // It leaves the tab and space at the end.
        System.out.println(text.stripTrailing().length());
        // The stripTrailing() method removes these two characters at the end but leaves the character at the
        // beginning of the string

    }
}
