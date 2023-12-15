package com.simplilearn.exceptionhandling;

public class Handling3 {
	
	static void check(int age) {
		
		if(age<18) 
			System.out.println("Not a Valid Age");
		else 
			System.out.println("Valid Age for Voting");
		
	}
	
	public static void main(String[] args) {
		
		try {
			check(45);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		//static methods can be called without creating its object
		
		
	}

}
