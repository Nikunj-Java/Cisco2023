package com.simplilearn.demo;

import java.util.Scanner;

public class ScanningNumber {
	
	
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static int multiply(int a,int b) {
		return a*b;
	}
	
	public static int sub(int a,int b) {
		return a-b;
	}
	
	public static int divide(int a,int b) {
		return a/b;
	}
	
 	public static void main(String[] args) {
		int num1,num2;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Your First Number");
		
		num1=sc.nextInt();
		
		System.out.println("Enter Your Second Number");
		num2=sc.nextInt();
		
		sc.close();
		
	 
		System.out.println("Sum of the two numbers : "+add(num1,num2));
		
		System.out.println("Subtraction of two numbers:"+sub(num1, num2));
		
		System.out.println("Multiplication of two numbers: "+multiply(num1, num2));
		
		System.out.println("Division of two Numbers: "+divide(num1, num2));
		
		
	}

}
