package day17;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class DateandTime {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Today's Date : "+today);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("Curret time : "+currentTime);
		
		LocalDateTime currentdatetime = LocalDateTime.now();
		System.out.println("Current Date & Time: "+currentdatetime);
		
		ZonedDateTime currentzone = ZonedDateTime.now();
		System.out.println("Current date and time with zone "+currentzone.now());

		Duration duration = Duration.ofHours(2);
		System.out.println("Duration of two hours: "+duration);
	}

}
