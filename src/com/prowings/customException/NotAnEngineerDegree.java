package com.prowings.customException;

public class NotAnEngineerDegree extends RuntimeException {

	public NotAnEngineerDegree() {
		
		super();
	}

	public NotAnEngineerDegree(String message, Throwable cause) {
		
		super(message, cause);
	}

	public NotAnEngineerDegree(String message) {
		
		super(message);
	}

	public NotAnEngineerDegree(Throwable cause) {
		
		super(cause);
	}
	
	

}
