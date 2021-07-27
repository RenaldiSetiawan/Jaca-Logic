package com.logic.day04.IntroOOP;

public class CarClient {
    public static void main(String[] args) {

        Car.totalCar = 4;
        System.out.println(Car.totalCar);
        System.out.println();
        //static method
        Car.countCar();


        //instance object car
        Car car = new Car();
        car.licensePlate = "B 0099 FGT";
        car.totalCar();
        car.totalCar(4, 250);
        car.listMerk("Hoda", "CRV","HRV");
        car.listMerk("Honda");
        car.listMerk("Suzuki", "Honda");

     /*   Car car1 = new Car();
       car1.licensePlate = "B 0123 ABC";
       car1.rpm = 2;
       car1.speed = 40;
       car1.gear = 2;
       car1.fuelLevel = 3;
       car1.engineTemperature = 6.8;

       Car car2 = new Car();
       car2.licensePlate = "B 3456 DFG";
       car2.rpm = 4;
       car2.speed = 70;
       car2.gear = 3;
       car2.fuelLevel = 4;
       car2.engineTemperature = 8.8;

       Car car3 = new Car();
       car3 = car2;
       System.out.println(); */
    }
}
