package com.simplilearn.multithreading;

public class ThreadDemo2 implements Runnable {
	
	
	 

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=5 ; i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//1000 milliseconds=1 second
			
		}
		
	}
	
	public static void main(String[] args) {
		 ThreadDemo2 inst1=new ThreadDemo2();
		 ThreadDemo2 inst2= new ThreadDemo2();
		 
		 //create the threads by passing targets in the constructor
		 
		 
		 Thread t1= new Thread(inst1);
		 Thread t2= new Thread(inst2);
		 
		 t1.start();
		 t2.start();
	}

}
