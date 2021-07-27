package com.logic.day04.IntroOOP;

public class Car {
    String licensePlate;
    int rpm;
    int speed;
    int gear;
    int fuelLevel;
    double engineTemperature;

    static int  totalCar = 0;

    //STATIC METHOD
    public static void countCar() {
        totalCar++;
        System.out.println("Total Car = " + totalCar);
    }

    //INSTANCE METHOD
    public void totalCar() {
        totalCar++;
        speed = 200;
        System.out.println("Total Car = " + totalCar);
        System.out.println("Speed Car = " + speed);
    }

    //overloading method
    public void totalCar(int x) {
        totalCar+= x;
        speed = 200;
        System.out.println("Total Car = " + totalCar);
        System.out.println("Speed Car = " + speed);
    }

    public void totalCar(int x, int s) {
        totalCar+= x;
        speed = s;
        System.out.println("Total Car = " + totalCar);
        System.out.println("Speed Car = " + speed);
    }

    //varags method
    public void listMerk(String... merks) {
        for (int i = 0; i < merks.length; i++) {
            System.out.println("Merk : " + merks[i]);
        }
    }
}
