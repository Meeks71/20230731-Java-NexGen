package week1.day3;

import java.util.concurrent.LinkedBlockingQueue;

public class Chef implements Runnable {

	private LinkedBlockingQueue<String> expo;
	private String name;
	private String food;
	private int cookTime;
	
	public Chef() {
		
	}
	
	public Chef(LinkedBlockingQueue<String> expo, String name, String food, int cookTime) {
		super();
		this.expo = expo;
		this.name = name;
		this.food = food;
		this.cookTime = cookTime;
	}

	@Override
	public void run() {
		// Cook the item based off the cook time
		// Place it on the expo instantly
		while(true) {
			try {
				Thread.sleep(cookTime); // Emulate "cooking" the meal
				expo.put(food); // Places the food on the expo
				System.out.println(name + " finished cooking " + food);
				System.out.println("The current amount of items on the expo is: " + expo.size());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}
