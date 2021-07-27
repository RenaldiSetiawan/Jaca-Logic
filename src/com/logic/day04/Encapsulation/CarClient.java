package com.logic.day04.Encapsulation;

public class CarClient {
    public static void main(String[] args) {
        Car car = new Car();

        car.setLicensePlate("B 1000 ABC");
        System.out.println("licesePlate : " + car.getLicensePlate());

        car.setRpm(10);
        System.out.println("Rpm : " + car.getRpm());

        car.setSpeed(200);
        System.out.println("Speed : " + car.getSpeed());

        car.getTotalWheel();
        System.out.println("Total Whell : " + car.getTotalWheel());



        System.out.println();
    }
}
