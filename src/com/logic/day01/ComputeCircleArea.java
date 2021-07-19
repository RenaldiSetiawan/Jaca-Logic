package com.logic.day01;

public class ComputeCircleArea {
   public static void main(String[] args) {
    // Kasus hitung luas area lingkaran, dimana rumus luas lingkaran = radius^2* pi 
    // pi = 3.14159

    //1. declare variable radius & area
    double radius=10, area;
    // nilai sudah tidak bia diubak ketika menggunakan final
    final double pi = 3.14159;

    //2. hitung luas lingkaran dan simpan hasilnya di variable area
    area = radius * radius * pi;

    //3. display area
    System.out.println("Luas lingkarana = " + area);
    System.out.printf("Luas lingkaran = %.2f", area);
   }
}
