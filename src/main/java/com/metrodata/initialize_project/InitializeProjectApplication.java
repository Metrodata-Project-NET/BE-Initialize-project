package com.metrodata.initialize_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.metrodata.initialize_project.repository")
public class InitializeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitializeProjectApplication.class, args);
	}

}
