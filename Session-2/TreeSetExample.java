package com.simplilearn.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		//null values are not allowed
		//it maintains insertion order
		 Set<String> set= new TreeSet<String>();
		 set.add("Apple");
		 set.add("banana");
		 set.add("Almond");
		 //set.add(null);
		 
		 System.out.println(set);
		 
		 System.out.println("Size: "+set.size());
		 
		 System.out.println("Size: "+set.contains("Almond"));
		 
		 //itr using forLoop | iterator
	}

}
