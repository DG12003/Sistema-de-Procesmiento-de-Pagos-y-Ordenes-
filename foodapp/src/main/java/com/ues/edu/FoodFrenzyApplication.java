package com.ues.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
//@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.example.demo*"})
public class FoodFrenzyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodFrenzyApplication.class, args);
	}

}
