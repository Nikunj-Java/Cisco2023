package com.simplilearn.abstraction;

public class Square extends Shape {
	
	private double side;
	
	
	public Square(String color,double side) {
		super(color);
		this.side=side;
	}
	
	double area() {
		return Math.pow(side, 2);
	}

	@Override
	public String toString() {
		return "Square color: ="+getColor()+" and Area is:"+area();
	}
	
	
	

}
