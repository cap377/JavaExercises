package com.siriuscom.training.shapes;

public class Rectangle implements Shape<Integer>{
	
	int length;
	int height;
	
	public Rectangle (int length, int height) {
		this.length = length;
		this.height = height;
	}
	
	public double getArea() {
		return this.length * this.height;
	}
	public double getVolume() {
		return 0;
	}
}
