package com.example.beans;

public class Vehicle {
    private String name;
    private String color;

    public Vehicle() {
        System.out.println("vehicle default constructor has been initialized.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
