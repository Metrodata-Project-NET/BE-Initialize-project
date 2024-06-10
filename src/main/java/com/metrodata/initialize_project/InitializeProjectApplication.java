package com.metrodata.initialize_project;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class InitializeProjectApplication {

	// @Bean
	// @PostConstruct
	public static void main(String[] args) {
		SpringApplication.run(InitializeProjectApplication.class, args);
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss.SSS").format(new Date());
		System.out.println(timeStamp + "  RMS Server Side is Running....");
	}

}
