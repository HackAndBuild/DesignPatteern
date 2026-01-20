package com.example.design_pattern.creational.AbstactFactory;

public class FamilyBike implements Bike{
    @Override
    public void ride() {
        System.out.println("family bike");
    }
}
