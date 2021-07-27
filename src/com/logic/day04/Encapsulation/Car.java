package com.logic.day04.Encapsulation;

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

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
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

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    
}
