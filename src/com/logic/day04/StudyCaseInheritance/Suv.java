package com.logic.day04.StudyCaseInheritance;

public class Suv extends Car {
    private double sewa;
    private double biayaSupir;

    public Suv(String noPolisi, int tahun) {
        super(noPolisi, tahun, "SUV");
       
    }

    public Suv(String noPolisi, int tahun, double sewa, double biayaSupir) {
        super(noPolisi, tahun, "SUV");
        this.sewa = sewa;
        this.biayaSupir = biayaSupir;
        super.setTotalPendapatan(this.sewa+this.biayaSupir);
    }

    public double getSewa() {
        return sewa;
    }

    public void setSewa(double sewa) {
        this.sewa = sewa;
    }

    public double getBiayaSuper() {
        return biayaSupir;
    }

    public void setBiayaSuper(double biayaSupir) {
        this.biayaSupir = biayaSupir;
    }

    @Override
    public String toString() {
        return "Suv [biayaSupir=" + biayaSupir + ", sewa=" + sewa + "]";
    }
    
    
}
