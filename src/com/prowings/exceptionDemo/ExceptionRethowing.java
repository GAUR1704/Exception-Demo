package com.prowings.exceptionDemo;

public class ExceptionRethowing {

	public static void main(String[] args) {

		System.out.println("Main method startted");

		myMethod(10, 0);

		System.out.println("Main Method ended");
	}

	public static void myMethod(int i, int j) {

		System.out.println("My method startted");

		try {
			int result = i / j;
			System.out.println("Result : " + result);

		}

		catch (ArithmeticException e) {

			System.out.println("Take some action");

			throw e;

		}

		finally {

			System.out.println("Finally Executed");
		}

		System.out.println("My method ended !!!");

	}

}
