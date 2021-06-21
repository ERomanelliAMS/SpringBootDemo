package com.example.SpringAppHCC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringAppHccApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringAppHccApplication.class, args);

		var car = applicationContext.getBean(Car.class);
		car.getCar();
	}

}
