package com.simplilearn.encapsulation;

public class LoginClass {
	
	public static void main(String[] args) {
		//when data comes from server we need to store and pass it to another class(Employee)
		//we use encapsulation,serialization tostring methods and constructors
		
		Employee e1= new Employee();
		e1.setId(1);
		e1.setName("Nikunj");
		e1.setEmail("Nikunj@gmail.com");
		e1.setPassword("Nikunj@123");
		e1.setMobile("9876543210");
		
		System.out.println(e1);
		
		
		//set and print the value of student here
	}

}
