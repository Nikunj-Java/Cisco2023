package com.simplilearn.uncheckedexception;

import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
		//run time exceptions are called as unchecked exceptions
		//they can oocurs during execution of program
		//error: Exception in thread "main" java.util.InputMismatchException
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		sc.close();
		
		int divide= num1/num2; // this is risky code
		
		System.out.println("Division is: "+ divide);
		
		System.out.println("End of the program");
		
	}

}
