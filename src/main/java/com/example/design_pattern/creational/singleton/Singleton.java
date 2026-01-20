package com.example.design_pattern.creational.singleton;

import lombok.Synchronized;

public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
    }

    @Synchronized
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
