package com.logic.day04.Constructor;

public class Car {
    private String licensePlate;
    private int rpm;
    private int speed;
    private int gear;
    private int fuelLevel;
    private double engineTemperature;
    //jika suat atribut final akan di assign 1x
    private final int totalWheel = 4;
    private static int  totalCar = 0;
    
    //Default Constructor
    public Car() {
        totalCar++;
    }
    //Argument Constructor
    public Car(String licensePlate, int rpm, int speed, int gear, int fuelLevel, double engineTemperature) {
        this.licensePlate = licensePlate;
        this.rpm = rpm;
        this.speed = speed;
        this.gear = gear;
        this.fuelLevel = fuelLevel;
        this.engineTemperature = engineTemperature;
        totalCar++;
    }

    public Car(String licensePlate, int speed) {
        this.licensePlate = licensePlate;
        this.speed = speed;
        totalCar++;
    }

    //Geter, setter
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getEngineTemperature() {
        return engineTemperature;
    }

    public void setEngineTemperature(double engineTemperature) {
        this.engineTemperature = engineTemperature;
    }

    public int getTotalWheel() {
        return totalWheel;
    }

    public static int getTotalCar() {
        return totalCar;
    }

    public static void setTotalCar(int totalCar) {
        Car.totalCar = totalCar;
    }

    
    
        
}
