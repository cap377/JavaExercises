package com.siriuscom.training;

/**
 * @author IEUser
 *
 */
public class HelloWorld {

	String msg;
	static int numOfMsg = 0;
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		numOfMsg++;
		++numOfMsg;
	}

}
