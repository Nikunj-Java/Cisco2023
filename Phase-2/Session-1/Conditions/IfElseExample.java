package com.simplilearn.conditions;

import java.util.Scanner;

public class IfElseExample {
	
	public static void main(String[] args) {
		/*
		int x=100;
		
		int y=200;
		
		if(x>y) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		*/
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Percentage");
		
		int p=sc.nextInt();
		
		/* 01 if else example
		
		
		if(p>=70 && p<=100) {
			System.out.println("Distin6ction");
		}
		else {
			System.out.println("First Class");
		}
		
		*/
		
		//02 elseif
		
		if(p>=70 && p<=100) {
			System.out.println("Distinction");
		}
		else if(p>=60 && p<70) {
			System.out.println("First Class");
		}
		
		else if(p>=50 && p<60) {
			System.out.println("Second Class");
		}
		
		else if(p>=35 && p<50) {
			System.out.println("Pass Class");
		}
		else if(p>=00 && p<35) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Enter Correct Number");
		}
		
		
		
		
	}

}
