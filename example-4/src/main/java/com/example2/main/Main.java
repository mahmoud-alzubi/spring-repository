package com.example2.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        System.out.println("person name: " + person.getName());

        Vehicle vehicle = person.getVehicle();
        if (vehicle != null) {
            System.out.println("vehicle name: " + vehicle.getName());
            System.out.println("vehicle color: " + vehicle.getColor());
        }
    }


}
