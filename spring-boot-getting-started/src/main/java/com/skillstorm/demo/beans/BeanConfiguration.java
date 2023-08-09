package com.skillstorm.demo.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfiguration {
	
	/**
	 * Bean Scopes
	 * 
	 * singleton (default) **
	 * prototype **
	 * request * 
	 * session *
	 * websocket
	 * application
	 * 
	 */
	
	// Creates a bean called name with the value of "Sean"
	@Bean("anotherNameForABean")
//	@Primary // In the event two beans of the same type exist, use this one
	public String name() {
		System.out.println("Creating name bean");
		return "John";
	}
	
	@Bean
	@Scope("prototype")
	public String a() {
		System.out.println("Creating a bean....");
		return "a";
	}
	
	@Bean
	public Vaporizer vaporizer() {
		return new Vaporizer();
	}
	
	@Bean
	public Hammer hammer() {
		return new Hammer();
	}
	
	@Bean
	public Marcus marcus() {
		Marcus m = new Marcus();
		m.setWeapon(hammer());
		return m;
	}
	
	@Bean(initMethod = "customInit", destroyMethod = "customDestroy")
	public Lightsaber saber() {
		return new Lightsaber();
	}
	
}
