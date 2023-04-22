package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name = "BMW")
    Vehicle vehicle1() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW");
        vehicle.setColor("Black");
        return vehicle;
    }

    @Bean(name = "Audi")
    Vehicle vehicle2() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi");
        vehicle.setColor("White");
        return vehicle;
    }
}
