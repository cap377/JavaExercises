package practice3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class FirstLastEachWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = new GregorianCalendar();
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		System.out.println(calendar.getTime());
		System.out.println(calendar.DAY_OF_WEEK);
	}

}
