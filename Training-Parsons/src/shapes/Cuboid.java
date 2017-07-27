package shapes;

// Generic cuboid class that takes in parameters that extend the number class

public class Cuboid<T> {
	
	Number length;
	Number breadth;
	Number height;
	
	public <T extends Number> Cuboid(T length, T breadth, T height){
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	public String toString() {
		String output = "Length: " + length.toString() + "\tBreadth: " + breadth.toString() + "\tHeight: " + height.toString();
		return output;
	}
	
	public Double getVolume() {
		return length.doubleValue() * breadth.doubleValue() * height.doubleValue();
	}
	
	public <T extends Number> void setLength(T newLength){
		this.length = newLength;
	}
	public <T extends Number> void setBreadth(T newBreadth){
		this.breadth = newBreadth;
	}
	public <T extends Number> void setHeight(T newHeight){
		this.height = newHeight;
	}
	
	public Number getLength(){
		return this.length;
	}
	public Number getBreadth(){
		return this.breadth;
	}
	public Number getHeight(){
		return this.height;
	}
}
