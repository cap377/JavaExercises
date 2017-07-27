package com.siriuscom.training.datestuff;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TenBeforeAfter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat("dd:MM:yyyy");
		Calendar c = Calendar.getInstance();
		System.out.println("Current:\t" + format.format(c.getTime()));
		Calendar before = Calendar.getInstance();
		before.add(Calendar.DAY_OF_MONTH, -10);
		System.out.println("10 before:\t" + format.format(before.getTime()));
		Calendar after = Calendar.getInstance();
		after.add(Calendar.DAY_OF_MONTH, 10);
		System.out.println("10 after:\t" + format.format(after.getTime()));
	}

}
