package practice3;

public class FindRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(quadratic(1,4,-21));
	}
	
	public static double quadratic(int a, int b, int c) {
		double root1 = -b + Math.sqrt((b*b - (4*a*c))/(2*a));
		double root2 = -b - Math.sqrt((b*b - (4*a*c))/(2*a));
		if (root1 < 0 && root2 > 0) {
			return root2;
		}
		else {
			return root1;
		}
	}

}
