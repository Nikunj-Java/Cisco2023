package com.simplilearn.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
	public static void main(String[] args) {
		//maintans insertion order
		
		//methods: put,get,remove,getKeys
		
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		
		map.put(1, "Nikunj");
		map.put(2, "Dilip");
		map.put(3, "Alex");
		
		map.put(4, null);
		map.put(null, "Soni");
		
		System.out.println(map);
		
		System.out.println("Get Element at key 3: "+map.get(3));
		System.out.println("Get Null Element: "+map.get(null));
		
		map.remove(4);
		
		System.out.println("After Remove: "+map);
		
		//iterate
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
