package practice3.datestuff;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class NewYorkTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeZone newYork;
		newYork = TimeZone.getTimeZone("America/New_York");
		Calendar calendar;
		calendar = new GregorianCalendar(newYork);
		int hour = calendar.HOUR_OF_DAY;
		int minute = calendar.MINUTE;
		int second = calendar.SECOND;
		System.out.println("New York time: " + hour + ":" + minute + ":" + second);
	}
}
