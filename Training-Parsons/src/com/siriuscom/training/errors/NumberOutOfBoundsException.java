package com.siriuscom.training.errors;

//Custom exception class for catching numbers over 100

public class NumberOutOfBoundsException extends Exception {
	
	/**
	 * serialVersionUID is necessary to not trigger multiple custom exceptions
	 */
	private static final long serialVersionUID = 1757325355085960834L;
	public NumberOutOfBoundsException() {}
	
	public NumberOutOfBoundsException(String message) {
		super(message);
	}
	public String getMessage(int num) {
		return num + " is greater than 100. It has been replaced with 100.";
	}
}
