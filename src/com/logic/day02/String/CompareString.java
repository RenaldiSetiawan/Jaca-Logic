package com.logic.day02.String;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompt the user to enter tow cities
        System.out.println("Enter the first City : ");
        String city1 = scanner.nextLine();
        System.out.println("Enter the second City : ");
        String city2 = scanner.nextLine();

        if (city1.compareTo(city2) < 0)
            System.out.println("the city in alphabetical order are" + city1 + " " + city2);
        else
            System.out.println("the city in alphabetical order are" + city2 + " " + city1);

        String s1 = "Welcome to Java";
        String s2 = "Welcome to Java";
        String s3 = "Welcome to C++";

        System.out.println(s1.equals(s2));// true
        System.out.println(s2.equals(s3)); // false

        scanner.close();
    }
}
