package com.example4.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {
    private String name;

    /***
     * Autowired on class field.
     */
//     @Autowired (required = false)
//    @Autowired
    private Vehicle vehicle;

    /***
     * Default constructor.
     */
    public Person() {

    }

    /***
     * Autowired on constructor.
     * since we have default constructor, @Autowired annotation here is required.
     * If you have only one constructor, @Autowired annotation became optional.
     */
    @Autowired
    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @PostConstruct
    public void init() {
        this.name = "Mahmoud";
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    /***
     * Autowired on setter method.
     * @param vehicle
     */
//    @Autowired
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
