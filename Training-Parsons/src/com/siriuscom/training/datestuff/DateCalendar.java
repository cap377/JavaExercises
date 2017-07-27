package com.siriuscom.training.datestuff;

// converts calendars to dates and vis versa

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateCalendar {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		Date d = new Date();
		
		System.out.println(calendarToDate(c).toString());
		System.out.println(dateToCalendar(d).getTime());
	}
	public static Date calendarToDate(Calendar c) {
		Date newDate = c.getTime();
		return newDate;
	}
	public static Calendar dateToCalendar(Date d) {
		Calendar newCalendar = Calendar.getInstance();
		newCalendar.setTime(d);
		return newCalendar;
	}
}
