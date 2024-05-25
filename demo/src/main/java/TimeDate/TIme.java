package TimeDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class TIme {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		DateTimeFormatter t = DateTimeFormatter.ofPattern("yy/mm/dd hh:mm:ss");
		LocalDateTime d = LocalDateTime.now();
		System.out.println(t.format(d));
	}

}
