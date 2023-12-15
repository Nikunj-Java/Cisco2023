package com.simplilearn.abstraction;

public class TestAbstraction {
	public static void main(String[] args) {
		
		
		Shape s1= new Circle(1.5, "Red");
		
		System.out.println("Shape: "+s1);
		
		Shape s2= new Square("White", 20.02);
		
		System.out.println("Shape: "+s2);
		
		//prepare rectangle class
		//call it from here by just passing length and breadth
	}

}
