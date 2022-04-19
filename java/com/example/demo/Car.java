package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private Engine engine = new ElectricEngine();
    private Engine engine2 = new CombustionEngine();
    
   // enable setter injection here
   @Bean
    public void start() {
        engine.turnOn();
        engine2.turnOn();
    }
}
