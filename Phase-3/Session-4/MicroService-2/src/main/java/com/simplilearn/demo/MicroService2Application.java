package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.simplilearn.demo")
public class MicroService2Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroService2Application.class, args);
	}

}
