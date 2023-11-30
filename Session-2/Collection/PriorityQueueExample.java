package com.simplilearn.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	
	public static void main(String[] args) {
		
		//doesn't allows null value
		
		///1,2,3,4,5,6,7----->  []
		
		
		PriorityQueue<Integer> pQueue= new PriorityQueue<Integer>();
		pQueue.add(56);
		pQueue.add(78);
		pQueue.add(45);
		pQueue.add(87);
		System.out.println(pQueue);
		
		//top element
		System.out.println("Top: "+pQueue.peek());
		
		System.out.println("Printing the top element and removing: "+pQueue.poll());
		System.out.println(pQueue);
		
		pQueue.remove(87);
		System.out.println(pQueue);
		
		//itr the pQueue using forLoop | Iterator
		
		
		
	}

}
