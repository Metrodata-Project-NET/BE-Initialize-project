package com.metrodata.initialize_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InitializeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitializeProjectApplication.class, args);
		System.out.println("=================");
        System.out.println("Server is running");
        System.out.println("=================");
	}

}
