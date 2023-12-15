package com.simplilearn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
	
	public static void main(String[] args) {
		
		//Expressions
		//[abc] - finds one character from the option in between
		//[^abc]- find one character not from the given
		//[0-9] - find one number from range 0-9
		//[a-z] - find any char from a to z
		// n+   - Matches any String that contains atleast one n
		
		String regex="[a-z]+";
		
		String input="hello";
		
		//task: take an input from user and check the same
		
		Pattern pattern= Pattern.compile(regex);
		
		Matcher match= pattern.matcher(input);
		
		if(match.matches()) {
			System.out.println("Pattern Matched");
		}else {
			System.out.println("Invalid Input");
		}
	}

}
