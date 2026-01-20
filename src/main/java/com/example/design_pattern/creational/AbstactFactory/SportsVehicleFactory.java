package com.example.design_pattern.creational.AbstactFactory;

public class SportsVehicleFactory implements VehicleFactory{
    @Override
    public Car crateCar() {
        return new SportsCar();
    }

    @Override
    public Bike crateBike() {
        return new SportsBike();
    }
}
