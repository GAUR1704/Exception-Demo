package com.prowings.exceptionDemo;

public class ExceptionWrapping {

	public static void main(String[] args) {

		System.out.println("Main method startted !!");

		myMethod(10, 0);

		System.out.println("Main method endded !!");

	}

	public static void myMethod(int i, int j) {
		
		System.out.println("my method startted");
		
		
		try {
			int result = i/j;
			
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("Take some action !!");
			
			NullPointerException npe = new NullPointerException("Some Massage !!!");
			
			throw npe;	
			
		}
		
		finally {
			
			System.out.println("FInally Executed !!!");
		}
		
	System.out.println("My Method Ended");

}

}
