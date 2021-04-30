package com.durgasoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloappsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloappsApplication.class, args);
		System.out.println("Spring Boot Application using STS");
	}

}
