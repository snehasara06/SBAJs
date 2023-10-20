package com.kgisl.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication // main class of my Spring Boot application
@OpenAPIDefinition //part of the Springdoc library,
//  which is used to generate OpenAPI documentation for Spring Boot applications. 
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
		// responsible for bootstrapping and launching the Spring Boot application. 
	}

}
