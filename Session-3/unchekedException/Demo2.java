package com.simplilearn.uncheckedexception;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		//run time exceptions are called as unchecked exceptions
				//they can oocurs during execution of program
				//error: Exception in thread "main" java.util.InputMismatchException
				//Exception in thread "main" java.lang.NumberFormatException:
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter Any numbers");
				
				String str=sc.next();
				
				//let's convert the str to number
				int number=Integer.parseInt(str);
				
				System.out.println("Number is Converted to Int: "+number);
				
				System.out.println("End of the program");
				
	}

}
