package com.logic.day04.StudyCaseInheritance;

public class Angkot extends Car {
    private double hargaTikiet;
    private int totalPenumpang;

    
    public Angkot(String noPolisi, int tahun) {
        super(noPolisi, tahun, "ANGKOT");
    }

    public Angkot(String noPolisi, int tahun, double hargaTikiet, int totalPenumpang) {
        super(noPolisi, tahun, "ANGKOT");
        this.hargaTikiet = hargaTikiet;
        this.totalPenumpang = totalPenumpang;
        super.setTotalPendapatan(this.hargaTikiet * this.totalPenumpang);
    }

    public double getHargaTikiet() {
        return hargaTikiet;
    }

    public void setHargaTikiet(double hargaTikiet) {
        this.hargaTikiet = hargaTikiet;
    }

    public int getTotalPenumpang() {
        return totalPenumpang;
    }

    public void setTotalPenumpang(int totalPenumpang) {
        this.totalPenumpang = totalPenumpang;
    }

    @Override
    public String toString() {
        return super.toString()+"Angkot [hargaTikiet=" + hargaTikiet + ", totalPenumpang=" + totalPenumpang + "]";
    }

    


    

    
}
