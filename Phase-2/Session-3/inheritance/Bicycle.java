package com.simplilearn.inheritance;

public class Bicycle {

	private int gear;
	private int speed;

	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	// methods to decrease speed
	public void applyBreaks(int decrement) {
		speed = --decrement;
	}

	// methods to increase speed
	public void sppedUp(int increment) {
		speed = ++ increment;
	}

	@Override
	public String toString() {
		return "Bicycle [no of gear: =" + gear + ", speed of bike: =" + speed + "]";
	}
	
	

}
