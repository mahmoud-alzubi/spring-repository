package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

    public Main() {
        context.register(ProjectConfig.class);
        context.refresh();
    }

    public void printVehicleBeanInfo() {
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle Name: " + vehicle.getName());
        System.out.println("Vehicle Color: " + vehicle.getColor());
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.printVehicleBeanInfo();
    }
}
