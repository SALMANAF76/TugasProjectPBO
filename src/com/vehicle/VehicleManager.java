package com.vehicle;

import java.util.ArrayList;
import java.util.List;

// Menggunakan Generics untuk manajemen kendaraan
public class VehicleManager<T extends Vehicle> implements VehicleService {
    private List<T> vehicles = new ArrayList<>();

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicles.add((T) vehicle);
        System.out.println("✅ Kendaraan ditambahkan: " + vehicle.getBrand() + " " + vehicle.getModel());
    }

    @Override
    public void displayVehicles() {
        System.out.println("\n📋 Daftar Kendaraan:");
        for (Vehicle v : vehicles) {
            v.showDetails();
        }
    }
}
