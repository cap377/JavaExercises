package practice3.map;

// Driver for custom map class

public class MapDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m = new Map();
		String car1name = "GT-R";
		int car1year = 1989;
		String car2name = "Capri";
		int car2year = 1969;
		m.put(car1name, car1year);
		m.put(car2name, car2year);
		System.out.println(m.toString(car1name));
		System.out.println(m.toString(car2name));
	}

}
