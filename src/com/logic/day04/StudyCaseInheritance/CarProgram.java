package com.logic.day04.StudyCaseInheritance;

import java.util.List;
import java.util.Optional;

public class CarProgram {
    public static void main(String[] args) {
        // Create obj SUV
        Suv suv1 = new Suv("B 1001 RA", 2021, 500000d, 100000d);
        Suv suv2 = new Suv("B 1002 AA", 2020, 500000d, 100000d);
        Suv suv3 = new Suv("B 1003 BA", 2019, 500000d, 100000d);

        // create object taxi
        Taxi taxi1 = new Taxi("B 2001 TA", 2021, 5, 45000D, 60, 1000d);
        Taxi taxi2 = new Taxi("B 2002 BG", 2022, 8, 45000D, 90, 1000d);

        // Create object angkot
        Angkot angkot1 = new Angkot("B 3001 BNM", 2015, 5000d, 10);
        Angkot angkot2 = new Angkot("B 3002 DFG", 2014, 5000d, 12);

        // CREATE OBJECT carlient
        CarClient carClient = new CarClient();
        // contoh polymorpishm dimana object suv diubah
        List<Car> listofCar = carClient.initListCar(suv1, suv2, suv3, taxi1, taxi2, angkot1, angkot2);
        
        //Call method printListCar untk menampilkan object cars di terminal
        // carClient.printListCar(listofCar);

        //Call method find car by type
        List<Car> listCarByType = carClient.findCarByType(listofCar, "SUV");
        //carClient.printListCar(listCarByType); 

        Optional<Car> suvCar = carClient.findCarByNomor(listofCar, "B 1001 RA");
        System.out.println(suvCar.get().toString());

        // 1. Polymorpishm down cast
        Suv suvDC = (Suv) suvCar.get();
        suvDC.getBiayaSuper();

        // 2. Polumorpishm up cast
        Car carUC = suvDC;
        carUC.getNoPolisi();

        double total = carClient.totalPendapatan(listofCar, CarType.SUV);
        // System.out.println("Total Pendapatan : " + total);

        System.out.println();
    }
}
