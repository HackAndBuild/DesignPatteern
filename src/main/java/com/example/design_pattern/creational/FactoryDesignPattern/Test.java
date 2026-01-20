package com.example.design_pattern.creational.FactoryDesignPattern;

public class Test {
    public static void main(String[] args) {
        Car car=CarCategory.getCarInstance("Defender");
        car.start();
    }
}
