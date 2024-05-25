package TimeDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class RTime {
	
	public static void main(String[] args) {
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yy/mm/dd hh:mm:ss");
		LocalDateTime d = LocalDateTime.now();
		System.out.println(f.format(d));
		
		Date date = new Date();
		
		System.out.println(date);
	}

}
