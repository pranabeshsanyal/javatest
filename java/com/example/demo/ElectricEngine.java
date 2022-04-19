package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ElectricEngine implements Engine {
	
    private Camshaft camshaft;
	
	// enable filed injection here,
    @Override
    public void turnOn() {
    	camshaft = new Camshaft();
    	camshaft.start();
    	//camshaft.start();
        System.out.println("Started electric engine");
    }
}
