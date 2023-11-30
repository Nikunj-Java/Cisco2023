package com.simplilearn.collections;

import java.util.Vector;

public class VectorExample {
	
	public static void main(String[] args) {
		
		
		Vector<String> list= new Vector<String>();
		
		System.out.println("Size: "+list.size());
		
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Apple");
		list.add(null);
		
		System.out.println("Size: "+list.size());
		System.out.println(list);
		
		System.out.println("List contains apple? : "+ list.contains("Apple") );
		
		list.remove(0);
		list.remove(null);
		System.out.println(list);
		
		
		//itr using ForLoop and Iterator
		
	}

}
