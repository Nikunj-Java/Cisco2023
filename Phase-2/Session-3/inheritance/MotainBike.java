package com.simplilearn.inheritance;

public class MotainBike extends Bicycle {
	
	//extend keword indicated that you are making a new class that is 
	//derived from an existing class
	//meaning if 'extend' means increasing functionality
	
	private int seatHeight;

	public MotainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		// TODO Auto-generated constructor stub
		this.seatHeight=seatHeight;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	@Override
	public String toString() {
		return "MotainBike ["+super.toString()+"\nSeatHeight="+seatHeight+"]";
	}

	
}
