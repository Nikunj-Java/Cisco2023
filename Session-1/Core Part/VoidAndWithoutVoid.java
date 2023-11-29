package com.simplilearn.demo;

public class VoidAndWithoutVoid {
	
	//void method do not have any return type
	public void methodDisplay() {
		System.out.println("Display Method Called");
	}
	
	public int methodNumber() {
		
		int a=5;
		return a;
		
	}
	
	public static void main(String[] args) {
		
		VoidAndWithoutVoid obj= new VoidAndWithoutVoid();
		obj.methodDisplay();
		
		int result=obj.methodNumber();
		System.out.println("Result is: "+result);
		
	}

}
