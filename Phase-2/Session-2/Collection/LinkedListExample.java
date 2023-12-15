package com.simplilearn.collections;

import java.util.LinkedList;

public class LinkedListExample {
	
	
	public static void main(String[] args) {
		//data not stored in contiguous memory locations
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(78);
		list.add(56);
		list.add(23);
		list.add(45);
		
		System.out.println("Size: "+list.size());
		System.out.println(list);
		
		System.out.println("Element 2: "+ list.get(2));
		
		System.out.println("First Element: "+list.getFirst());
		
		System.out.println("Last Element: "+list.getLast());
		
		//methods: remove,add,add(index,element)
		
		//iterate using for loop /iterator
		
	}

}
