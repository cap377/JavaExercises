package com.siriuscom.training.shapes;

public class Square implements Shape<Integer> {

	private int side;
	
	public Square(int side) {
		this.side = side;
	}
	public double getArea() {
		return this.side * this.side;
	}
	public double getVolume() {
		return 0;
	}
	
}
