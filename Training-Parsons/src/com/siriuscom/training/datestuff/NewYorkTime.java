package com.siriuscom.training.datestuff;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class NewYorkTime {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		DateFormat sdf = new SimpleDateFormat("EEE MMM yyyy hh:mm:ss z");
		sdf.setCalendar(calendar);
		System.out.println(sdf.format(calendar.getTime()));

	}
}
