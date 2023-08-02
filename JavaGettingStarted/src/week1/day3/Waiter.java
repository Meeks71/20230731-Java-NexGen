package week1.day3;

import java.util.concurrent.LinkedBlockingQueue;

public class Waiter implements Runnable {

	// Blocking queue
	private LinkedBlockingQueue<String> expo; // Hold the food for the server to take
	private String name;
	private int deliveryTime;
	
	public Waiter() {
		
	}
	
	public Waiter(String name, int deliveryTime, LinkedBlockingQueue<String> expo) {
		this.name = name;
		this.deliveryTime = deliveryTime;
		this.expo = expo;
	}

	// Thread's method
	@Override
	public void run() {
		// Server will take item off the expo (if available)
		// Deliver food based off delivery time
		while (true) {
			try {
				String food = expo.take();
				System.out.println(name + " is now delivering " + food);
				Thread.sleep(deliveryTime); // Bringing food to the table
				System.out.println(food + " was delivered");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
