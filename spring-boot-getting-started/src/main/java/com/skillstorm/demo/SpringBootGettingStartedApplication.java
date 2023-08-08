package com.skillstorm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootGettingStartedApplication implements CommandLineRunner {

	// Autowired
	@Autowired
	// 1. Checks the variable name and searches for a bean with that name
	// 2. Looks for a bean of String type
	@Qualifier("a")
	private String name;
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootGettingStartedApplication.class, args);
		// This line onwards, application context is initialized
		String name = ctx.getBean("anotherNameForABean", String.class);
		System.out.println(name);
	}

	@Override
	public void run(String... args) throws Exception {
		// This logic runs once the application context starts
		System.out.println(name);
	}

}
