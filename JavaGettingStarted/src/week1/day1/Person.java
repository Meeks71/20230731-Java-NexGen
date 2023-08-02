package week1.day1;

/**
 *
 * public - Accessible anywhere (any package, class, etc.)
 * protected - Available only to subclasses AND within the same package
 * default - "Package Private" (Public within the same package, private anywhere else)
 * private - Only available within the class
 *
 */

public class Person {
	 
	// All properties should be private
	 private String name;
	 private int age;
	 // Prevents modification
	 public static final double PI = 3.14;
	 
	 public Person(String name, int age) {
		 setName(name); // I prefer this
		 this.age = age;
	 }
	 
	 // Getters (Read a value)
	 // name -> getname -> getName
	 // Return value should be the same as the variable in question
	 public String getName() {
		 return this.name;
	 }
	 
	 // Setters (Write a value)
	 // name -> setname -> setName
	 // Return value is void and the parameter is of the same type as the variable
	 public void setName(String name) {
		 if (name == "Shawn") {
			 this.name = "Sean";
			 // (123)-123-1234
			 // 1231231234
		 }
		 // Write validation logic as to what they can set it to
		 this.name = name;
	 }
	 
	 public int getAge() {
		 return this.age;
	 }
}






class A {
	public static void main(String[] args) {
//		Person person = new Person();
//		System.out.println(person.name);
//		person.name = "joe";
	}
}