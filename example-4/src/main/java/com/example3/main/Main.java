package com.example3.main;

import com.example3.beans.Person;
import com.example3.beans.Vehicle;
import com.example3.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ProjectConfig.class);
        context.refresh();

        Person person = context.getBean(Person.class);
        System.out.println("Person Name:" + person.getName());

        Vehicle vehicle = person.getVehicle();
        System.out.println("Person Vehicle name: " + vehicle.getName());

        context.close();
    }
}
