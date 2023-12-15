package com.simplilearn.exceptionhandling;

public class Handling2 {
	
	public static void main(String[] args) {
		
		int a=0;
		int b=0;
		
		try {
			int c= a/b;   //risky code
			
			System.out.println("Division is: "+c);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		
		
	}

}
