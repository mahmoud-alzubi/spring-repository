package com.example.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Vehicle {
    private String name;
    private String color;

    @PostConstruct
    public void init() {
        setName("Audi");
        setColor("BMW");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("performing the destroy action.");
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

    public void sayHello() {
        System.out.println("Hello From Vehicle Class.");
    }

}
