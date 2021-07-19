package com.logic.day01;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        /*
         * Tentukan grade score mahasiswa, dengan kondisi Score >= 90 Output = A, Score
         * >= 80 Output = B, Score >= 70 Output = C, Score >= 60 Output = D, Score < 60
         * Output = F
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Score : ");
        int score = scanner.nextInt();

        if (score >= 90)
            System.out.println("A");
        else if (score >= 80)
            System.out.println("B");
        else if (score >= 70)
            System.out.println("C");
        else if (score >= 60)
            System.out.println("D");
        else
            System.out.println("F");

        scanner.close();
    }
}
