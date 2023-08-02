package week1.day1.inheritance;

public class GoldenRetriever extends Dog {
	
	// This is the default constructor
	public GoldenRetriever() {
		// Calls the parent constructor
		// Dog()
		super("Goldy", "Golden Retriever", 5);
	}
	
	// Method Overriding
	@Override
	public void speak() {
		// If you want to use the parent definition, use super
		super.speak();
		System.out.println("Bark bark");
	}
	
	public static void main(String[] args) {
		GoldenRetriever levi = new GoldenRetriever();
		
		System.out.println(levi.name);
		levi.speak();
	}
}
