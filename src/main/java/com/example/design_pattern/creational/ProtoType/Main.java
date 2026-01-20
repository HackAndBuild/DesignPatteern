package com.example.design_pattern.creational.ProtoType;

public class Main {
    public static void main(String[] args) {

        Employee original = new Employee("Mohan", "Java Developer", 60000);

        Employee clone1 = (Employee) original.clone();
        clone1.setName("Rahul");

        Employee clone2 = (Employee) original.clone();
        clone2.setName("Anita");

        original.showDetails();
        clone1.showDetails();
        clone2.showDetails();
    }
}
