package day17;

import java.util.Date;
import java.util.Calendar;

public class CalenderConcept {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Calendar calender = Calendar.getInstance();
		calender.set(2023, Calendar.NOVEMBER,6);
		
		//get the data
		int year = calender.get(Calendar.YEAR);
		int month = calender.get(Calendar.MONTH);
		int day = calender.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("Date+ "+year+"-"+(month+1)+"-"+day);//month starts from 0 that's why adding 1 to it.

		
		Date d = new Date();
		System.out.println(d.getDate());
		
	}

}
