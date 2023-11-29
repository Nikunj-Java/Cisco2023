package com.simplilearn.demo;

public class OperatorsExample {
	
	
	public int add() {
		
		return 3+5;
		
	}
	
	public int sub() {
		
		return 5-2;
		
	}
	
	public int multiply() {
		return 3*4;
	}
	
	public int divide() {
		return 50/10;
	}
	
	public static void main(String[] args) {
		OperatorsExample obj= new OperatorsExample();
		
		int result_add= obj.add();
		
		int result_sub=obj.sub();
		
		int result_multiply=obj.multiply();
		
		int result_divide= obj.divide();
		
		System.out.println("Addition: "+result_add);
		System.out.println("Subtraction: "+result_sub);
		System.out.println("Multiply: "+result_multiply);
		System.out.println("Divide: "+result_divide);
	}
	 

}
