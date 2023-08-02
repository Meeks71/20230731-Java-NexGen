package week1.day3.strategy;

public class Lawnmower {
	private double battery;
	private LawnmowerStrategy strategy;
	
	public Lawnmower() {
		setBattery(100);
	}
	
	public void mow() {
		strategy.mow();
	}
	
	public void setBattery(double battery) {
		this.battery = battery;
		if (battery > 50) {
			strategy = new HighPowerLawnmowerStrategy();
		} else {
			strategy = new LowPowerLawnmowerStrategy();
		}
	}
	
	public static void main(String[] args) {
		Lawnmower mower = new Lawnmower();
		
		mower.mow();
		mower.setBattery(60);
		mower.mow();
		mower.setBattery(20);
		mower.mow();
	}
}
