package com.logic.day01;

import java.util.Scanner;

public class ElapsideTime {
    public static void main(String[] args) {
    /* Konversi jumlah bilangan integer ke hari, jam, menit, detik
       Dimana input integer harus lebih dari 1.000.000
       Contoh : input 1.000.000, output => 11 hari 13 jam 46 menit and 40 detik
       Tips : use / (pembagi) dan modulus % (sisa hasil bagi) */

       Scanner scanner = new Scanner (System.in);
       //1. deklarasi variable yang relevan
       int number, sisa;
       int hari, jam, menit, detik;

        //2. simpan inputan detik divariable number
        System.out.println("Enter bilangan integer : ");
        number = scanner.nextInt();

        //3. hitung jumlah hari , 1hari = 24 jam, 1jam=60 mnt, 1mnt=60detik, 1hari= 24 * 3600=86.400s
        // simpan sisa hasil bagi divariable  sisa
        hari = number / 86400;
        sisa = number % 86400;

        //4. hitung jumlah jam, dihitung dari sisa hasil bagi step 3 dibagi 3600
        jam = sisa / 3600;
        sisa = sisa % 600;

        //5. hitung jumlah menit, dihitung dari sisa hasil bagi step 4 dibagi 60
        menit = sisa / 60;
        sisa = sisa % 60;

        //6. hitung jumlah detik, dihitung dari sisa hail bagi step 5
        detik = sisa % 60;
        //7. display out put
        System.out.println(hari + "hari" + jam + "jam" + menit + "menit dan " + detik + "detik");
        //8. close scanner
        scanner.close();
    }
}
