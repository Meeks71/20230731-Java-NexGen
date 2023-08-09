package com.skillstorm.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Marcus implements Character {

	private Weapon weapon;

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	@Override
	public void act() {
		weapon.attack();
	}

}
