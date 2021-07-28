package com.logic.day04.Abstraction;

public class AirCraft extends Vehicle {
    private String noRegister;

    public AirCraft(String type, String bahanBakar, int tahun, double hargaBeli, double tax) {
        super(type, bahanBakar, tahun, hargaBeli, tax);
        //TODO Auto-generated constructor stub
    }

    public AirCraft(String type, String bahanBakar, int tahun, double hargaBeli, double tax, String noRegister) {
        super(type, bahanBakar, tahun, hargaBeli, tax);
        this.noRegister = noRegister;
    }

    @Override
    public double taksiranPajak() {
        return super.pajakBM() + 100d;
    }

    @Override
    public String toString() {
        return super.toString() + "AirCraft [noRegister=" + noRegister + "]";
    }
    
    
}
