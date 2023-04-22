package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {


    ////////////////////////////////////////////////////
    /***
     * BMW SUPPLIER
     */
    public Supplier<Vehicle> bmwSupplier = () -> {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW");
        vehicle.setColor("Black");
        return vehicle;
    };

    ////////////////////////////////////////////////////
    /***
     * Audi Supplier
     */
    public Supplier<Vehicle> audiSupplier = () -> {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi");
        vehicle.setColor("White");
        return vehicle;
    };

    ////////////////////////////////////////////////////
    /***
     *
     * @param args
     */
    public static void main(String[] args) {
        Main main = new Main();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //Register a new vehicle.
        context.registerBean("BMW", Vehicle.class, main.bmwSupplier);
        context.registerBean("Audi", Vehicle.class, main.audiSupplier);

        Vehicle vehicle = context.getBean("BMW", Vehicle.class);
        System.out.println(vehicle.getName());
        System.out.println(vehicle.getColor());

        Vehicle audi = context.getBean("Audi", Vehicle.class);
        System.out.println(audi.getName());
        System.out.println(audi.getColor());


    }
}
