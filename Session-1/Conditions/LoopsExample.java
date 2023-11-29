package com.simplilearn.conditions;

public class LoopsExample {
	
	public static void main(String[] args) {
		int i=0;
		 
		//while loop
		while(i<=5) {
			System.out.println("Using While: "+i);
			i++;
		}
		
		//do while loop
		do {
			System.out.println("using DO WHILE: "+i);
			i++;
		}
		while(i<=10);
		
		
		//for loop
		for(i=1; i<=8;i++) {
			System.out.println("using FOR LOOP: "+i);
		}
		
		
	}

}
