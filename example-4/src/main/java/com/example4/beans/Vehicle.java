package com.example4.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Vehicle {
    private String name;
    private String color;

    /***
     * Initializer
     */
    @PostConstruct
    public void init() {
        setName("BMW");
        setColor("BLACK");
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
