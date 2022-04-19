package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.example.constructorinjection", "com.example.dependency" })
public class ExampleApplicationCI {

	public static void main(String[] args) {

		Car obj = new Car();
		try {
			//obj = context.getBean(Car.class);
			obj.start();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		// also remaining two classes like electric engine, combustion engine here.
		// make sure it's working 
	}

}
