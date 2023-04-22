package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ProjectConfig.class);
        context.refresh();

        Person person = context.getBean(Person.class);
        person.sayHello();

        Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.sayHello();

    }
}
