package com.prowings.exceptionDemo;

public class NestedException {

	public static void main(String[] args) {
		
		System.out.println("Main method startted !!");
		
		try {
			
			System.out.println("Inside try block !!");
			
			int result = 10/2;
			System.out.println("Result is : " + result);
			
			try {
				
				int[] a = {1, 2, 3, 4};
				
				result = a[4]/0;
				
				System.out.println("Result : " +result);
				
			}
			
			catch(ArithmeticException e){
				
				System.out.println("Inside inner try block");
			}
			
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Inside catch block");
			
		}
		
		finally {
			
			System.out.println("Inside finally block !!");
		}
		
		System.out.println("Main method ended !!!");

	}

}
