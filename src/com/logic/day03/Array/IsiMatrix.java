package com.logic.day03.Array;

public class IsiMatrix {
    public static void main(String[] args) {
        //2. declare variable matrix
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 1;
            }
        }
        //3. call method display array
        displayArray(matrix);
    }
        //1. display array matrix
        static void displayArray (int[][] matrix ) {
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    System.out.printf("%5s", matrix[row][col]);
                }
                System.out.println();
            }
        }
}

