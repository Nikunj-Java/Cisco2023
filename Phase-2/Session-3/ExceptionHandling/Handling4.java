package com.simplilearn.exceptionhandling;

public class Handling4 {
	
	public static void main(String[] args) {
		
		try {
			int result= 10/8;
			
			System.out.println("Result is: "+result);
			
			int a[]= {1,2,3,4,5};
			System.out.println("Value at index 4: "+a[4]);
			
			String name=null;
			name.equals("user");
			
			Thread.sleep(1000);
		} catch (ArithmeticException e) {
			System.out.println("Arithmatic:"+e);
			// TODO: handle exception
		}catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
			System.out.println("Array:"+e);
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Null pointer:"+e);
		}catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Thread:"+e);
		}
		//should keep this at the end
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Common:"+e);
		}
		
		
	}

}
