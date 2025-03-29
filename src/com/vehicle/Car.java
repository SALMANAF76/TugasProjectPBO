package com.vehicle;

// Subclass dari Vehicle
public class Car extends Vehicle {
    private int seats; // Jumlah kursi

    public Car(String brand, String model, int year, int seats) {
        super(brand, model, year);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public void showDetails() {
        System.out.println("🚗 Mobil: " + getBrand() + " " + getModel() +
                " (" + getYear() + ") - Kursi: " + seats);
    }
}
