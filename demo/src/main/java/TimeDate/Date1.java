package TimeDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Date1 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter t = DateTimeFormatter.ofPattern("yy/dd/mm hh:mm:ss");
		LocalDateTime d = LocalDateTime.now();
		System.out.println(t.format(d));
		
		
		Date date = new Date();
		System.out.println(date);
	}

}
