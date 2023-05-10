package com.pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloProgramApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(HelloProgramApplication.class, args);
		System.out.println("Welcome To Spring Boot Application");
	}

}
