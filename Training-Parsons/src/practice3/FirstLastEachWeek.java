package practice3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class FirstLastEachWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = new GregorianCalendar();
		calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_WEEK, -3);
		for (int i = 0; i < 52; i++) {
			System.out.println("Beginning: " + calendar.getTime());
			calendar.add(Calendar.DAY_OF_WEEK, 6);
			System.out.println("End: " + calendar.getTime());
			calendar.add(Calendar.DAY_OF_WEEK, 1);
		}
		
	}

}
