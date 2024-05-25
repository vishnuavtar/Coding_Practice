package TimeDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class d23 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:MM:SS");
		
		LocalDateTime t = LocalDateTime.now();
		
		System.out.println(f.format(t));
		
		Date date = new Date();
		
		System.out.println(date);
	}

}
