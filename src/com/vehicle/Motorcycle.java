package com.vehicle;

// Subclass dari Vehicle
public class Motorcycle extends Vehicle {
    private boolean hasWindshield; // Apakah ada windshield

    public Motorcycle(String brand, String model, int year, boolean hasWindshield) {
        super(brand, model, year);
        this.hasWindshield = hasWindshield;
    }

    public boolean hasWindshield() {
        return hasWindshield;
    }

    @Override
    public void showDetails() {
        System.out.println("🏍️ Motor: " + getBrand() + " " + getModel() +
                " (" + getYear() + ") - Windshield: " + (hasWindshield ? "Ya" : "Tidak"));
    }
}
