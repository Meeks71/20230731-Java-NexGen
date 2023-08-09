package com.skillstorm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.skillstorm.demo.beans.Marcus;
import com.skillstorm.demo.beans.Thor;

// @ComponentScan
@SpringBootApplication
public class SpringBootGettingStartedApplication implements CommandLineRunner {

	// Autowired
	@Autowired
	// 1. Checks the variable name and searches for a bean with that name
	// 2. Looks for a bean of String type
	@Qualifier("a")
	private String name;
	
	@Autowired
	private Marcus marcus;
	
	@Autowired
	private Thor thor;
	
	// There is no bean of food, so @Autowired will not work
//	@Value("burger")
	// SpEL Spring Expression Language
	@Value("${food}")
//	@Value("#{systemEnvironment['JAVA_HOME']}")
	private String food; // = "burger";
	
	@Value("#{(T(java.lang.Math).random() * 10000).intValue()}")
	private int random;
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootGettingStartedApplication.class, args);
		// This line onwards, application context is initialized
		String name = ctx.getBean("anotherNameForABean", String.class);
//		System.out.println(name);
//		ctx.getBean("a");
//		ctx.getBean("a");
//		ctx.getBean("a");
//		ctx.getBean("a");
//		
//		ctx.getBean("anotherNameForABean", String.class);
//		ctx.getBean("anotherNameForABean", String.class);
//		ctx.getBean("anotherNameForABean", String.class);
	}

	@Override
	public void run(String... args) throws Exception {
		// This logic runs once the application context starts
		System.out.println(name);
		marcus.act();
		thor.act();
		System.out.println(food);
		System.out.println(random);
	}

}
