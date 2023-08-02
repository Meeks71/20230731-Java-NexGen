package week1.day1.abstraction;

public class Bicycle implements Driveable {

	@Override
	public void drive() {
		System.out.println("Bring bring");
	}

	@Override
	public void drive(int miles) {
		
	}
	
	public static void driveEntity(Driveable entity) {
		entity.drive();
	}
	
	public static void main(String[] args) {
		Driveable bike = new Bicycle();
		Driveable car = new Car();
		
		driveEntity(bike);
		driveEntity(new Skateboard());
		
	}
}