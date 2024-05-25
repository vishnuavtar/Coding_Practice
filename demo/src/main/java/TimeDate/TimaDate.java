package TimeDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TimaDate {
	
	public static void main(String[] args) {
		
		DateTimeFormatter t = DateTimeFormatter.ofPattern("yy/mm/dd h:m:s");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(t.format(now));
		
		Date date = new Date();
		System.out.println(date);
	}

}
