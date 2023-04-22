package com.example4;

import com.example4.beans.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);

        System.out.println("Person name: " + person.getName());
        System.out.println("Person vehicle name: " + ((person.getVehicle() != null) ? person.getVehicle().getName() : person.getVehicle()));
        System.out.println("Person vehicle color: " + ((person.getVehicle() != null) ? person.getVehicle().getColor() : person.getVehicle()));

        context.close();

    }
}
