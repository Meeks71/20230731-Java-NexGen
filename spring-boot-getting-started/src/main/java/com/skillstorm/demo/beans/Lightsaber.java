package com.skillstorm.demo.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Lightsaber implements Weapon, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

	private String beanName;
	
	@Override
	public void attack() {
		System.out.println("Woosh");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Bean Name : " + name);
		this.beanName = name;
		// This allows our bean to be aware of its own name
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// This allows a bean to know which factory created it
		System.out.println("Bean Factory : " + beanFactory);
//		beanFactory.getBean(""); // Use this method to grab other beans
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Application Context : " + applicationContext);
//		applicationContext.getBean(""); //Contains more than the factory
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// Initialization logic
		// Create connections to a database
		// Open a file
		// do whatever
		System.out.println("Initializing Bean");
	}
	
	// This can be called anything
	public void customInit() {
		System.out.println("Custom Init");
	}

	@Override
	public void destroy() throws Exception {
		// Tear down logic goes here
		// Sever connections in this method
		// Write findings to a file
		System.out.println("Disposable Bean");
	}
	
	public void customDestroy() {
		System.out.println("Custom Destroy");
	}
}
