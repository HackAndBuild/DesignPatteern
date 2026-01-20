package com.example.design_pattern.creational.ProtoType;

class Employee implements Prototype {

    private String name;
    private String role;
    private double salary;

    public Employee(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    @Override
    public Prototype clone() {
        return new Employee(name, role, salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println(name + " - " + role + " - " + salary);
    }
}
