package com.simplilearn.abstraction;

public abstract class Shape {
	
	//abstarction in java is the process of hiding the implementation details from the user and showing only the functionality
	// when we open a lock: we don't know the mechanism inside the lock we just know the functionality like locking and unlocking

	private String color;
	
	abstract double area();
	
	
	public Shape(String color) {
		System.out.println("Constructor Called");
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
	
	
	

}
