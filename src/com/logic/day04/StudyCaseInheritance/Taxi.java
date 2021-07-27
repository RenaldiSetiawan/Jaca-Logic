package com.logic.day04.StudyCaseInheritance;

public class Taxi extends Car {
    private int order;
    private double orderPerKM;
    private int totalKm;
    private double bonus;
    
    public Taxi(String noPolisi, int tahun) {
        super(noPolisi, tahun, "TAXI");
    }

    public Taxi(String noPolisi, int tahun, int order, double orderPerKM, int totalKm, double bonus) {
        super(noPolisi, tahun, "TAXI");
        this.order = order;
        this.orderPerKM = orderPerKM;
        this.totalKm = totalKm;
        this.bonus = bonus;
        super.setTotalPendapatan((this.order*this.bonus) + (this.orderPerKM*this.totalKm));
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public double getOrderPerKM() {
        return orderPerKM;
    }

    public void setOrderPerKM(double orderPerKM) {
        this.orderPerKM = orderPerKM;
    }

    public int getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(int totalKm) {
        this.totalKm = totalKm;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Taxi [bonus=" + bonus + ", order=" + order + ", orderPerKM=" + orderPerKM + ", totalKm=" + totalKm
                + "]";
    }

    
    

    
}
