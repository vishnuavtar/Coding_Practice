package TimeDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeDate {
	
	public static void main(String[] args) {
		
		DateTimeFormatter t = DateTimeFormatter.ofPattern("yy/mm/dd hh:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(t.format(now));
		
		Date date = new Date();
		
		System.out.println(date);
	}

}
