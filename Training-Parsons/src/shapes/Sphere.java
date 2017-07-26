package shapes;

public class Sphere implements Shape<Integer> {
	
	private int radius;
	
	public Sphere(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return this.radius * this.radius * 3.1415;
	}
	public double getVolume() {
		return this.radius * this.radius * this.radius * 3.1415 * (4/3);
	}
}
