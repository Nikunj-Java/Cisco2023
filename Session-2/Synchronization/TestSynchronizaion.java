package com.simplilearn.synchronization;

public class TestSynchronizaion {
	
	public static void main(String[] args) {
		
		Sender sender= new Sender();
		User u1= new User("Hritik", "Hello Good Afternon....!", sender);
		User u2= new User("Nikunj", "Hii!!... How are You? ", sender);
		
		u1.start();
		u2.start();
	}

}
