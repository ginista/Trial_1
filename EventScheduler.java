package day17;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EventScheduler {

	public static void main(String[] args) {
		LocalDateTime eventdt = LocalDateTime.of(2023, 11, 10, 15,30);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		
		//parse 
		System.out.println("Event Schedule on "+eventdt.format(formatter));

		//Check if the event is happened or not
		LocalDateTime currentdatetime = LocalDateTime.now();
		
		if(currentdatetime.isAfter(eventdt)) {
			System.out.println("Event is already completed");
		}
		else {
			System.out.println("Event is yet to happen...");
		}
	}

}
