package com.apasoft;

public class Employee {
    private String code;
    private String name;
    private int age;

    public Employee(String code, String name, int age) {
        this.code = code;
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return "Employee{code='" + code + "', name='" + name + "', age=" + age + "}";
    }
}