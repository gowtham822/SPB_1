package com.tcs.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tcs.in" })
public class Spb1Application {

	public static void main(String[] args) {
		SpringApplication.run(Spb1Application.class, args);
	}
	
}
