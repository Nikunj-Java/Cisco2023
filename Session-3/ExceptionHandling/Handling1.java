package com.simplilearn.exceptionhandling;

import java.util.Scanner;

public class Handling1 {
	public static void main(String[] args) {
		
		System.out.println("Enter Any Number");
		Scanner sc= new Scanner(System.in);
		
		//value stored as a string
		String str=sc.next();
		
		
		int number;
		
		try {
			number= Integer.parseInt(str); // risky code
			System.out.println("number: "+number);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		
		
		
		
		
	}

}
