package com.logic.day02.String;

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        // 1. deklarasi variable
        int countWord = 0;
        String kata;
        System.out.println("Enter String: ");
        kata = scanner.nextLine();
        // 2. Loop sepanjang kalimat Aku suka Java
        for (int i = 0; i < kata.length(); i++) {
            // 3. check spasi antara kata gunakan object Character,isSpaceChar
            if (Character.isSpaceChar(kata.charAt(i)) || i==kata.length()-1 ) {
                countWord++;
            }
        }
        System.out.println("Total kata : " + countWord);
        scanner.close();
    }
   
}
