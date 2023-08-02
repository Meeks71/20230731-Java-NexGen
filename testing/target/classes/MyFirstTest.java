import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyFirstTest {

	// Indicate to JUnit that this is a test
	@Test
	public void myFirstTest() {
		assertEquals(2, 3); // If it fails, the test altogther fails
	}
}
