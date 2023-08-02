package com.skillstorm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Testing2ApplicationTests {
	
	private int[] arr = {1, 2, 3};
	
	// Build up
	@BeforeAll
	public static void beforeAll() {
		// Runs exactly once before all other tests
		// Might read from a configuration/data file
		
		// Establish connection to a database
		System.out.println("Runs before ALL tests ONCE");
	}
	
	@AfterAll
	public static void aaa() {
		// Runs exactly once AFTER all other tests finish
		// Close any connections that are open
		// Write the findings to a file
		System.out.println("Runs after ALL tests ONCE");
	}
	
	// Logic that runs BEFORE each test
	@BeforeEach // JUnit 4 this is @Before
	public void pre() {
//		arr = new int[3]; // Clean data back up to what it was
		System.out.println("Runs before each");
	}
	
	@AfterEach
	public void post() {
		// Write findings after each method
		System.out.println("Runs after each");
	}
	
	// Tear down

	@Test
	void testAddition() {
		int sum = Calculator.add(1, 2);
		assertEquals(3, sum);
		// JaCoCo
		
		sum = Calculator.add(20, -10);
		assertEquals(10, sum);
	}
	
	@Test
	void testDivision() {
		int quotient = Calculator.divide(4, 2);
		assertEquals(2, quotient);
	}
	
	@Test
	void testDivideByZero() {
		// My expected result is that an exception is thrown (IllegalArgumentException)
		assertThrows(IllegalArgumentException.class, () -> {
			Calculator.divide(10, 0);
		});
	}
}
