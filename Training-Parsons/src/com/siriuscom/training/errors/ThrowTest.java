package com.siriuscom.training.errors;

// Class with method throwing an exception

import java.io.IOException;

public class ThrowTest{

	public static void IOExceptionTest() throws IOException{
		int x = 5;
		if (x == 5){
			throw new IOException();
		}
		System.out.println("pls");
	}
}
