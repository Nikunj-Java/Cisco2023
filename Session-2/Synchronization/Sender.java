package com.simplilearn.synchronization;

public class Sender {
	
	void Send(String msg) {
		System.out.println("Sending msg.....: "+msg);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("Message Sent Successfully");
	}

}
