package com.logic.day02.String;

import java.util.Scanner;

/* buat program untuk menebak angka dalam range 0-20
gunakan while-do, looping akan berhenti sampai user
menginput angka yang sama dengan hasil random. */
public class GuessNumberWhiledo {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 21);

        Scanner scanner = new Scanner (System.in);
        System.out.println("Guess a magic between 0 and 20");

        int guess = -1;

        while (guess != number) {
            System.out.print("Enter your guess : ");
            guess = scanner.nextInt();

            //cek kondisi
            if (guess == number)
            System.out.println("Your right, your guess number is" + guess);
            else if ( guess > number )
            System.out.println("Your guess is to hight");
            else
            System.out.println("Your guess is to low");
        }

        scanner.close();
    }
}
