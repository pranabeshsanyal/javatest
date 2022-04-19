package com.example.demo;

public class CombustionEngine implements Engine {
    
    private Crankshaft crankshaft = new Crankshaft();
	
	// enable constructor injection here
    
    @Override
    public void turnOn() {
    	crankshaft.start();
        System.out.println("Started combustion engine");
    }
}
