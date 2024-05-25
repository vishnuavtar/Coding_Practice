package TimeDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class DAte {
	
	public static void main(String[] args) {
		
		DateTimeFormatter d =  DateTimeFormatter.ofPattern("yy/mm/dd h:m:s");
		LocalDateTime t = LocalDateTime.now();
		System.out.println(d.format(t));
		
		
		Date date  = new Date();
		System.out.println(date);
	}

}
