package com.simplilearn.arrays;

public class MultiDimensionalArray {
	
	public static void main(String[] args) {
		
		//multi dimenaional array
		int array[][]= {{1,2,3},{3,6,9},{3,2,9}};
		
		System.out.println("Access first row first Element: "+array[0][0]);
		System.out.println("Access first row second Element: "+array[0][1]);
		System.out.println("Access first row third Element: "+array[0][2]);
		
		
		for(int row=0; row<3; row++) {
			
			for(int col=0; col<3; col++) {
				System.out.print(array[row][col]+"\t");
			}
			System.out.println();
			
		}
		
		
	}

}
