package com.simplilearn.methods;

public class MethodOverLoading {
	
	int add( int a, int b) {
		return a+b;
	}
	
	int add( int a, int b,int c) {
		return a+b+c;
	}
	
	
	float add(float a,float b) {
		return a+b;
	}
	
	double add(double a,double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		MethodOverLoading obj= new MethodOverLoading();
		System.out.println("Addition of two Numbers: "+obj.add(23, 17));
		
		System.out.println("Addition of three Numbers: "+obj.add(23, 17,20));
		
		System.out.println("Addition of two Numbers: "+obj.add(23.17f, 17.25f));		
		
		System.out.println("Addition of two Numbers: "+obj.add(55.17, 17.25));
	}

}
