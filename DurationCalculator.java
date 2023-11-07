package day17;

import java.time.Duration;
import java.time.Instant;

public class DurationCalculator {

	public static void main(String[] args) {
		// Calculate of duration using instant
		Instant start = Instant.now();
		System.out.println(start);
		
		//perform some operation
		try {
			Thread.sleep(5000);//5000 millisecond = 5 second
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		Instant end = Instant.now();
		
		Duration duration = Duration.between(start, end);
		System.out.println("Time taken for the operation: "+duration.getSeconds()+ " seconds.");

	}

}
