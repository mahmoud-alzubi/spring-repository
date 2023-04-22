package com.example5;

import com.example5.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@ComponentScan(basePackages = "com.example5.beans")
@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle1() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW");
        vehicle.setColor("White");
        return vehicle;
    }

    @Bean
    public Vehicle vehicle2() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi");
        vehicle.setColor("Black");
        return vehicle;
    }
}
