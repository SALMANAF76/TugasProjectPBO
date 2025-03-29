package com.vehicle;

// Abstract class (Encapsulation & Polymorphism)
public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Abstract method (harus diimplementasikan di subclass)
    public abstract void showDetails();
}
