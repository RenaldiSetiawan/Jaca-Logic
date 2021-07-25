package com.logic.day02.String;

public class ForLoopTriangle {
    public static void main(String[] args) {
       /*  //SEGETIGA PERSEGI
        int n = 5;
        // cetak vertical
        for (int i = 0; i < n; i++) {
            // cetal horizontal
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();

        } */

        //Segitga Siku Kiri
       /*  int n = 5;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        } */

        //Segitiga Siku kanan
          int n = 5;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

  
}
