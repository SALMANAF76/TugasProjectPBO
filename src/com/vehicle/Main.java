package com.vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleManager<Vehicle> manager = new VehicleManager<>();

        // Menambahkan kendaraan
        manager.addVehicle(new Car("Toyota", "Avanza", 2020, 7));
        manager.addVehicle(new Motorcycle("Honda", "CBR 150R", 2022, true));

        // Menampilkan daftar kendaraan
        manager.displayVehicles();
    }
}
