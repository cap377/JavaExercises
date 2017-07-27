package com.siriuscom.training.datestuff;

// Returns the first and last day of the week for every week in the year, starting this week

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class FirstLastEachWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = new GregorianCalendar();
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		for (int i = 0; i < 52; i++) {
			System.out.println("Beginning: " + calendar.getTime());
			calendar.add(Calendar.DAY_OF_WEEK, 6);
			System.out.println("End: " + calendar.getTime());
			calendar.add(Calendar.DAY_OF_WEEK, 1);
		}
		
	}

}