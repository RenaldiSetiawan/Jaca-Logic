package com.logic.day03.Array;

import java.util.Scanner;

public class FillArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // random number
        for ( int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        
        // fill values scanner
        /* for (int i = 0; i < numbers.length; i++) {
            System.out.print(("Entry index[" + i + "]:"));
            numbers[i] = scanner.nextInt();
        } */

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}
