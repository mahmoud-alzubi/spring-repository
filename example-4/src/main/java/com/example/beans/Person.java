package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Person implements Model {
    private String name;
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello from Person class");
    }
}
