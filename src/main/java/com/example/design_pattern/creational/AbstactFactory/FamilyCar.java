package com.example.design_pattern.creational.AbstactFactory;

public class FamilyCar implements Car{
    @Override
    public void drive() {
        System.out.println("family car");
    }
}
