package week1.day1.inheritance;

public class Cat {

	String name;
	String breed;
	int age;
	
	public Cat() {
		
	}
	
	public Cat(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println(cat.age);
	}
}
