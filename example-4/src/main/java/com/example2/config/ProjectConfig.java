package com.example2.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    ///////////////////////////////////////

    /***
     *
     * @return
     */
    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW");
        vehicle.setColor("White");
        return vehicle;
    }

    ////////////////////////////////////////

    /***
     * Wiring using method call
     * @return
     */
    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("Mahmoud");

        // here we did the wiring using the method call.
        person.setVehicle(vehicle());
        return person;
    }
}
