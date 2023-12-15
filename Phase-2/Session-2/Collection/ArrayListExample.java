package com.simplilearn.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		System.out.println("Size of list: "+list.size());
		
		
		list.add("Apple");
		list.add("Banana");
		list.add("cherry");
		list.add("Banana"); //duplicate values are allowed in a list
		list.add(null);
		
		
		System.out.println("After Adding the elements: "+list.size());
		System.out.println(list);
		
		System.out.println("Element at index 4: "+list.get(4));
		
		list.add("Pizza");
		System.out.println(list);
		
		System.out.println("List contains Apple? : "+list.contains("Apple"));
		
		list.remove(0);
		System.out.println(list);
		
		for(String s:list) {
			System.out.println("Using For Loop: "+s);
		}
		
		//using iterator
		
		System.out.println();
		
		Iterator<String>itr= list.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Using Iterator: "+itr.next());
		}
		
		
		
		
		
	}

}
