package com.simplilearn.conditions;

public class NestedIfExample {
	
	//if within if is called as nested if
	
	public static void main(String[] args) {
		
		int a,b,c;
		a=34;
		b=67;
		c=23;
		
		if(a==34) {
			if(b==67) {
				if(c==23) {
					System.out.println("IF within IF is Working");
				}
			}
		}
		else {
			System.out.println("Error In the Program");
			
		}
		
	}

}
