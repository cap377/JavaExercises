package shapes;

public class Circle implements Shape<Integer> {

	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.1415 * this.radius * this.radius;
	}
	
	public double getVolume() {
		return 0.0;
	}
	
}
