package com.example3.config;

import com.example3.beans.Person;
import com.example3.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    /***
     *
     * @return
     */
    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW");
        return vehicle;
    }

    /***
     * Wiring using method parameter.
     * @param vehicle1
     * @return
     */
    @Bean
    public Person person(Vehicle vehicle1) {
        Person person = new Person();
        person.setName("Mahmoud");
        person.setVehicle(vehicle1);
        return person;
    }
}
