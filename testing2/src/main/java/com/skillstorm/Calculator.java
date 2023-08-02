package com.skillstorm;

public class Calculator {

	public static int add(int x, int y) {
		return x + y;
	}

	public static int divide(int x, int y) {
		if (y == 0) {
			throw new IllegalArgumentException("No zero allowed for divisor");
		}
		return x / y;
	}
}
