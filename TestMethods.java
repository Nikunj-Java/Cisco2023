package com.simplilearn.demo;

public class TestMethods {
	
	public static void main(String[] args) {
		
		Accessmodifier obj= new Accessmodifier();
		
		obj.methodDefault();
		obj.methodProtected();
		obj.methodPublic();
		//obj.methodPrivate();  
		//private  method we can't access out side of the class,
		//its scope is within the class only
	}

}
