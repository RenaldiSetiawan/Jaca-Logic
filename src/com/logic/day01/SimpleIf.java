package com.logic.day01;

import java.util.Scanner;

public class SimpleIf {
    public static void main(String[] args) {
        // tentukan apakah inputan bil genap atau bil ganjil

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter bilangan integer : ");
        int number = scanner.nextInt();

        if (number % 2 == 0)
            System.out.println("Bilangan Genap");
        else
            System.out.println("Bilagan Ganjil");

        scanner.close();
    }
}
