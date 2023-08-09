package com.skillstorm.demo.beans;

public class Hammer implements Weapon {

	@Override
	public void attack() {
		System.out.println("Bang bang!");
	}

}
