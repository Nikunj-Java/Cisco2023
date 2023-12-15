package com.simplilearn.stringmethods;

public class StringMethods {
	
	public static void main(String[] args) {
		String s1="My Name is Nikunj";
		String s2= new String("My Name is Nikunj");
		
		
		char c= s1.charAt(1);
		System.out.println("Char at Index 1: "+c);
		
		System.out.println("UPPERCASE: "+s1.toUpperCase());
		System.out.println("lowercase: "+s1.toLowerCase());
		System.out.println("Contains word: Nikunj :"+s1.contains("Nikunj"));
		
		//substring
		
		System.out.println("Substring between 2 to 7: "+s1.substring(2,7));
		
		//split
		
		String result[] =s1.split(" ");
		
		for(String s: result) {
			System.out.println(s);
		}
		
		//comparison
		String s3="hello world";
		String s4="Hello World";
		
		if(s3.equals(s4)) {
			System.out.println("Validated");
		}
		else {
			System.out.println("Not Vallidated");
		}
		
		//case of equal ignoreCase
		
		if(s3.equalsIgnoreCase(s4)) {
			System.out.println("Validated with equal ignore case");
		}else {
			System.out.println("Not Valild");
		}
		//comparison using ==
		if(s3==s4) {
			System.out.println("Valid");
		}else 
		{
			System.out.println("Not Valid");
		}
	}

}
