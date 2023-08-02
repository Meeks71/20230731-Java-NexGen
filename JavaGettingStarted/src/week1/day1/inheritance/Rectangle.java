package week1.day1.inheritance;

public class Rectangle {

	private double length;
	private double width;
	private String color;

	public Rectangle() {
		super();
	}

	public Rectangle(double length, double width, String color) {
		super();
		this.length = length;
		this.width = width;
		this.color = color;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}
