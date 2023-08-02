package week1.day1.inheritance;

import week1.day1.Person;

public class Flamingo extends Animal {

	public Flamingo() {
		super();
	}
	
	public Flamingo(String name, String breed, int age) {
		super(name, breed, age);
	}

	@Override
	public void speak() {
		System.out.println("Majestic Squawk");
	}
	
	public static void main(String[] args) {
		Flamingo flamingo = new Flamingo();
		
		flamingo.speak();
		System.out.println(flamingo.age);
		
//		Person person = new Person();
	}

}
