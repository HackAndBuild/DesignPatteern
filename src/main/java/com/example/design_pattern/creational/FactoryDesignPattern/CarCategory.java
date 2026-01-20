package com.example.design_pattern.creational.FactoryDesignPattern;

public class CarCategory {
    public static Car getCarInstance(String type) {
        if (type.equals("BMW"))
            return new Bwm();
        else if (type.equals("RollsRoyce"))
            return new RollsRoyce();
        else if (type.equals("Defender"))
            return new Defender();
        else
            return null;
    }
}

