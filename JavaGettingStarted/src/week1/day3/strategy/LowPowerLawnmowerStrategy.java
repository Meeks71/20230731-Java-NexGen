package week1.day3.strategy;

public class LowPowerLawnmowerStrategy implements LawnmowerStrategy {

	@Override
	public void mow() {
		System.out.println("Cutting towards the inside of the lawn!");
	}

}
