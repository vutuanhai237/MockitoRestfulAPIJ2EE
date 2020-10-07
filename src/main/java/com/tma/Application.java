package com.tma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tma.week3Practice.service")
@ComponentScan("com.tma.week3Practice.controller")
public class Application {
	@Autowired

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
