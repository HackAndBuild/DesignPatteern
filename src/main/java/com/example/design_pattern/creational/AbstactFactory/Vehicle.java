package com.example.design_pattern.creational.AbstactFactory;

public class Vehicle {
    public static void main(String[] args) {
        VehicleFactory factory =new SportsVehicleFactory();
        Bike bike = factory.crateBike();
        Car car=factory.crateCar();
        bike.ride();
        car.drive();
    }
}
