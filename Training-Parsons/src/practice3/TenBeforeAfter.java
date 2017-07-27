package practice3;

// Function that returns the current date and the dates 10 days before and after that date.

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TenBeforeAfter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat("dd:MM:yyyy");
		Calendar c = new GregorianCalendar();
		System.out.println("Current:\t" + format.format(c.getTime()));
		Calendar before = new GregorianCalendar();
		before.add(Calendar.DAY_OF_MONTH, -10);
		System.out.println("10 before:\t" + format.format(before.getTime()));
		Calendar after = new GregorianCalendar();
		after.add(Calendar.DAY_OF_MONTH, 10);
		System.out.println("10 after:\t" + format.format(after.getTime()));
	}

}
