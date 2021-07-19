package com.logic.day01;

import java.util.Scanner;

public class ComputeCircleAreaScan {
 public static void main(String[] args) {
     
    final double pi = 3.14159;

    //1. declare scanner object
    Scanner scanner = new Scanner(System.in);

    //define user input
    System.out.print("Enter radius : ");
    double radius = scanner.nextDouble();

    //hitung luas lingkaran
    double area = radius * radius * pi ;

    //display luas lingkaran
    System.out.printf("Luas lingkaran dengan radius %.0f= %.2f", radius, area);

    scanner.close();
 }   
}
