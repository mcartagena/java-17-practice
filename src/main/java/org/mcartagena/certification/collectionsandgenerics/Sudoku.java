package org.mcartagena.certification.collectionsandgenerics;

public class Sudoku {
    static int[][] game = new int[6][6];

    public static void main(String[] args) {
        game[3][3] = 6;
        Object[] obj = game;
        // obj[3] = "X";  // runtime exception ArrayStoreException: java.lang.String
        System.out.println(game[3][3]);

        game[3][3] = 6;
        Object[] obj1 = game;
        // game[3][3] = "X";  // does not compile due that assigning a string to an int
        System.out.println(game[3][3]);
    }
}
