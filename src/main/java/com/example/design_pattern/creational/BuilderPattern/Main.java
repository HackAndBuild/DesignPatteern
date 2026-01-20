package com.example.design_pattern.creational.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setName("Mohan")
                .setAge(25)
                .setCountry("India")
                .setSkill("Java")
                .setRole("Developer")
                .build();
    }
}
