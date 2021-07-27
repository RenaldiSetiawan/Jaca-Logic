package com.logic.day04.Abstraction;

public abstract class Vehicle {
    private String type;
    private String bahanBakar;
    private int tahun;
    private double hargaBeli;
    private double tax;
     
    public Vehicle(String type, String bahanBakar, int tahun, double hargaBeli, double tax) {
        this.type = type;
        this.bahanBakar = bahanBakar;
        this.tahun = tahun;
        this.hargaBeli = hargaBeli;
        this.tax = tax;
    }

    
}
