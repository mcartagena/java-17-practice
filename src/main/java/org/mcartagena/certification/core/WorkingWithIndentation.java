package org.mcartagena.certification.core;

public class WorkingWithIndentation {
    public static void main(String[] args) {
        var block = """
                a
                 b
                c""";

        var concat = " a\n"
                + "  b\n"
                + " c";

        System.out.println("***");
        System.out.println(block);
        System.out.println("***");
        System.out.println(block.length());
        // prints 6

        System.out.println(concat.length());
        // prints 9

        System.out.println(block.indent(1).length());
        // prints 10
        // we ask Java to add a single blank space to each of the three lines in block.  However, the output
        // says we added 4 characters rather than 3 since the length went from 6 to 10.  This mysterious additional
        // character is thanks to the line termination normalization.  Since the text block doesn't have a line
        // break at the end, indent() adds one!

        System.out.println(concat.indent(-1).length());
        // prints 7
        // We remove one whitespace character from each of the three lines of concat.  The gives a length of seven.
        // We started with nine, got rid of three characters, and added a trailing normalized new line

        System.out.println(concat.indent(-4).length());
        // prints 6
        // We ask java to remove four whitespace characters from the same three lines.  Since there are not four
        // whitespace characters, Java does its best.  The single space is removed before a and c.  Both spaces
        // are removed before b.  The length of six should make sense here; we removed one more character here than
        // on previous sentence.

        System.out.println(concat.stripIndent().length());
        // prints 6
        // we use the stripIndent() method.  All of the lines have al least one whitespace character.  Since they do
        // not all have two whitespace characters, the method only gets rid of one character per line.  Since no new line
        // is added by stripIndent(), the length is six, which is three less than the original nine.
    }
}
