package practice3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDisplay {

	public static void main(String[] args) {
		
		Date rightNow = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("dd::MMM::yyy");
		String date = "";
		date = format1.format(rightNow);
		System.out.println(date);
		
		SimpleDateFormat format2 = new SimpleDateFormat("dd::MMM::yyy hh::mm::ss");
		date = format2.format(rightNow);
		System.out.println(date);
		
		SimpleDateFormat format3 = new SimpleDateFormat("yyyy-M-dd");
		SimpleDateFormat format4 = new SimpleDateFormat("h:mm:ss");
		date = format3.format(rightNow);
		String date2 = format4.format(rightNow);
		System.out.println(date + "T" + date2);
	}

}
