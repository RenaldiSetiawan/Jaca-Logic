package com.logic.day04.Abstraction;

public class VehicleProgram {
    public static void main(String[] args) {
        Helicopter heli = new Helicopter("HELICOPTER", "APTURE", 2015, 50000d, 0.2d, "PUK-H-10", 100d, 2);
        double totalPendapatan = heli.totalPendapatan();
        double totalTax = heli.taksiranPajak();
        System.out.println("Total Pendapatan : " + totalPendapatan);
        System.out.println("Total Tax : " + totalTax);
        System.out.println(heli.toString());
       
    }
}
