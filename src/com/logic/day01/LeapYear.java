package com.logic.day01;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        /*
         * masukan bilangan integer tahun, lalu cek apakah tahun kabisat atau bukan.
         * Tahun Kabisat adalah tahun yang jika dibagi 400 sisanya 0 atau tahun yang
         * dibagi 4 sisanya 0 dan jika dibagi 100 sisanya != 0
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = scanner.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.println("Tahun" + year + "adalah kabisat");
        else
            System.out.println("Tahun" + year + "adalah bukan kabisat");

        scanner.close();
    }
}
