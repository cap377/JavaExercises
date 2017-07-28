package com.siriuscom.training.errors;

// Custom exception class for catching negative numbers

public class NegativeNumberException extends Exception {
	
	/**
	 * serialVersionUID is necessary to not trigger multiple custom exceptions
	 */
	private static final long serialVersionUID = -1476105781713383983L;
	public NegativeNumberException() {}
	
	public NegativeNumberException(String message) {
		super(message);
	}
	public String getMessage(int num) {
		return num + " is not a positive number. It has been replaced with 0.";
	}
}
