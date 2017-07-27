package com.siriuscom.training;

// takes in a number of bytes and returns the largest measurement up to gigabytes

public class Bytes {

	public static void main(String[] args) {
		int bytes = 1532300024;
		int pre = 0;
		int post = 0;
		if (bytes < 1000) {
			pre = bytes;
			System.out.println(pre + "." + post + " Bytes");
		}
		else if (bytes < 1000000) {
			pre = bytes/1000;
			post = bytes%1000;
			System.out.println(pre + "." + post + " KBytes");
		}
		else if (bytes < 1000000000) {
			pre = bytes/1000000;
			post = bytes%1000000;
			System.out.println(pre + "." + post + " MBytes");
		}
		else {
			pre = bytes/1000000000;
			post = bytes%1000000000;
			System.out.println(pre + "." + post + " GBytes");
		}
	}

}
