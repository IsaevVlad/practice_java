package ru.mirea.lab4.task10;

public abstract class Vehicle {
    private String name;
    private double speedKmh;
    private double costPerPassengerKm;
    private double costPerTonKm;

    protected Vehicle(String name, double speedKmh, double costPerPassengerKm, double costPerTonKm) {
        this.name = name;
        this.speedKmh = speedKmh;
        this.costPerPassengerKm = costPerPassengerKm;
        this.costPerTonKm = costPerTonKm;
    }

    public String getName() {
        return name;
    }

    public double travelTimeHours(double distanceKm) {
        return distanceKm / speedKmh;
    }

    public double cost(double distanceKm, int passengers, double cargoTons) {
        return distanceKm * (passengers * costPerPassengerKm + cargoTons * costPerTonKm);
    }
}
