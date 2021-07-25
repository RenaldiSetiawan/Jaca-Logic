package com.logic.day02.String;

import java.util.Scanner;

public class MaxNumberWhileDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number, max;
        System.out.println("Enter integer [0-Exit] : ");
        number = scanner.nextInt();
        max = number;
        
        while (number != 0) {
            System.out.println("Enter integer [0-Exit] : ");
            number = scanner.nextInt();
            if (number > max) 
            max = number;
        }
        System.out.println("Angak max: "+ max);
        scanner.close();
    }
}
