package com.upgrad.user.usermicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserMicroserviceApplication {

	public static void main(String[] args) {

		SpringApplication.run(UserMicroserviceApplication.class, args);
		System.out.println("User Microservice Application started and running up on the server!!");
	}

}
