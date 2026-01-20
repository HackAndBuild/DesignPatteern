package com.example.design_pattern.creational.BuilderPattern;

class User {

    private final String name;
    private final int age;
    private final String country;
    private final String skill;
    private final String role;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.country = builder.country;
        this.skill = builder.skill;
        this.role = builder.role;
    }

    // Getters only (immutable object)
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCountry() { return country; }
    public String getSkill() { return skill; }
    public String getRole() { return role; }

    // 🔹 Builder Class
    public static class UserBuilder {
        private String name;
        private int age;
        private String country;
        private String skill;
        private String role;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public UserBuilder setSkill(String skill) {
            this.skill = skill;
            return this;
        }

        public UserBuilder setRole(String role) {
            this.role = role;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}