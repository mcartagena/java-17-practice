package org.mcartagena.certification.collectionsandgenerics;

import java.util.Arrays;

public class TestingArrays {
    public static void main(String[] args) {
        new TestingArrays().greek();

        char[][] ticTacToe = new char[3][3];
        ticTacToe[0][0] = 'X';
        ticTacToe[1][1] = 'X';
        ticTacToe[2][2] = 'X';
        System.out.println(ticTacToe.length + " in a row!");

        // ticTacToe[1][3] = 'X';  // ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        ticTacToe[2][2] = 'X';
        // ticTacToe[3][1] = 'X';   // ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        System.out.println(ticTacToe.length + " in a row!");

        String[] nums = new String[] { "1", "9", "10" };
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));  // [1, 10, 9]
    }

    public void greek() {
        // [][]String alpha; Bad declaration
        // []String beta;  Bad declaration
        String[][] gamma;
        String[] delta[];
        String epsilon[][];
        // var[][] zeta;  Bad declaration
    }

}
