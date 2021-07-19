package com.logic.day01;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        //user input 3 bilangan integer dari scanner, lalu hitung nilai rata-ratanya
        Scanner scanner = new Scanner (System.in);
        System.out.println("Input 3 bilangan integer : ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        double average = (num1 + num2 + num3) / 3;
        System.out.printf("Result : %.2f", average);

        scanner.close();
    }
}
