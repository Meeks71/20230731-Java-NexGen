package com.skillstorm.demo.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfiguration {
	
	// Creates a bean called name with the value of "Sean"
	@Bean("anotherNameForABean")
//	@Primary // In the event two beans of the same type exist, use this one
	public String name() {
		System.out.println("Creating name bean");
		return "John";
	}
	
	@Bean
	public String a() {
		return "a";
	}
}
