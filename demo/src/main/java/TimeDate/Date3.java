package TimeDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import java.util.*;

public class Date3 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yy/mm/dd  h:m:s");
		
		LocalDateTime d = LocalDateTime.now();
		
		System.out.println(f.format(d));
		
		Date date = new Date();
		
		System.out.println(date);
	}

}
