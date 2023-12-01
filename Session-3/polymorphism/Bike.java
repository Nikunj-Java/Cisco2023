package com.simplilearn.polymorphism;

class Vehical {
	
	void run() {
		System.out.println("Vehicle is Running");
	}

}

class Bike extends Vehical {
	// Vehical and Bike both has the same method 
	// while we run this example only bike's run method will be called 
	//instead of vehical's run method
	//if you will comment bike's run method and run the program again only vehical's 
	//run method is called
	// inshort when two methods in parent child relationship(inheritance) only child method 
	//will be called is known as Method Over Riding
	void run() {
		System.out.println("Bike is Running");
		
	}
	public static void main(String[] args) {
		Bike b= new Bike();
		b.run();
	}
}


