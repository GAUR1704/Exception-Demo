package com.prowings.exceptionDemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
            System.out.println("Inside try block");
            
            int result = 10 / 0;
            
            System.out.println("Result: " + result);
            
        } 
		
		catch (ArithmeticException e) {
			
            System.err.println("Caught an exception: "); 
        } 
		
		finally {
			System.out.println("First finally block - Cleanup operation 1");
		}

        System.out.println("Outside try-catch-finally blocks");
    

	}

}
