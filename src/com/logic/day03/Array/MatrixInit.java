package com.logic.day03.Array;

public class MatrixInit {
    public static void main(String[] args) {
        //deklarasi matrix java
        int[][] list = new int[3][2];

        //initialisasi array
        list[0][0] = 8;
        list[0][1] = 4;
        list[1][0] = 3;
        list[1][1] = 12;
        list[2][0] = 7;
        list[2][1] = 10;

        //display array
        for (int row = 0; row < list.length; row++) {
            for (int col = 0; col < list[row].length; col++) {
                System.out.print(list [row][col]+ " ");
            }
            System.out.println( );
        }
    }
}
