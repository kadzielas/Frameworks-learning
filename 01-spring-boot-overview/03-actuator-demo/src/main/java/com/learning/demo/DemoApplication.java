package com.learning.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	//http://localhost:8080/actuator/info
	//http://localhost:8080/actuator/mappings
	//http://localhost:8080/actuator/beans etc...
}
