package com.prowings.customException;

public class UnderExperiencedExeption extends RuntimeException {

	public UnderExperiencedExeption() {
		
		super();
	}

	public UnderExperiencedExeption(String message, Throwable cause) {

		super(message, cause);
	}

	public UnderExperiencedExeption(String message) {

		super(message);
	}

	public UnderExperiencedExeption(Throwable cause) {

		super(cause);
	}
	
	

}
