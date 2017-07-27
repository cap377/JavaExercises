package com.siriuscom.training.errors;

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
