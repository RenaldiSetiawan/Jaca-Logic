package com.logic.day04.Constructor;

public class CarClient {
    public static void main(String[] args) {
        //Default Constructor
        Car car = new Car();

        car.setLicensePlate("B 1000 ABC");
        System.out.println("licesePlate : " + car.getLicensePlate());

        car.setRpm(10);
        System.out.println("Rpm : " + car.getRpm());

        car.setSpeed(200);
        System.out.println("Speed : " + car.getSpeed());

        car.getTotalWheel();
        System.out.println("Total Whell : " + car.getTotalWheel());

        Car car1 = new Car("B 1001 ASS", 250, 90, 3, 5, 6.8);
        Car car2 = new Car("B 1002 ADC", 100);

        System.out.println("Total Car : " + Car.getTotalCar());
    }
}
 