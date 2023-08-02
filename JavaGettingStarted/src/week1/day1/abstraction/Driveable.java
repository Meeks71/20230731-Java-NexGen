package week1.day1.abstraction;

/**
 *
 * Interfaces vs Abstract Classes
 * 
 * A class can implement multiple interfaces
 * BUT a class can only extend one class
 *
 */
public interface Driveable {

	// Needs the ability to drive
	public void drive();
	// Needs the ability to drive for x amount of miles
	public void drive(int miles);
}
