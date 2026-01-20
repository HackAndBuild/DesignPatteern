package com.example.design_pattern.creational.AbstactFactory;

public class FamilyVehicleFactory implements VehicleFactory{
    @Override
    public Car crateCar() {
        return new FamilyCar();
    }

    @Override
    public Bike crateBike() {
        return new FamilyBike();
    }
}
