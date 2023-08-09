package com.skillstorm.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// Stereotype annotation

// Controller -> Service -> Repository

/**
 * Component (generic)
 * Service // Business logic
 * Repository (DAO) // Data access
 * Controller // This one adds additional functionality
 */

@Component // Spring will see this annotation and create a bean of it
@Scope("singleton") // Can scope your components
public class Thor implements Character {

//	@Autowired // Field injection
	private final Weapon hammer; // Uses the name of var to get bean
	
	// Constructor injection
	@Autowired // Hammer is a necessary dependency... autowires a hammer
	public Thor(Weapon hammer) {
		this.hammer = hammer;
	}
	
//	@Autowired // Setter injection
	public void setHammer(Weapon hammer) {
//		this.hammer = hammer;
	}
	
	
	@Override
	public void act() {
		hammer.attack();
	}

}
