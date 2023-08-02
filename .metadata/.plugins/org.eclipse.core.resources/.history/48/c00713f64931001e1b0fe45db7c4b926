package week1.day3;

// Singleton one copy of the object EVER exists
// Limit the creation of the object
// Lends itself to multithreading
// If it is "stateful", you need take precautions to ensure thread safety
public class Singleton {
	
	private static Singleton instance = new Singleton(); // Eager Initialization
	
	// This is intentionally NOT static, because it's only accessible when you get the instance
	private int count; // This is stateful and needs to be made thread safe
	
	private Singleton() {
		System.out.println("Singleton created");
	}
	
	public static Singleton getInstance() {
		if (instance == null) { // Lazy initializing
			instance = new Singleton(); // We can call constructor here
		}
		return instance;
	}
	
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s);
		System.out.println(s2);
		
		
	}
}
