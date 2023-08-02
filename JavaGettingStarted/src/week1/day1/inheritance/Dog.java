package week1.day1.inheritance;

public class Dog {

	// Properties
	String name;
	String breed;
	int age;
	
	Dog() {
		this("Spot", "Pitbull");
//		this.name = "Spot";
//		this.breed = "Pitbull";
//		this.age = 1;
	}
	
	Dog(String name, String breed) {
		// Call the sibbling constructor with this()
		this(name, breed, 11); // new Dog("Lucy", "Golden Retriever", 11);
//		this.name = name;
//		this.breed = breed;
//		this.age = 1;
	}
	
	// Creation of the dog (Constructors)
	Dog(String n, String breed, int age) {
		name = n;
		this.breed = breed;
		this.age = age;
	}
	
	// What can a dog do? (Functions/Methods)
	// speak method that prints the dog's name and age
	public void speak() {
		System.out.println("My name is: " + this.name);
	}
	
	public static void main(String[] args) {
		Dog levi = new Dog("Levi", "Golden Retriever", 2);
		Dog dog = new Dog();
		
		Dog lucy = new Dog("Lucy", "Golden Retriever");
		
		System.out.println(dog.age);
		
		lucy.speak();
		
		System.out.println(levi.name);
	}
}
