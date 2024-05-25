package TimeDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Dare1 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter t = DateTimeFormatter.ofPattern("YY/MM/DD hh:mm:ss");
		LocalDateTime d = LocalDateTime.now();
		System.out.println(t.format(d));
		
		Date date = new Date();
		System.out.println(date);
		
	}

}
