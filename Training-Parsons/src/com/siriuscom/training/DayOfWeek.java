package com.siriuscom.training;

public class DayOfWeek {

	public static void main(String[] args) {

		int day = 23;
		int month = 3;
		int year = 1916;
		
		int daysSince1900 = 0;
		
		int monthCount = month;
		
		// adding the days in the years leading up to our year
		daysSince1900 += (year - 1900) * 365;
		
		// adding leap year days
		daysSince1900 += (year-1900)/4;
		
		// if leap year and january or february
		if (year % 4 == 0 && (month == 1 || month == 2)) {
			daysSince1900--;
		}
		
		// counting days in months leading up to our month
		monthCount--;
		while (monthCount > 0) {
			switch (monthCount) {
				case 1:
					daysSince1900+=31;
					break;
				case 2:
					daysSince1900+=28;
					break;
				case 3:
					daysSince1900+=31;
					break;
				case 4:
					daysSince1900+=30;
					break;
				case 5:
					daysSince1900+=31;
					break;
				case 6:
					daysSince1900+=30;
					break;
				case 7:
					daysSince1900+=31;
					break;
				case 8:
					daysSince1900+=30;
					break;
				case 9:
					daysSince1900+=31;
					break;
				case 10:
					daysSince1900+=30;
					break;
				case 11:
					daysSince1900+=31;
					break;
				case 12:
					daysSince1900+=30;
					break;
				default:
					System.out.println("Not a valid month");
					break;
			}
			monthCount--;
		}
		
		// add days in that month
		daysSince1900 += day;
		
		// print out date entered
		System.out.println("The date you entered is "+ month +"/"+day+"/"+year);
		
		// find out how which day of the week it is
		int dayOfWeek = daysSince1900 % 7;
		switch (dayOfWeek) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}
	}
}
